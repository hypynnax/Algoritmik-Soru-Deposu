def oyuna_basla():

    tutulan_sayi = -1
    print("Hadi başlayalım aklından 0 ile 12 arası bir sayı tut(0 ve 12 dahil)\nUnutma ben asla kaybetmem")

    sorgu = input("Tuttuğun sayı 6'dan büyük mü? : ")
    if sorgu.lower() == 'evet':
        sorgu = input("Tuttuğun sayı çift mi? : ")
        if sorgu.lower() == 'evet':
            sorgu = input("Tuttuğun sayı 5'in katı mi? : ")
            if sorgu.lower() == 'evet':
                tutulan_sayi = 10
            else:
                sorgu = input("Tuttuğun sayı 6'nın katı mi? : ")
                if sorgu.lower() == 'evet':
                    tutulan_sayi = 12
                else:
                    tutulan_sayi = 8
        else:
            sorgu = input("Tuttuğun sayı 3'ün katı mı? : ")
            if sorgu.lower() == 'evet':
                tutulan_sayi = 9
            else:
                sorgu = input("Tuttuğun sayı iki basamaklı mı? : ")
                if sorgu.lower() == 'evet':
                    tutulan_sayi = 11
                else:
                    tutulan_sayi = 7
    else:
        sorgu = input("Tuttuğun sayı asal mı? : ")
        if sorgu.lower() == 'evet':
            sorgu = input("Tuttuğun sayı çift mi? : ")
            if sorgu.lower() == 'evet':
                tutulan_sayi = 2
            else:
                sorgu = input("Tuttuğun sayı 4'ten büyük mü? ? : ")
                if sorgu.lower() == 'evet':
                    tutulan_sayi = 5
                else:
                    tutulan_sayi = 3
        else:
            sorgu = input("Tuttuğun sayı çift mi? : ")
            if sorgu.lower() == 'evet':
                sorgu = input("Tuttuğun sayı 3'ün katı mi? : ")
                if sorgu.lower() == 'evet':
                    tutulan_sayi = 6
                else:
                    sorgu = input("Tutuğun sayı 2'nin katı mı? : ")
                    if sorgu.lower() == 'evet':
                        tutulan_sayi = 4
                    else:
                        tutulan_sayi = 0
            else:
                tutulan_sayi = 1

    return tutulan_sayi

oyun_baslasin_mi = input("Oyunu oynamaya hazır mısın? Unutma sadece 'Evet' veya 'Hayır' diyebilirsin!\nCevabın : ")

if oyun_baslasin_mi.lower() == 'evet':
    sorgu = input("Tuttuğun sayı {}\nDoğru mu? : ".format(oyuna_basla()))
    if sorgu.lower() == 'hayır':
        print("Yalan söylediğin için ben kazandım!")
    else:
        print("Sana söylemiştim ben kaçınılmazım")
elif oyun_baslasin_mi.lower() == 'hayır':
    print('Korkacağını biliyordum :))\nBeni zaten yenemezdin!')
else:
    print("Hadi ama türkçeyide mi bilmiyorsun?")
