def makine_calisma_sureleri(ay, makine_sayisi):

    if (ay >= 3) and (ay <= 8):
        calisma_suresi = 480
        calisma_arasi = 45
    elif ay == 1 or ay == 2 or (ay >= 9 and ay <= 12):
        calisma_suresi = 540
        calisma_arasi = 30
    else:
        print("Geçerli bir ay girmediniz")

    for i in range(makine_sayisi):
        print("{}. makinenin çalışma süresi = {}".format((i+1), calisma_suresi))
        calisma_suresi -= calisma_arasi


makine_calisma_sureleri(int(input("İçinde bulunduğunuz ayı girin : ")), int(input("Bulunan makine sayısını girin : ")))