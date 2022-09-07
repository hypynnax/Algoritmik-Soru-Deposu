def dar_agaci(index):
    dar_agaci =["""
         +---------+
         |         |
                   |
                   |
                   |
                   |
                   |
                   |
            =======|=======
            """, """
         +---------+
         |         |
         O         |
                   |
                   |
                   |
                   |
                   |
            =======|=======
            """, """
         +---------+
         |         |
         O         |
         |         |
         |         |
                   |
                   |
                   |
            =======|=======
            """, """
         +---------+
         |         |
         O         |
         |\        |
         | \       |
                   |
                   |
                   |
            =======|=======
            """, """
         +---------+
         |         |
         O         |
        /|\        |
       / | \       |
                   |
                   |
                   |
            =======|=======
            """, """
         +---------+
         |         |
         O         |
        /|\        |
       / | \       |
          \        |
           \       |
                   |
            =======|=======
            """, """
         +---------+
         |         |
         O         |
        /|\        |
       / | \       |
        / \        |
       /   \       |
                   |
            =======|=======
            """]
    return dar_agaci[index]

def oyuna_basla():
    global secilen_kelime, ipucu, gorunen_kelime, can, daragaci, girilen_harfler
    import random
    kelimeler = {"TÜRKİYE" : "ÜLKE", "İRAN" : "üLKE", "ÜRDÜN" : "üLKE", "JAMAİKA" : "üLKE", "LİBERYA" : "üLKE",
                 "AFGANİSTAN" : "üLKE", "ÇİN" : "üLKE", "YEMEN" : "üLKE", "SUDAN" : "üLKE", "ANDORRA" : "üLKE",
                 "MOLDOVA" : "üLKE", "VATİKAN" : "üLKE", "FAS" : "üLKE", "BOTSVANA" : "üLKE", "GÜRCİSTAN" : "üLKE",
                 "İSVİÇRE" : "üLKE", "BURUNDİ" : "üLKE", "MONAKO" : "üLKE", "AVUSTURYA" : "üLKE", "MOĞOLİSTAN" : "üLKE",
                 "PATLICAN" : "BİTKİ", "KIZILCIK" : "BİTKİ", "KORUNGA" : "BİTKİ", "KETEN" : "BİTKİ", "KEKİK" : "BİTKİ",
                 "DEREOTU" : "BİTKİ", "KİRAZ" : "BİTKİ", "MARUL" : "BİTKİ", "HARDAL" : "BİTKİ", "DİŞBUDAK" : "BİTKİ",
                 "BİBERİYE" : "BİTKİ", "KARANFİL" : "BİTKİ", "MANOLYA" : "BİTKİ", "KARNIBAHAR" : "BİTKİ", "NOHUT" : "BİTKİ",
                 "SÜMBÜL" : "BİTKİ", "FULYA" : "BİTKİ", "BERGAMOT" : "BİTKİ", "KABAK" : "BİTKİ", "HANIMELİ" : "BİTKİ",
                 "İSTANBUL" : "ŞEHİR", "KOCAELİ" : "ŞEHİR", "ANKARA" : "ŞEHİR", "ORDU" : "ŞEHİR", "BİTLİS" : "ŞEHİR",
                 "AYDIN" : "ŞEHİR", "YOZGAT" : "ŞEHİR", "BURSA" : "ŞEHİR", "OSMANİYE" : "ŞEHİR", "ÇANKIRI" : "ŞEHİR",
                 "KONYA" : "ŞEHİR", "VAN" : "ŞEHİR", "AFYON" : "ŞEHİR", "MUŞ" : "ŞEHİR", "ANTALYA" : "ŞEHİR",
                 "BARTIN" : "ŞEHİR", "SİİRT" : "ŞEHİR", "KARAMAN" : "ŞEHİR", "MANİSA" : "ŞEHİR", "KÜTAHYA" : "ŞEHİR",
                 "DÜZCE" : "ŞEHİR", "KÖPEK" : "HAYVAN", "TAPİR" : "HAYVAN", "LAGOS" : "HAYVAN", "EBABİL" : "HAYVAN",
                 "BİZON" : "HAYVAN", "TIRTIL" : "HAYVAN", "BOĞA" : "HAYVAN", "SİVRİSİNEK" : "HAYVAN", "YENGEÇ" : "HAYVAN",
                 "TAVUK" : "HAYVAN", "ORNİTORENK" : "HAYVAN", "MERCAN" : "HAYVAN", "KANGURU" : "HAYVAN", "KEÇİ" : "HAYVAN",
                 "ZÜRAFA" : "HAYVAN", "AYI" : "HAYVAN", "KAPLAN" : "HAYVAN", "LÜFER" : "HAYVAN", "VAŞAK" : "HAYVAN",
                 "ÖRDEK" : "HAYVAN", "ASLAN" : "HAYVAN", "KEDİ" : "HAYVAN"}
    can = 6
    daragaci = 0
    secilen_kelime = random.choice(list(kelimeler))
    ipucu = kelimeler.get(secilen_kelime)
    gorunen_kelime = ['_'] * (len(secilen_kelime))
    girilen_harfler = []
    print("Can :", '❤' * can + ' ' * 5 + "İpucu :", ipucu)
    print(dar_agaci(daragaci))
    print("Kelime : ", ''.join(gorunen_kelime))

def harf_al():
    global girilen_harfler
    devam = True
    tahmin = False
    harf = ''
    while devam:
        harf = input("Bir harf ve ya bir tahmin girin : ")
        if harf.upper() == secilen_kelime:
            tahmin = True
            devam = False
        elif harf.upper() == 'ÇIKIŞ':
            exit()
        else:
            if (len(harf) == 1) and (harf.isalpha() == True) and (harf not in gorunen_kelime) and (harf not in girilen_harfler):
                girilen_harfler.append(harf)
                devam = False
            else:
                print("Önceden girmediğiniz", sep=' ')
    return harf.upper(), tahmin

def harfin_konumu(alinan_harf):
    harfin_yerleri = []
    harf_var_mi = False
    for index, harf in enumerate(secilen_kelime):
        if harf == alinan_harf:
            harfin_yerleri.append(index)
            harf_var_mi = True
    return harfin_yerleri, harf_var_mi

def oyuna_devam():
    global can, daragaci
    while (can > 0) and (secilen_kelime != ''.join(gorunen_kelime)):
        alinan_harf, tahmin = harf_al()
        harfin_yerleri, harf_var_mi = harfin_konumu(alinan_harf)
        if tahmin == True:
            return
        if harf_var_mi == True:
            for i in harfin_yerleri:
                gorunen_kelime[i] = alinan_harf
        else:
            can -= 1
            daragaci += 1
        if can < 1:
            print('|' + '-' * 35 + '|')
            print(dar_agaci(daragaci))
        else:
            print('|' + '-' * 35 + '|')
            print("Can : ", '❤' * can)
            print(dar_agaci(daragaci))
            print("Kelime : ", ''.join(gorunen_kelime))

def oyun_sonucu():
    if can > 0:
        print("TEBRİKLER!!!\nKazandınız")
    else:
        print("MAALESEF:(((\nKaybettiniz")
        print("Kelime", secilen_kelime, "olacaktı")

def main():
    devam = True
    while devam:
        print("~" *10, " Adam Asmaca ", "~" * 10)
        oyuna_basla()
        oyuna_devam()
        oyun_sonucu()
        if input("Oyuna devam etmek istiyor musunuz?(E/H)").lower() == 'h':
            devam = False

main()
