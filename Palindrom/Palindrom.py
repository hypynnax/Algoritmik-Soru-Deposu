def palindrom_mu(kelime):

    palindrom = True

    for i in range(int((len(kelime)/2))):
        if kelime[i] != kelime[len(kelime)-1-i]:
            palindrom = False

    if palindrom == True:
        print("{} palindromdur.".format(kelime))
    else:
        print("{} palindrom değildir.".format(kelime))

palindrom_mu(input("Bir kelime girin : "))