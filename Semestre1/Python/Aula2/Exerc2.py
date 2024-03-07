import math
print("Digite o valor do lado do pentagono:")
valorLado = float(input())

Area = (5 * valorLado**2) / (4 * math.tan(math.radians(36)))

print('A area do pentagono equivale a ', Area)

