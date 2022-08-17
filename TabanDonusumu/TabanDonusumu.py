def taban_donusturme():

    sayi = int(input("Bir sayı girin : "))
    donusturulmus_sayi = ''

    if sayi % 2 == 0:
        while sayi > 0:
            donusturulmus_sayi = str(sayi % 2) + donusturulmus_sayi
            sayi = int(sayi / 2)
    else:
        while sayi > 0:
            donusturulmus_sayi = str(sayi % 8) + donusturulmus_sayi
            sayi = int(sayi / 8)

    return donusturulmus_sayi


print(taban_donusturme())