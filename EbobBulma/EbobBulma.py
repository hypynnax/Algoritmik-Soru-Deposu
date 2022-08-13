def ebob_bul(birinci_sayi, ikinci_sayi):

    bolen = 2
    ebob = 1

    while bolen <= min(birinci_sayi, ikinci_sayi):
        if (birinci_sayi % bolen == 0) and (ikinci_sayi % bolen == 0):
            ebob = bolen
        bolen += 1

    if ebob == 1:
        print("{} ve {} aralarında asal".format(birinci_sayi, ikinci_sayi))
    else:
        print(ebob)

ebob_bul(int(input("Bir sayi girin : ")), int(input("Bir sayi girin : ")))