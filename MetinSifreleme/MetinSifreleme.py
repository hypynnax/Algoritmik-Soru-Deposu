def sifreleme(metin, sifrelem_kodu):
    sifrelenmis_metin = ''
    for char in metin:
        karakter = ord(char) + sifreleme_kodu
        sifrelenmis_metin += chr(karakter)
    print(sifrelenmis_metin)

def sifre_cozme(metin, sifreleme_kodu):
    sifresi_cozulmus_metin = ''
    for char in metin:
        karakter = ord(char) - sifreleme_kodu
        sifresi_cozulmus_metin += chr(karakter)
    print(sifresi_cozulmus_metin)

islem = input("Yapmak istediğiniz işlemi girin : ")
sifreleme_kodu = int(input("Şifreleme kodunu girin : "))
metin = input(islem.capitalize() + " yapılacak metni girin : ")
if islem.lower() == "sifreleme":
    sifreleme(metin, sifreleme_kodu)
elif islem.lower() == "sifre cozme":
    sifre_cozme(metin, sifreleme_kodu)
else:
    print("Ya şifreleme yapabilirsiniz\nYa da şifre çözme yapabilirsiniz")