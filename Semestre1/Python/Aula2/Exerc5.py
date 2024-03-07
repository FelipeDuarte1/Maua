import math
def euclidiana(x1,y1,x2,y2):
    distancia = math.sqrt((x2-x1)**2 + (y2-y1)**2)
    return distancia

def haversine(lat1,lon1,lat2,lon2):
    lat1 = math.radians(lat1)
    lat2 =math.radians(lat2)
    lon1 =math.radians(lon1)
    lon2 =math.radians(lon2)

    Raio_da_terra = (6356.752 + 6378.137 + 6399.594 + 6335.439 ) / 4

    a = math.sin((lat2-lat1)/2)**2
    b = math.sin((lon2-lon1)/2)**2
    c = math.sqrt(a + math.cos(lat1)*math.cos(lat2)*b)
    distancia = 2*Raio_da_terra*math.asin(c)

    print(distancia)
