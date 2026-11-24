import psycopg2

conexion = None
cursor1 = None

try:
    conexion = psycopg2.connect(
        host="localhost",
        port=5433,
        database="dvdrental",
        user="odoo",
        password="odoo",
    )
    cursor1 = conexion.cursor()
    cursor1.execute("SELECT * FROM customer")
    for fila in cursor1:
        print(fila)
except Exception as e:
    print("Error real:", repr(e))
    if conexion is not None:
        conexion.rollback()
finally:
    if cursor1 is not None:
        cursor1.close()
    if conexion is not None:
        conexion.close()