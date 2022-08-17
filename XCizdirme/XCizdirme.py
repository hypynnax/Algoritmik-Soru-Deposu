def x_cizme(yukseklik):

    cizilen_x = ''

    for i in range(yukseklik):
        for j in range(yukseklik):
            if (i == j) or (j == yukseklik - i - 1):
                cizilen_x += 'X'
            else:
                cizilen_x += ' '

        cizilen_x += '\n'

    print(cizilen_x)


x_cizme(int(input("Çizmek istediğiniz X'in yüksekliğini girin : ")))