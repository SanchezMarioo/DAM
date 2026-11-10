import psycopg2

conexion = psycopg2.connect(
    host="localhost",  # Apunta a tu máquina que mapea el contenedor
    port=5433,  # Puerto mapeado en Docker (5432 por defecto)
    database="dvdrental",  # Nombre de la base de datos
    user="odoo",  # Usuario configurado en Docker
    password="odoo",

)
id = int(input("Dime el identificador: "))
name = input("Dime el nombre: ")
correo = input("Dime el correo electronico: ")

datosPersonales = (str(id), name, correo)
sql = "INSERT INTO customer customer_id,first_name,email VALUES %s,%s,%s"
cursor1 = conexion.cursor()
cursor1.execute(sql,datosPersonales)

