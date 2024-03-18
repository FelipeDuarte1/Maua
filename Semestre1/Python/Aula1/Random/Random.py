import random

x = random.randint(1,10)
chute = int(input("Chute um numero: "))
while chute!=x:
    print ('tente novamente')
    chute = int(input())
print('aeeeeee')