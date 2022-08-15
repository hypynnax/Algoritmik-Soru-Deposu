import random

def sansli_on_sayi():

    tekrar_sayisi = {}
    for i in range(1000000):
        rastgele = random.randint(1, 60)
        if rastgele in tekrar_sayisi:
            tekrar_etme_sayisi = tekrar_sayisi[rastgele]
            tekrar_sayisi[rastgele] = tekrar_etme_sayisi + 1
        else:
            tekrar_sayisi[rastgele] = 1

    print(tekrar_sayisi)

sansli_on_sayi()