print("Digite o valor que deseja fatorar")
Valor = int(input())

x = 1
while (Valor > 1):
    x = Valor * x
    Valor -= 1
print(x)