import string


def uygun_sifre(sifre):

    uygun_mu = True
    sayilar = string.digits
    harfler = string.ascii_letters

    if not len(sifre) >= 8:
        print("En az 8 karekter uzunluğunda bir şifre girin")
        uygun_mu = False


    uzunluk = 0

    for i in range(len(sifre)):
        if (sayilar.__contains__(sifre[i])) or (harfler.__contains__(sifre[i])):
            uzunluk += 1

    if uzunluk != len(sifre):
        print("Yanlızca sayı veya harflerden oluşan bir şifre girin")
        uygun_mu = False


    uzunluk = 0

    for i in range(len(sifre)):
        if sayilar.__contains__(sifre[i]):
            uzunluk += 1

    if uzunluk < 2:
        print("En az iki sayı içeren bir şifre girin")
        uygun_mu = False
    

    if uygun_mu == True:
        print("Uygun şifre girdiniz")
    else:
        print("Geçerli bir şifre girmediniz")


uygun_sifre(input("Şifrenizi girin : "))