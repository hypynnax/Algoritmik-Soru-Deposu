import random

def cevap_kagadini_hazirlama(soru_sayisi = 0):

    cevap_kagidi = [1] * soru_sayisi
    cevaplar = ['A', 'B', 'C', 'D', 'E']

    for i in range(len(cevap_kagidi)):
        rastgele = random.randint(0, 4)
        cevap_kagidi[i] = cevaplar[rastgele]

    return cevap_kagidi

def ogrenci_cevaplarini_hazirlama(soru_sayisi = 0, ogrenci_sayisi = 0):

    cevap_kagidi = [[0 for i in range(soru_sayisi)] for j in range(ogrenci_sayisi)]
    cevaplar = ['A', 'B', 'C', 'D', 'E']

    for i in range(len(cevap_kagidi)):
        for j in range(len(cevap_kagidi[0])):
            rastgele = random.randint(0, 4)
            cevap_kagidi[i][j] = cevaplar[rastgele]

    return cevap_kagidi

def sinavi_degerlendirme(cevap_kagidi, sinav_kagitlari):

    for i in range(len(sinav_kagitlari)):
        dogru_sayisi = 0
        yanlis_sayisi = 0
        puan = 0
        for j in range(len(cevap_kagidi)):
            if cevap_kagidi[j] == sinav_kagitlari[i][j]:
                dogru_sayisi += 1
            else:
                yanlis_sayisi += 1
        puan = dogru_sayisi * (100 / soru_sayisi)
        print("{}. öğrencinin {} tane doğru, {} tane yanlış cevabı var.\nPUAN : {}".format(i+1, dogru_sayisi, yanlis_sayisi, puan))

soru_sayisi = int(input("Sinavın soru sayısı : "))
ogrenci_sayisi = int(input("Sinava giren öğrenci sayısı : "))

cevap_kagidi = cevap_kagadini_hazirlama(soru_sayisi)
sinav_kagitlari = ogrenci_cevaplarini_hazirlama(soru_sayisi, ogrenci_sayisi)
sinavi_degerlendirme(cevap_kagidi, sinav_kagitlari)