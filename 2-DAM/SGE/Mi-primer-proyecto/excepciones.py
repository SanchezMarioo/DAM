import math


def resuelveEcuacion(a, b, c):
    assert a > 10
    try:
        resultadoPositivo = -b + math.sqrt(math.pow(b, 2) - (4 * a * c)) / 2
        resultadoNegativo = -b - math.sqrt(math.pow(b, 2) - (4 * a * c)) / 2
    