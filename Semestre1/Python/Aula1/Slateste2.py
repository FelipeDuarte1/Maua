num_lista = []
menor = 0
maior = 0

for c in range(5):
    num_lista.append(int(input(f'Digite um valor para a posicao {c}: ')))
    if c == 0:
        maior = menor = num_lista[c]
    else:
        if num_lista[c] > maior:
            maior = num_lista[c]
        elif num_lista[c] < menor:
            menor = num_lista[c]
print('$'*30)
print(f'Voce digitou os valores {num_lista}')
print(f'O maior valor digitao foi {maior}')
print(f'O menor valor digitado foi {menor}')