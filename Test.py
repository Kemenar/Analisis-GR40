import time
import random

## random.randint(0, 10000)

def OdeN ():
    i = 0
    Lista = []
    while i<50000:
        Lista = Lista + [50000-i]
        i = i + 1
    BubbleSort (Lista)
    SelectionSort (Lista)
        
        

def BubbleSort (Lista):
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
    ##print (Lista)

def SelectionSort (Lista):
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
    ##print (Lista)

OdeN ()
