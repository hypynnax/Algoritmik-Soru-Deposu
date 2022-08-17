import random


def sayi_tahmin_oyunu():

    bilgisayar = random.randint(1, 10)
    adim_sayisi = 0

    while True:

        kullanici = int(input("Bir sayı tahmin edin : "))

        if kullanici == bilgisayar:
            if adim_sayisi == 0:
                print("Tebrikler doğru tahmin\nilk adımda buldun")
            else:
                print("Tebrikler doğru tahmin\n{} adımda buldun".format(adim_sayisi+1))
                break
        elif kullanici > bilgisayar:
            print("Daha küçük bir sayi girin : ")
            adim_sayisi += 1
        else:
            print("Daha büyük bir sayi girin : ")
            adim_sayisi += 1


sayi_tahmin_oyunu()