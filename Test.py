import time

def OdeN ():
    i = 0
    Lista = []
    while i<10000:
        Lista = Lista + [i]
        i = i + 1
    BubbleSort (Lista)
    SelectionSort (Lista)
        
        

def BubbleSort (Lista):
    x = int(time.strftime("%S"))
    LenList = len(Lista)
    for i in range (LenList):
        for j in range (LenList-i-1):
            if (Lista[j] > Lista[j+1]):
                Aux = Lista[j]
                Lista[j] = Lista[j+1]
                Lista[j+1] = Aux
    y = int(time.strftime("%S"))
    print (y - x)
    ##print (Lista)

def SelectionSort (Lista):
    x = int(time.strftime("%S"))
    LenList = len(Lista)
    for i in range (LenList):
        temp = i
        for j in range (i,LenList):
            if ((Lista[temp] > Lista[j])):
                temp = j
        Aux = Lista[i]
        Lista[i] = Lista[temp]
        Lista[temp] = Aux
    y = int(time.strftime("%S"))
    print (y - x)
    ##print (Lista)

OdeN ()
