def havali_isim(isim, soyisim):

    while len(isim) < 12:
        isim += '*'

    while len(soyisim) < 12:
        soyisim += '+'

    print(isim[0:4]);
    print(isim[4] + "  " + isim[11]);
    print(isim[5] + "  " + isim[10]);
    print(isim[6:10]);

    print()

    print(soyisim[0] + "    " + soyisim[11]);
    print(soyisim[1] + "    " + soyisim[10]);
    print(soyisim[2] + "    " + soyisim[9]);
    print(soyisim[3:9]);

havali_isim(input("İsminizi girin : "), input("Soyisminizi girin : "))