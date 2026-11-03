import psycopg2

cadena_conexion = "dbname=dvdrental user = postgres password=MasterOfWorld"
conexion1 = psycopg2.connect(cadena_conexion)
cursor1 = conexion1.cursor()
cursor1.execute("SELECT * FROM ")
for fila in cursor1:

