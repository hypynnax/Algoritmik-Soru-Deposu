def asal_sayilari_yazdir(sayi):
    for i in range(2, sayi+1):
        halen_asal = True
        for j in range(2, i):
            if i % j == 0:
                halen_asal = False
                break
        if halen_asal == True:
            print(i, end=", ")

asal_sayilari_yazdir(int(input("Bir sayı girin : ")))