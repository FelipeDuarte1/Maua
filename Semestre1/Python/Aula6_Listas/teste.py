#lista = [1,2,3]
#print(lista[::-1])

pa = []
for i in range(5, 5+8*5, 5):
    pa.append(i)
print(pa)
pg = []
cont = 1
elem = 2
while cont<=5:
    pg.append(elem)
    elem = elem * 5
    cont = cont+ 1
print(pg)

for i in range(len(pa)):
    if pa[i] in pg:
        print(pa[i])
        