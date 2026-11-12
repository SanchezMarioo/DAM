numero = int(input("Dime un numero: "))

for i in range(1,11):
    if(i % 2 == 0):
        continue
    print(f"{numero} * {i} = {numero * i}")
texto = input("Dime un texto: ")
for _ in range(numero):
    print(texto)