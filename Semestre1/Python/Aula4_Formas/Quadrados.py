import turtle
from turtle import *
# Constantes
LADO = 300            # Lado da "janela" (canvas)
VELOCIDADE = 6        # Escala de 1 a 13

# Criação do canvas
clearscreen()             # Limpa a tela da execução anterior
setup(2*LADO, 2*LADO)     # Tamanho da janela
bgcolor('lightblue')      # Cor de fundo da tela

tartaruga = Turtle()
tartaruga.speed(VELOCIDADE)  # Alterando a velocidade

tartaruga.left(45)
tartaruga.forward(150)
tartaruga.right(90)
tartaruga.forward(150)
tartaruga.right(90)
tartaruga.forward(150)
tartaruga.right(90)
tartaruga.forward(300)
tartaruga.left(90)
tartaruga.forward(150)
tartaruga.left(90)
tartaruga.forward(150)
tartaruga.left(90)
tartaruga.forward(150)
turtle.done()