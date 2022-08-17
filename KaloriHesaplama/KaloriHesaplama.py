def kalori_hesaplama():

    cinsiyet = input("Cinsiyetinizi girin : ")
    adim_sayisi = int(input("Adım sayısını girin : "))
    kalori = 0

    if cinsiyet.lower() == "kadın":
        kalori = adim_sayisi * 30 / 500
        print("Yakılan kalori miktarı : {}".format(kalori))
    elif cinsiyet.lower() == "erkek":
        kalori = adim_sayisi * 45 / 500
        print("Yakılan kalori miktarı : {}".format(kalori))
    else:
        print("Geçerli bir cinsiyet girilmedi")


kalori_hesaplama()