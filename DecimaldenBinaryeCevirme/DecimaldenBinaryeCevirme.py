def binary_donusum(decimal_sayi):

    binary_sayi = ''

    while decimal_sayi != 0:

        binary_sayi = str(decimal_sayi % 2) + binary_sayi
        decimal_sayi = decimal_sayi / 2
        decimal_sayi = int(decimal_sayi)

    return binary_sayi

print(binary_donusum(int(input("Bir sayı girin : "))))
