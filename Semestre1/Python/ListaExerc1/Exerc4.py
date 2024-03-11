opcao = int(input("Escolha uma opção: \n 1 - Brinquedo bateria \n 2 - Brinquero pilha \n 3 - Brinquedo bateria reccaregavel \n"))
valorPedido = float(input("Valor do pedido: "))

if opcao == 1:
    if valorPedido > 1000:
        valorPedido = valorPedido - valorPedido * 0.1
elif opcao == 2:
    if valorPedido > 100:
        valorPedido = valorPedido - valorPedido * 0.05
elif opcao == 3:
    if valorPedido > 500:
        valorPedido = valorPedido - valorPedido * 0.1
    
print("O valor a pagar é : R$ {:.2f}".format(valorPedido))
    