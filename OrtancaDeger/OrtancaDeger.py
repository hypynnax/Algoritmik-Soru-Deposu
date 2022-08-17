def ortanca_deger(kelime):

    uzunluk = len(kelime)
    orta_deger = int(uzunluk/2)

    if uzunluk % 2 == 0:
        print(kelime[orta_deger-1], kelime[orta_deger])
    else:
        print(kelime[orta_deger])


ortanca_deger(input("Bir kelime girin : "))