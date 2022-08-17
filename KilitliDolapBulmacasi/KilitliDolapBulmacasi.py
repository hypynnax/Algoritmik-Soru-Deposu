def dolaplari_kapat():

    dolaplar = {}

    for i in range(1, 101):
        dolaplar[i] = 'kapalı'

    return dolaplar


def ogrenci_sirasi(dolaplar):

    for i in range(1, 101):
        dolaplari_ac_kapat(i, dolaplar)


def dolaplari_ac_kapat(basamak, dolaplar):

    for i in range(basamak, 101, basamak):
        if dolaplar[i] == 'kapalı':
            dolaplar[i] = 'açık'
        else:
            dolaplar[i] = 'kapalı'


def acik_dolaplar(dolaplar):

    for i in range(1, 101):
        if dolaplar[i] == 'açık':
            print(i, end=' ')


dolaplar = dolaplari_kapat()
ogrenci_sirasi(dolaplar)
acik_dolaplar(dolaplar)