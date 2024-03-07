import math

lat1 =-23.647955
#lat2 =-23.585578
lat2 =-23.6489083
lon1 =-46.5768253
lon2 =-46.5547915
#lon2 =-46.6122539


#Raio_da_terra = 6371; #km
Raio_da_terra = (6356.752 + 6378.137 + 6399.594 + 6335.439 ) / 4

print(Raio_da_terra)

a = math.sin((lat2-lat1)/2)**2
b = math.sin((lon2-lon1)/2)**2
c = math.sqrt(a + math.cos(lat1)*math.cos(lat2)*b)
distancia = 2*Raio_da_terra*math.asin(c)

print(distancia)