n1 = int(input("Digite o 1º digito: "))
n2 = int(input("Digite o 2º digito: "))
n3 = int(input("Digite o 3º digito: "))
n4 = int(input("Digite o 4º digito: "))
n5 = int(input("Digite o 5º digito: "))
n6 = int(input("Digite o 6º digito: "))
n7 = int(input("Digite o 7º digito: "))
n8 = int(input("Digite o 8º digito: "))
n9 = int(input("Digite o 9º digito: "))
n10 = int(input("Digite o 10º digito: "))
n11 = int(input("Digite o 11º digito: "))

a1 = (n1 * 10  + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7 * 4 + n8 * 3 + n9 * 2) * 10
print(a1)
a2 = a1 % 11 
a3 = a2 % 10
print(a2, a3)

b1 = (n1 * 11  + n2 * 10 + n3 * 9 + n4 * 8 + n5 * 7 + n6 * 6 + n7 * 5 + n8 * 4 + n9 * 3 + n10 * 2) * 10
print(b1)
b2 = b1 % 11
b3 =  b2 % 10
print(b2,b3)

if n1 == n2 == n3 == n4 == n5 == n6 == n7 == n8 == n9 == n10 == n11:
    print("Opcao invalida")
elif n10 != a3:
    print("Opcao invalida")
elif n11 != b3:
    print("Opcao invalida")
else :
    print("Opcao valida")

