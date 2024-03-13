import turtle
from turtle import *

# Constantes
LADO = 300            # Lado da "janela" (canvas)
VELOCIDADE = 13       # Escala de 1 a 13

# Criação do canvas
clearscreen()             # Limpa a tela da execução anterior
setup(2*LADO, 2*LADO)     # Tamanho da janela
bgcolor('lightblue')      # Cor de fundo da tela 
c = ["red","blue", "yellow"]

tartaruga = Turtle()
tartaruga.speed(VELOCIDADE)  # Alterando a velocidade

for i in range(10):
    tartaruga.pencolor(c[i%3])
    for i in range(36):
        tartaruga.forward(10)
        tartaruga.right(10)
    tartaruga.right(36)
    

turtle.done()