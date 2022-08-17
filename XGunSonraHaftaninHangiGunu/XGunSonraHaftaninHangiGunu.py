def hangi_gun(gun, ilerleme_sayisi):

    gunler = ["pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"]
    gun = gun.lower()

    if gunler.__contains__(gun):
        gun_sayisi = (gunler.index(gun)+ilerleme_sayisi) % 7
        print("{} gününden {} gün sonra haftanın {}. günü olan {} günüdür.".format(gun.upper(), ilerleme_sayisi, gun_sayisi+1, gunler[gun_sayisi].upper()))
    else:
        print("Böyle bir gün bulunmamakta")


hangi_gun(input("Hangi günde olduğunuzu girin : "), int(input("Kaç gün sonrası olduğunu girin : ")))