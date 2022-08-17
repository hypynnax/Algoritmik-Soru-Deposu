def takis_metre():

    siyah_indi_bindi = 16.66
    siyah_km_ucreti = 10.71

    turkuaz_indi_bindi = 11.27
    turkuaz_km_ucreti = 7.25

    sari_bordo_indi_bindi = 9.80
    sari_bordo_km_ucreti = 6.30

    def siyah_taksi(km):
        print(siyah_indi_bindi + (km * siyah_km_ucreti))


    def turkuaz_taksi(km):
        print(turkuaz_indi_bindi + (km * turkuaz_km_ucreti))


    def sari_bordo_taksi(km):
        print(sari_bordo_indi_bindi + (km * sari_bordo_km_ucreti))

    taksi_rengi = input("Bir taksi rengi girin : ")
    kat_edilen_km = float(input("Kaç km gittiğinizi girin : "))

    if taksi_rengi.lower() == "siyah":
        siyah_taksi(kat_edilen_km)
    elif taksi_rengi.lower() == "turkuaz":
        turkuaz_taksi(kat_edilen_km)
    elif (taksi_rengi.lower() == "bordo") or (taksi_rengi.lower() == "sarı"):
        sari_bordo_taksi(kat_edilen_km)
    else:
        print("Geçerli bir taksi rengi girmediniz")


takis_metre()