valorInicial = float(input("Digite a ultima medição: "))
valorFinal = float(input("Digite a atual medição: "))

UnidadesConsumida = valorFinal - valorInicial
conta = 0
if UnidadesConsumida <= 100:
    conta = UnidadesConsumida * 0.5
elif 101 <= UnidadesConsumida <= 200:
    conta = 50 + (UnidadesConsumida - 100) * 1
elif 201 <= UnidadesConsumida <= 300:
    conta = 150 + (UnidadesConsumida - 200) * 1.5
elif UnidadesConsumida >= 300:
    conta = 300 + (UnidadesConsumida - 300) * 2
    
print("Sua conta eletrica será de: R$ {:.2f}".format(conta))