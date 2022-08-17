def en_buyuk_ikinci_sayiyi_bul():

    en_buyuk_sayi = int(input("Bir sayı girin : "))
    en_buyuk_ikinci_sayi = 0

    for i in range(4):

        sayi = int(input("Bir sayı girin : "))

        if sayi > en_buyuk_sayi:
            en_buyuk_ikinci_sayi = en_buyuk_sayi
            en_buyuk_sayi = sayi
	elif sayi > en_buyuk_ikinci_sayi:
	    en_buyuk_ikinci_sayi = sayi

    print("En büyük ikinci sayı = {}".format(en_buyuk_ikinci_sayi))


en_buyuk_ikinci_sayiyi_bul()