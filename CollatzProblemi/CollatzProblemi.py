def collatz_problemi(ust_sayi):

    while ust_sayi > 1:
        print(int(ust_sayi), end=' ')
        if ust_sayi % 2 == 0:
            ust_sayi /= 2
        else:
            ust_sayi = 3 * ust_sayi + 1
    else:
        print(1)


sayi = int(input("Bir sayı girin : "))
collatz_problemi(sayi)