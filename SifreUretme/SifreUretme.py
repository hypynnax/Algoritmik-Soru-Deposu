import random
import string


def sifre_uretme(uzunluk = 21):

    sifre = ''
    karakterler = string.punctuation + string.ascii_letters + string.digits

    for i in range(uzunluk):
        sifre += random.choice(karakterler)

    return sifre


print(sifre_uretme(int(input("Şifre uzunluğu girin : "))))