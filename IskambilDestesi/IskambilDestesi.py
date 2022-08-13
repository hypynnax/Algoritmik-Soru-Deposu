import random

def iskambil_destesi():

    simge = ["MAÇA", "KUPA", "KARO", "SİNEK"]
    sayi = ["AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"]
    deste = ([1] * 52)

    for i in range(len(deste)):
        deste[i] = i

    for i in range(len(deste)):
        rastgele = random.randint(0, 51)
        temp = deste[i]
        deste[i] = deste[rastgele]
        deste[rastgele] = temp

    for i in range(len(deste)):
        sira_simge = int(deste[i] / 13)
        sira_sayi = int(deste[i] % 13)
        print("{} {}".format(simge[sira_simge], sayi[sira_sayi]))

iskambil_destesi()