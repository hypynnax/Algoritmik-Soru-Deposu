def ucgen_cizme(yukseklik):

    ucgen = ''
    i = 1
    j = yukseklik - 1

    while yukseklik > 0:

        yildiz = i
        bosluk = j

        while bosluk > 0:
            ucgen += ' '
            bosluk -= 1

        while yildiz > 0:
            ucgen += '*'
            yildiz -= 1

        ucgen += '\n'
        i += 2
        j -= 1
        yukseklik -= 1

    return ucgen


print(ucgen_cizme(int(input("Üçgenin yüksekliğini girin : "))))
