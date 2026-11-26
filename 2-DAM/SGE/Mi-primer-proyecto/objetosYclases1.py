class Vehiculo:
    total: float = 0.0
    nombreOculto: str
    tieneMotor: bool
    estado: str
    longitud: int
    __precio: float

    def __init__(self, nombreOculto, tieneMotor, estado, longitud, precio):
        self.nombreOculto = nombreOculto
        self.tieneMotor = tieneMotor
        self.estado = estado
        self.longitud = longitud
        self.__precio = float(precio)
        Vehiculo.total += self.__precio
    @property
    def nombre(self):
        return self.nombreOculto

    @nombre.setter
    def nombre(self, nombre):
        self.nombreOculto = nombre

    def mover(self):
        self.estado = "Moviendose"

    def parar(self):
        self.estado = "parado"
    @property
    def peso(self):
        return self.longitud * 3

    @classmethod
    def gasto(cls):
        print(f"Gasto acumulado: {cls.total}")
        return cls.total

    @staticmethod
    def informar():
        print("La clase ‘vehiculo’ sirve para crear todo tipo de vehículos")

    def __gt__(self, otro):
        return self.longitud > otro.longitud
