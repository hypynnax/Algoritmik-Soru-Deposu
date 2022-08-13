def diziyi_buyukten_kucuge_siralama(dizi):

    def diziyi_kucukten_buyuge_sirala(dizi):

        for i in range(len(dizi)):

            temp = dizi[i]
            temp_indexi = i

            for j in range(i+1, len(dizi)):
                if dizi[j] < temp:
                    temp = dizi[j]
                    temp_indexi = j
            dizi[temp_indexi] = dizi[i]
            dizi[i] = temp

    def diziyi_buyukten_kucuge_sirala(dizi):

        for i in range(len(dizi)):

            temp = dizi[i]
            temp_indexi = i

            for j in range(i+1, len(dizi)):
                if dizi[j] > temp:
                    temp = dizi[j]
                    temp_indexi = j
            dizi[temp_indexi] = dizi[i]
            dizi[i] = temp

    diziyi_kucukten_buyuge_sirala(dizi)
    diziyi_buyukten_kucuge_sirala(dizi)

    return dizi

##sayilar_dizisi = [0.1, 1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0, 9.1]
##sayilar_dizisi = [1.0, 5.0, 10.5, 3.3, 7.25]
sayilar_dizisi = [0.2, 0.1, 2.3, 4.5, 0.2, 4.0, 5.66, 5.67, 7.8, 8.9, 9.0, 9.1]
print(diziyi_buyukten_kucuge_siralama(sayilar_dizisi))