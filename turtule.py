import turtle
import time
turtle = turtle.Turtle()
turtle.shape("turtle")

turtle.pensize(10)

turtle.penup()
turtle.goto(0,-50)
turtle.pendown()
turtle.color("blue")
turtle.begin_fill()
turtle.circle(100)
turtle.end_fill()

turtle.color("black")
turtle.penup()
turtle.goto(300,150)
turtle.pendown()
turtle.left(135)
turtle.forward(100)

turtle.penup()
turtle.goto(300,-50)
turtle.pendown()
turtle.left(90)
turtle.forward(100)

turtle.penup()
turtle.goto(-200,225)
turtle.pendown()
turtle.left(0)
turtle.forward(100)


turtle.penup()
turtle.goto(-300,-70)
turtle.pendown()
turtle.left(90)
turtle.forward(100)
turtle.penup()
turtle.goto(-280,-50)
turtle.pendown()
turtle.forward(100)
turtle.penup()
turtle.goto(-260,-30)
turtle.pendown()
turtle.forward(100)

turtle.penup()
turtle.goto(-100,50)
turtle.pendown()
turtle.color("red")
turtle.begin_fill()
turtle.left(-45)
turtle.circle(100,-180)
turtle.end_fill()

turtle.penup()
turtle.goto(-100,50)
turtle.pendown()
turtle.color("red")
turtle.begin_fill()
turtle.right(180)
turtle.circle(50,180)
turtle.end_fill()

turtle.penup()
turtle.goto(100,50)
turtle.pendown()
turtle.color("blue")
turtle.begin_fill()
turtle.right(0)
turtle.circle(45,180)
turtle.end_fill()

turtle.penup()
turtle.setx(500)
turtle.sety(500)
turtle.pendown()

time.sleep(3)