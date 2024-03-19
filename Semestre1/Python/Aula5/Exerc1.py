#Faça um programa que leia um dia, mes e ano e diga se é valido ou não a data

dia = int(input("Digite o dia: "))
mes = int(input("Digite o mes(ex: 10): "))
ano = int(input("Digite o ano: "))


d4 = ano % 4 
d100 = ano % 100
d400 = ano % 400


if dia > 31 and (mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12):
    print("Opcao invalida")
elif dia > 30 and (mes == 4 or mes == 6 or mes == 9 or mes == 11):
    print("Opcao invalida")
elif dia > 28 and mes == 2:
    print("Opcao invalida")
elif dia > 29 and mes == 2 and (d4 == 0 or (d400 == 0 and(not d100))):
    print("Opcao invalida")
else :
    print("Opcao valida")
  