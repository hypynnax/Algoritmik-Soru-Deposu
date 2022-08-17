import random


def mayin_tarlasi_hazirlama(en, boy):

    arena = [[0 for x in range(en)]for y in range(boy)]

    for y in range(boy):
        for x in range(en):
            rastgele = random.randint(0, 1)
            arena[y][x] = rastgele

    return arena


def oyuna_basla(arena):

    puan = 0
    oyun_sonu = False

    while oyun_sonu != True:

        koordinat_x = int(input("Seçmek istediğiniz x koordinatını girin : "))
        koordinat_y = int(input("Seçmek istediğiniz y koordinatını girin : "))

        if arena[koordinat_x][koordinat_y] == 0:
            puan += 10
            print("Hala hayattasın ve 10 puan kazandın")
        else:
            print("Boooom\nPuanın : {}".format(puan))
            oyun_sonu = True


oyuna_basla(mayin_tarlasi_hazirlama(int(input("En bilgisini girin : ")),int(input("Boy bilgisini girin : "))))