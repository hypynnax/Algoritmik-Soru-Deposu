def navigasyon(harita):

    yol = ""

    for y in range(len(harita)):
        for x in range(len(harita[0])):
            if harita[y][x] == 1:
                yol += str(y) + "" + str(x) + ","

    return yol

##harita = [[1, 1, 0, 0, 0], [0, 1, 1, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 1, 1]]
harita = [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 1, 0, 0, 0, 0, 0, 0, 0],
          [0, 1, 0, 1, 0, 0, 0, 1, 0, 0],
          [0, 1, 0, 1, 0, 0, 1, 1, 0, 0],
          [1, 1, 0, 0, 1, 0, 1, 1, 1, 1],
          [0, 0, 0, 0, 1, 0, 1, 0, 0, 0],
          [0, 0, 0, 0, 0, 1, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]]
print(navigasyon(harita))