naves = [
    [100,200], [100,250], [150,200],
    [250,300], [170,200], [180,90]
]
tiro = [145, 195]

print(tiro in naves)
for i in range(len(naves)):
    x = naves[i][0]
    y = naves[i][1]
    if abs(tiro[0]-x)<= 5 and abs(tiro[1]-y) <=5:
        print("Acertei a nave em ", naves[i]) 
