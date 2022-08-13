def dizide_kaydirma(kelime_dizisi, kaydirma_adedi):

    for i in range(kaydirma_adedi):

        kelime_dizisi = kelime_dizisi[len(kelime_dizisi)-1] + kelime_dizisi
        kelime_dizisi = kelime_dizisi.removesuffix(kelime_dizisi[len(kelime_dizisi)-1])

    return kelime_dizisi

print(dizide_kaydirma(input("Bir kelime girin : "), int(input("Kaydırma adedini girin : "))))
