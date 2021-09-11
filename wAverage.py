# -*- coding: utf-8 -*-
# lê variáveis a e b e calcula média ponderada
a = float(input())
b = float(input())
c = float(input())
wa = 2 # pesos
wb = 3 
wc = 5 
media = (wa*a+wb*b+wc*c)/(wa+wb+wc)
print("MEDIA = {0:.1f}".format(media))