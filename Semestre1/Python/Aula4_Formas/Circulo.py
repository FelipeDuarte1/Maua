import turtle
from turtle import *
# Constantes
LADO = 300            # Lado da "janela" (canvas)
VELOCIDADE = 13        # Escala de 1 a 13

# Criação do canvas
clearscreen()             # Limpa a tela da execução anterior
setup(2*LADO, 2*LADO)     # Tamanho da janela
bgcolor('lightgray')      # Cor de fundo da tela 

tartaruga = Turtle()
tartaruga.speed(VELOCIDADE)  # Alterando a velocidade


for i in range(360):
    tartaruga.forward(1)
    tartaruga.right(1)
    
turtle.done()