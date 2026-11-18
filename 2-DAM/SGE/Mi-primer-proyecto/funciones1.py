def mayor(x, y):
    'Imprime que numero es mayor'
    if (x > y):
        print(f"El numero {x} es mayor que {y} ")
    else:
        print(f"El numero {y} es mayor que {x} ")


def area(altura, base=8):
    'Calcula el area a partir de una base y una altura'
    return base * altura


def suma(*args):
    total = 0
    for i in args:
        total += i
    return total


numeros = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)



def peque(**kwargs):
    return min(kwargs.items())




def repetir(texto, /, *, repeticiones):
    for i in range(repeticiones):
        print(texto)

def funcion(funcion1,funcion2):
    funcion1
    print(funcion2)

funcion(mayor(2,5), peque(salon=25, cocina=12, bano=6, dormitorio=15))

help(mayor)
help(area)