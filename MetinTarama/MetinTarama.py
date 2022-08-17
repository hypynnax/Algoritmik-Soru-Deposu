def metin_tarama(hedef_metin, aranan_kelime):

    toplam_gecme_sayisi = 0

    for i in range(len(hedef_metin) - len(aranan_kelime) + 1):
        if hedef_metin[i:i+len(aranan_kelime)].lower() == aranan_kelime.lower():
            print("{} - {} indexleri arasında geçmekte".format(i, i+len(aranan_kelime)))
            toplam_gecme_sayisi += 1

    print("{} aranan metin içinde {} defa geçmektedir.".format(aranan_kelime, toplam_gecme_sayisi))


metin_tarama(input("Tarama yapılacak metni girin : "), input("Aranan kelimeyi girin : "))