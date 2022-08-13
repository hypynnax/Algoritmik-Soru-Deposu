def faktoriyel(sayi):

    faktoriyel = 1

    while sayi > 1:
        faktoriyel *= sayi
        sayi -= 1

    return faktoriyel

print(faktoriyel(int(input("Bir sayı girin : "))))