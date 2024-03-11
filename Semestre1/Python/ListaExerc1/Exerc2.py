idade = int(input("Digite sua idade: "))

if idade < 2:
    print("Voce eh um bebezinho")
elif idade >= 3 and idade <=4:
    print("Voce eh crianca de colo")
elif idade >= 5 and idade <=13:
    print("Voce eh crianca")
elif idade >= 14 and idade <=20:
    print("Voce eh adolecente")
elif idade >= 21 and idade <=65:
    print("Voce eh adulto")
elif idade >= 66:
    print("Voce eh idoso")
#elif -->  encadeamento