import math


def vucut_kitle_indeksi(boy, kilo):

    VKI = kilo / math.pow(boy, 2)
    print("Vücut kitle indeksiniz : {}".format(VKI))

    if VKI < 18.5:
        print("Zayıf")
    elif (VKI >= 18.5) and (VKI < 25):
        print("Normal Kilolu")
    elif (VKI >= 25) and (VKI < 30):
        print("Fazla Kilolu")
    elif (VKI >= 30) and (VKI < 35):
        print("Tip 1 Obez")
    elif (VKI >= 35) and (VKI < 40):
        print("Tip 2 Obez")
    elif (VKI >= 40) and (VKI < 50):
        print("Morbid obez(İleri derecede obez)")
    elif (VKI >= 50) and (VKI < 60):
        print("Süper Obez")
    elif (VKI >= 60) and (VKI < 100):
        print("Süper Süper Obez")

    print("İdeal Kilonuz : {}".format(21.7 * math.pow(boy, 2)))


boy = float(input("Boy girin (metre cinsinden): "))
kilo = float(input("Kilo girin (kg cinsinden): "))
vucut_kitle_indeksi(boy, kilo)