import psycopg2

try:
    conexion = psycopg2.connect(
        host="localhost",  # Apunta a tu máquina que mapea el contenedor
        port=5433,  # Puerto mapeado en Docker (5432 por defecto)
        database="dvdrental",  # Nombre de la base de datos
        user="odoo",  # Usuario configurado en Docker
        password="odoo",
    )
    cursor1 = conexion.cursor()
    sql = "SELECT * FROM customer"
    cursor1.execute(sql)
    for i in cursor1:
        print(i)
except Exception:
    print("Error")
    conexion.rollback()
finally:
    conexion.close()
    cursor1.close()