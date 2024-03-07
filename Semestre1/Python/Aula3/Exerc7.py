idade = int(input("Digite sua idade: "))

if idade < 5:
    print("Voce eh um bebezinho")
else:
    if idade >= 5 and idade <=7:
        print("Voce eh infantil A")
    else:
         if idade >= 8 and idade <=10:
            print("Voce eh infantil B")
         else:
            if idade >= 11 and idade <=13:
                print("Voce eh juvenil A")
            else:
                 if idade >= 14 and idade <=17:
                    print("Voce eh juvenil B")
                 else:
                     print("Voce eh adulto")
#elif -->  encadeamento