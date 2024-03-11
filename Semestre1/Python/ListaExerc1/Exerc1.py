print("Digite um ano: ")
n = float(input())
d4 = n % 4 
d100 = n % 100
d400 = n % 400

if d4 == 0 or (d400 == 0 and(not d100)):
    print("O ano digitado é bisexto")
else:
    print("O ano digitado não é bisexto")
  