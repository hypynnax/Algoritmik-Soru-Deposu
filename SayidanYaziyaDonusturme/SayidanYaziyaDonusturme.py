def sayidan_yaziya_donusturme():

    birler = ["Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz"]
    onlar = ["On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan"]
    sayi = int(input("1-99 arası bir sayı giriniz : "))
    onlar_basamagi = int(sayi / 10)
    birler_basamagi = int(sayi % 10)
    for i in range(9):
        if onlar_basamagi == i+1:
            print(onlar[i], end=' ')

    for i in range(9):
        if birler_basamagi == i+1:
            print(birler[i])

sayidan_yaziya_donusturme()