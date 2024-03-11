caracter = input("Digite um único caractere: ")

# Obtém o valor decimal do caractere usando a função ord()
decimal = ord(caracter)

# Verifica se o caractere é uma letra maiúscula
if 65 <= decimal <= 90:
    print("O caractere é uma letra maiúscula.")
# Verifica se o caractere é uma letra minúscula
elif 97 <= decimal <= 122:
    print("O caractere é uma letra minúscula.")
# Verifica se o caractere é um algarismo decimal
elif 48 <= decimal <= 57:
    print("O caractere é um algarismo decimal.")
# Se o caractere não se enquadra em nenhuma das categorias anteriores, é um caractere especial
else:
    print("O caractere é um caractere especial.")