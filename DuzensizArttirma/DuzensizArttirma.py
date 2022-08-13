def duzensiz_arttirma():

    yon = True
    toplam = 0
    sayi = 1
    artirma = 0

    for i in range(13):

        sayi += artirma

        if sayi != 35:
            print(sayi, end=" + ")
        else:
            print(sayi, end=" = ")

        if yon == True:
            if artirma < 5:
                artirma += 1
            else:
                yon = False
                artirma -= 1
        else:
            if artirma > 1:
                artirma -= 1
            else:
                yon = True
                artirma += 1
        toplam += sayi

    return toplam

print(duzensiz_arttirma())