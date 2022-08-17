def selection_sort(dizi):

    print(dizi)

    for i in range(len(dizi)):

        temp = dizi[i]
        en_kucuk_sayi = dizi[i]
        en_kucuk_sayi_indeksi = i

        for j in range(i+1, len(dizi)):
            if dizi[j] < en_kucuk_sayi:
                en_kucuk_sayi = dizi[j]
                en_kucuk_sayi_indeksi = j

        dizi[i] = en_kucuk_sayi
        dizi[en_kucuk_sayi_indeksi] = temp

    print(dizi)


dizi = [76, 48, 82, 31, 27, 45, 58, 69, 71, 84, 42, 37]
selection_sort(dizi)