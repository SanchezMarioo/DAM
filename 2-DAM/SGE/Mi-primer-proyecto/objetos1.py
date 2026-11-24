class vegetal():
    totalV = 0
    def __init__(self,n,tipo,terreste,re):
        self.nombre = n
        self.tipo = tipo
        self.terrestre = terreste
        self.reproduccion = re
        vegetal.totalV += 1
    def setVegetal(self):
        nombre = self.nombre + ".txt"
        f1 = open(nombre, "w")
        f1.write(self.nombre + "-" + self.tipo + "-" +
                 str(self.terrestre)+ "-" +
                 self.reproduccion + "\n")
    def getVegetal(self):
        nombre = self.nombre + ".txt"
        f1 = open(nombre, "r")
        datos = f1.readline().strip().split("-")
        nombre = datos[0]
        tipo = datos[1]
        terrestre = datos[2]
        reproduccion = datos[3]
        print(f'{nombre=} {tipo=} {terrestre=} {reproduccion=}')
        f1.close()
#v1 = vegetal("Manzano", "arbol", True, "angioesperma")
#v1.setVegetal()
#v1.getVegetal()


class arbol(vegetal):
    caduca = bool
    def __init__(self, n,tipo,terreste,re,c):
        super().__init__(n,tipo,terreste,re)
        self.caduca = c
    def setVegetal(self):
        super().setVegetal()

        nombre = self.nombre + ".txt"
        f1 = open(nombre, "a")
        f1.write("-" + str(self.caduca))
        f1.close()
        