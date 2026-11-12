numeroHijos = input("Dime el numero de hijos: ")
anioNacimiento = int(input("Dime el año de nacimiento: "))
convertirCadenaHijos = bool(input("Quieres transformar a entero el numero de hijos (True/False): "))
if(convertirCadenaHijos):
    numeroHijos = int(numeroHijos)

convertirCadenaAnio = bool(input("Quieres transformar a entero el año de nacimiento (True/False): "))
if(convertirCadenaAnio):
    anioNacimiento = int(anioNacimiento)

match (numeroHijos,anioNacimiento):
    case(int(), int()):
        print(f"El resultado de multiplicar {numeroHijos} * {anioNacimiento} = {numeroHijos * anioNacimiento }")
    case (str(), int()):
        numeroHijos = int(numeroHijos)
        print(f"El resultado de multiplicar {numeroHijos} * {anioNacimiento} = {numeroHijos * anioNacimiento }")
    case(int(), str()):
        anioNacimiento = int(anioNacimiento)
        print(f"El resultado de multiplicar {numeroHijos} * {anioNacimiento} = {numeroHijos * anioNacimiento }")
    case(str(), str()):
        numeroHijos = int(numeroHijos)
        anioNacimiento = int(anioNacimiento)
        print(f"El resultado de multiplicar {numeroHijos} * {anioNacimiento} = {numeroHijos * anioNacimiento }")
    case _:
        print("Opcion no valida")