def sayi_analizi(sayi):

    basamak_sayisi = 0
    tek_rakamlarin_toplami = 0
    cift_rakamlarin_toplami = 0

    while sayi > 0:

        basamak = sayi % 10

        if basamak % 2 == 0:
            cift_rakamlarin_toplami += basamak
        else:
            tek_rakamlarin_toplami += basamak

        basamak_sayisi += 1
        sayi = int(sayi / 10)
    else:
        print("Basamak sayısı : {}".format(basamak_sayisi))
        print("Tek rakamların toplamı : {}".format(tek_rakamlarin_toplami))
        print("Çift rakamların toplamı : {}".format(cift_rakamlarin_toplami))
        print("Tek ve çift rakamların farklarının mutlak değeri : {}".format(abs(tek_rakamlarin_toplami-cift_rakamlarin_toplami)))


sayi_analizi(int(input("Bir sayı girin : ")))