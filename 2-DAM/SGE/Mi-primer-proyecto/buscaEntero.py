texto = input("Dame un texto: ")
i = 0
encontro = False
while i < len(texto):

    if(texto[i].isnumeric()):
        encontro = True
        break
    else:
        i+=1
if(encontro):
    print(f"Se ha encontrado un número ({texto[i]}).")
else:
    print("¡Vaya! No se encontro ningun numero en este texto.")
