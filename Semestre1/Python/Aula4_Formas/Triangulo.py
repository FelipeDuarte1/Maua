import turtle
from turtle import *

clearscreen()

lado = 300
velocidade = 6

setup(lado, lado)
bgcolor('lightblue')

t = Turtle()
t.speed(velocidade)

t.forward(50)
t.left(120)
t.forward(100)
t.left(120)
t.forward(100)
t.left(120)
t.forward(100)
t.left(135)
t.forward(70)
t.left(90)
t.forward(70)
t.penup()
t.hideturtle()

turtle.done()