def calcular_area(nombreFigura):
    def calcular(b, h):
        match nombreFigura.lower():
            case "triangulo":
                return b*h/2
            case "cuadrado":
                return b*h
            case _:
                return None
    return calcular
caTriangulo = calcular_area("triangulo")



fResto = lambda x,y : x % y


def mayusuculas(fun):
    def wrapper(*args, **kwargs):
        resultado = fun(*args, **kwargs)
        return resultado.upper()
    return wrapper

def concatena(cadena1, cadena2):
    return cadena1 + cadena2


def recursiva(base,exponente,limite):
    if(base**exponente > limite):
        return exponente - 1
    else:
        return recursiva(base,exponente + 1,limite)
valor = 0
def por5(numero):
    global valor
    valor = numero * 5
valor = 18
print(valor)