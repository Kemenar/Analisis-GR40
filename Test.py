import time
import random

## random.randint(0, 10000)

def OdeN (Var):
    i = 0
    Lista = []
    while i<Var:
        Lista = Lista + [i]
        i = i + 1
    print ("#######################################")
    print ("#Tiempo de ejecucion de forma Acedente#")
    print ("#######################################")
    BubbleSort (Lista)
    SelectionSort (Lista)
    while i<Var:
        Lista = Lista + [random.randint(0, Var)]
        i = i + 1
    print ("########################################")
    print ("#Tiempo de ejecucion de forma Aleatoria#")
    print ("########################################")
    BubbleSort (Lista)
    SelectionSort (Lista)
    while i<Var:
        Lista = Lista + [Var-i]
        i = i + 1
    print ("#########################################")
    print ("#Tiempo de ejecucion de forma Decendente#")
    print ("#########################################")
    BubbleSort (Lista)
    SelectionSort (Lista)
        
        

def BubbleSort (Lista):
    print ("Funcion del BubbleSort")
    print("Minutos inicial: " + time.strftime("%M"))
    print("Segundo Inicial: " + time.strftime("%S"))
    LenList = len(Lista)
    for i in range (LenList):
        for j in range (LenList-i-1):
            if (Lista[j] > Lista[j+1]):
                Aux = Lista[j]
                Lista[j] = Lista[j+1]
                Lista[j+1] = Aux
    print("Minutos Final: " + time.strftime("%M"))
    print("Segundo Final: " + time.strftime("%S"))
    print("_______________________")


def SelectionSort (Lista):
    print ("Funcion del SelectionSort")
    print("Minutos inicial: " + time.strftime("%M"))
    print("Segundo Inicial: " + time.strftime("%S"))
    LenList = len(Lista)
    for i in range (LenList):
        temp = i
        for j in range (i,LenList):
            if ((Lista[temp] > Lista[j])):
                temp = j
        Aux = Lista[i]
        Lista[i] = Lista[temp]
        Lista[temp] = Aux
    print("Minutos Final: " + time.strftime("%M"))
    print("Segundo Final: " + time.strftime("%S"))
    print("_______________________")


def Ejecutable ():
    Var = 1
    while Var <= 5:
        print("-----------------------------------------")
        print("Cantidad de elementos en la lista: " + str(Var))
        print("-----------------------------------------")
        OdeN (Var*10000)
        Var = Var + 1
    print ("Fin Del Programa")

Ejecutable ()
