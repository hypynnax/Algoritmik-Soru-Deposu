def binary_search(liste, aranan_sayi):

    liste_yedek = liste.copy()
    liste_yedek.sort()

    alt_sinir = 0
    ust_sinir = len(liste_yedek)-1

    while alt_sinir <= ust_sinir:

        orta_deger = int((ust_sinir + alt_sinir) / 2)

        if liste_yedek[orta_deger] == aranan_sayi:
            print("Eleman bulundu")
            return
        elif liste_yedek[orta_deger] > aranan_sayi:
            ust_sinir = orta_deger - 1
        else:
            alt_sinir = orta_deger + 1

    else:
        print("Eleman bulunamadı")

liste = [19, 28, 37, 46, 55, 64, 73, 82, 91]
binary_search(liste, 82)