/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConexionBD.ConexionBD;
import java.sql.*;

/**
 *
 * @author Mario
 */
public class TorneoDAO {

    public void crearBaseDatos() throws SQLException {
        try (Connection conexion = ConexionBD.conectarServidor(); Statement st = conexion.createStatement()) {
            st.executeUpdate("CREATE DATABASE IF NOT EXISTS torneo");
        }
    }

    private void ejecutar(String sql) throws SQLException {
        try (Connection conexion = ConexionBD.conectar(); Statement st = conexion.createStatement()) {

            st.executeUpdate(sql);
        }
    }

    public void crearTablas() throws SQLException {
        String sqlEquipos = """
                CREATE TABLE IF NOT EXISTS equipos (
                    id_equipo INT PRIMARY KEY,
                    nombre VARCHAR(40) NOT NULL UNIQUE,
                    ciudad VARCHAR(40) NOT NULL DEFAULT 'Salamanca',
                    fecha_creacion DATE
                );
                """;
        String sqlJugadores = """
                CREATE TABLE IF NOT EXISTS jugadores (
                    nick VARCHAR(20) PRIMARY KEY,
                    nombre VARCHAR(30) NOT NULL,
                    edad INT NOT NULL CHECK (edad >= 16),
                    rol VARCHAR(20) NOT NULL DEFAULT 'Suplente',
                    puntos INT DEFAULT 0 CHECK (puntos >= 0),
                    id_equipo INT,
                    FOREIGN KEY (id_equipo) REFERENCES equipos(id_equipo)
                );
                """;
        ejecutar(sqlEquipos);
        ejecutar(sqlJugadores);
    }

    public int[] insertDatosInciales() throws SQLException {
        int filasEquipos = 0;
        int filasJugadores = 0;
        try (Connection connection = ConexionBD.conectar()) {
            connection.setCatalog("torneo");

            // No se pone ciudad para que aplique DEFAULT 'Salamanca'
            String sqlEquipo1 = "INSERT INTO equipos (id_equipo, nombre, fecha_creacion) VALUES (?, ?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(sqlEquipo1)) {
                ps.setInt(1, 1);
                ps.setString(2, "Lobos del Tormes");
                ps.setDate(3, Date.valueOf("2023-09-15"));
                filasEquipos += ps.executeUpdate();
            }

            String sqlEquipo2 = "INSERT INTO equipos (id_equipo, nombre, ciudad, fecha_creacion) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(sqlEquipo2)) {
                ps.setInt(1, 2);
                ps.setString(2, "Titanes de Zamora");
                ps.setString(3, "Zamora");
                ps.setDate(4, Date.valueOf("2024-01-20"));
                filasEquipos += ps.executeUpdate();
            }

            // 3. Omite 'ciudad' (DEFAULT) y deja 'fecha_creacion' a NULL con el object con nullo
            String sqlEquipo3 = "INSERT INTO equipos (id_equipo, nombre, fecha_creacion) VALUES (?, ?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(sqlEquipo3)) {
                ps.setInt(1, 3);
                ps.setString(2, "Halcones Charros");

                ps.setObject(3, null);
                filasEquipos += ps.executeUpdate();
            }
            String sqlJugador1 = "INSERT INTO jugadores (nick, nombre, edad, rol, puntos, id_equipo) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(sqlJugador1)) {
                ps.setString(1, "sombra");
                ps.setString(2, "Lucia");
                ps.setInt(3, 17);
                ps.setString(4, "Capitana");
                ps.setInt(5, 120);
                ps.setInt(6, 1);
                filasJugadores += ps.executeUpdate();
            }

            // 2. Omite 'rol' y 'puntos' para que se apliquen sus valores DEFAULT
            String sqlJugadorSinRolNiPuntos = "INSERT INTO jugadores (nick, nombre, edad, id_equipo) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(sqlJugadorSinRolNiPuntos)) {
                ps.setString(1, "rayo");
                ps.setString(2, "Mario");
                ps.setInt(3, 18);
                ps.setInt(4, 1);
                filasJugadores += ps.executeUpdate();
            }

            // 3. Omite 'rol' para que aplique DEFAULT, pero indica 'puntos'
            String sqlJugadorSinRol = "INSERT INTO jugadores (nick, nombre, edad, puntos, id_equipo) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(sqlJugadorSinRol)) {
                ps.setString(1, "tanque");
                ps.setString(2, "Hugo");
                ps.setInt(3, 16);
                ps.setInt(4, 40);
                ps.setInt(5, 2);
                filasJugadores += ps.executeUpdate();
            }
        }
        return new int[]{filasEquipos, filasJugadores};
    }

    public void añadirTabla() throws SQLException {
        String sqlAlter = "ALTER TABLE jugadores ADD COLUMN email VARCHAR(80) UNIQUE;";
        ejecutar(sqlAlter);
    }

    public void borrarTablas() throws SQLException {
        String dropEquipos = "DROP TABLE IF EXISTS equipos;";
        String dropJugadores = "DROP TABLE IF EXISTS jugadores;";
        ejecutar(dropJugadores);
        ejecutar(dropEquipos);
    }
}
