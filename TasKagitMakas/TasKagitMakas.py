import random


def tas_kagit_makas():

    envanter = ['Taş', 'Kağıt', 'Makas']
    bilgisayar = (envanter[random.randint(0, 2)]).upper()
    oyuncu = (input("(Taş)\n(Kağıt)\n(Makas)\nBirini seçin : ")).upper()

    if oyuncu == "TAŞ":
        if bilgisayar == "TAŞ":
            print("Berabere")
        elif bilgisayar == "KAĞIT":
            print("Kağıt taşı sarar\nKaybettin")
        elif bilgisayar == "MAKAS":
            print("Taş makası kırar\nKazandın")
    elif oyuncu == "KAĞIT":
        if bilgisayar == "TAŞ":
            print("Kağıt taşı sarar\nKazandın")
        elif bilgisayar == "KAĞIT":
            print("Berabere")
        elif bilgisayar == "MAKAS":
            print("Makas kağıdı keser\nKaybettin")
    elif oyuncu == "MAKAS":
        if bilgisayar == "TAŞ":
            print("Taş makası kırar\nKaybettin")
        elif bilgisayar == "KAĞIT":
            print("Makas kağıdı keser\nKazandın")
        elif bilgisayar == "MAKAS":
            print("Berabere")
    else:
        print("Geçerli bir sayı girmediniz")


tas_kagit_makas()