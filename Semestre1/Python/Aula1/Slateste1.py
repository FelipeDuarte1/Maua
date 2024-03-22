lista = []
maior = 0
menor = 0

for i in range(5):
    print("Digite o ", (i+1), " valor")
    i = int(input())
    lista.append(i)
print(lista)

for c, v in enumerate(lista):
    if c == 0:
        maior = menor = lista[c]
    else:
        if lista[c] > maior:
            maior = lista[c]
        elif lista[c] < menor:
            menor = lista[c]
    print(f' Na posicao {c} encontrei o valor {v} !')
    
print('$'*30)
print(f'Voce digitou os valores {lista}')
print(f'O maior valor digitao foi {maior}')
print(f'O menor valor digitado foi {menor}')

    