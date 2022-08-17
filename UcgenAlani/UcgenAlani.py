import math


def ucgen_alani_hesaplama(birinci_kenar, ikinci_kenar, ucuncu_kenar):
    u = (birinci_kenar + ikinci_kenar + ucuncu_kenar) / 2
    return math.sqrt(u * (u - birinci_kenar) * (u - ikinci_kenar) * (u - ucuncu_kenar))


birinci_kenar = int(input("Birinci kenarı girin : "))
ikinci_kenar = int(input("İkinci kenarı girin : "))
ucuncu_kenar = int(input("Üçüncü kenarı girin : "))
print(ucgen_alani_hesaplama(birinci_kenar, ikinci_kenar, ucuncu_kenar))