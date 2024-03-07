import math

print("Digite os valores de a, b e c, nesta ordem: ")
a = float(input())
b = float(input())
c = float(input())

delta = b**2 - 4 * a * c

x1 = (-b - (delta)**0.5) / (2 * a)
x2 = (-b + (delta)**0.5) / (2 * a)

if a == 0:
    print("Não é possivel fazer a equação de 2º")
else:
    if delta < 0 :
        print("Não é possivel calcular")
    else:
        print("O delta deu:", delta, "x1: ", x1, "x2: ", x2)