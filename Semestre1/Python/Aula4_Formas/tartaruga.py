import turtle
from turtle import *

# Exercício 01

# Constantes
LADO = 300            # Lado da "janela" (canvas)
VELOCIDADE = 6        # Escala de 1 a 13

# Criação do canvas
clearscreen()             # Limpa a tela da execução anterior
setup(2*LADO, 2*LADO)     # Tamanho da janela
bgcolor('lightgray')      # Cor de fundo da tela

tartaruga = Turtle()
tartaruga.speed(VELOCIDADE)  # Alterando a velocidade

tartaruga.penup()  

tartaruga.goto(-100,100)

tartaruga.pendown()
tartaruga.forward(200)
tartaruga.right(90)
tartaruga.forward(200)
tartaruga.right(90)
tartaruga.forward(200)
tartaruga.right(90)
tartaruga.forward(200)
tartaruga.right(180)
tartaruga.forward(100)
tartaruga.circle(100)
turtle.done()
