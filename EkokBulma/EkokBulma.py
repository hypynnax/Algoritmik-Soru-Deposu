def ekok_bul(birinci_sayi, ikinci_sayi):

    ekok = max(birinci_sayi, ikinci_sayi)

    while ekok <= birinci_sayi * ikinci_sayi:
        if (ekok % birinci_sayi == 0) and (ekok % ikinci_sayi == 0):
            print(ekok)
            return
        else:
            ekok += 1

ekok_bul(int(input("Bir sayi girin : ")), int(input("Bir sayi girin : ")))