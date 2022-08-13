import random

def matris_analizi():

    matris = [[0 for x in range(10)]for y in range(10)]
    sagdan_capraz_toplam = 0
    soldan_capraz_toplam = 0

    for i in range(10):
        for j in range(10):
            matris[i][j] = random.randint(1, 9)
            print(matris[i][j], end='\t')
        print()

    for i in range(10):
        for j in range(10):
            if i == j:
                soldan_capraz_toplam += matris[i][j]
            if i + j == len(matris[0])-1:
                sagdan_capraz_toplam += matris[i][j]

    print("Soldan çarpaz toplam : {}\nSağdan çapraz toplam : {}".format(soldan_capraz_toplam, sagdan_capraz_toplam))

matris_analizi()