#!/usr/bin/env python
# coding: utf-8

# In[1]:


A=8
B=30
print("Operator Relasional")
print("-------------------")
print("A= 8 dan B= 30")
print("1. A == B bernilai ",A == B)
print("2. A != B bernilai ",A != B)
print("3. A > B bernilai ",A > B)
print("4. A < B bernilai ",A < B)
print("5. A >= B bernilai ",A >= B)
print("6. A <= B bernilai ",A <= B)
print("")
print("Operator Logika")
print("-------------------")
print("1. True or True bernilai ",True or True)
print("2. True or False bernilai ",True or False)
print("3. False or True bernilai ",False or True)
print("4. False or False bernilai ",False or False)
print("1. True and True bernilai ", True and True)
print("2. True and False bernilai ", True and False)
print("3. False and True bernilai ", False and True)
print("4. False and False bernilai ", False and False)
print("not True bernilai", not True)
print("not False bernilai", not False)


# In[ ]:


# abs(X)
X = int(input("X ="))
if X<0:
    X=-X
print("X =",X)


# In[2]:


# mencetak bilangan terbesar dari 2 buah bilangan
B1=int(input("Bilangan Pertama = "))
B2=int(input("Bilangan Kedua = "))
print("Bilangan Terbesar adalah ",end="")
if B1>B2:
    print(B1)
else:
    print(B2)


# In[8]:


# mencetak bilangan terbesar dari 3 buah bilangan
B1=int(input("Bilangan Pertama = "))
B2=int(input("Bilangan Kedua = "))
B3=int(input("Bilangan Ketiga = "))
print("Bilangan Terbesar adalah ",end="")
if B1>B2:
    if B1>B3:
        print(B1)
    else:
        print(B3)
elif B2>B3:
    print(B2)
else:
    print(B3)


# In[10]:


# mencetak bilangan terbesar dari 5 buah bilangan
B1=int(input("Bilangan Pertama = "))
B2=int(input("Bilangan Kedua = "))
B3=int(input("Bilangan Ketiga = "))
B4=int(input("Bilangan Keempat = "))
B5=int(input("Bilangan Kelima = "))
print("Bilangan Terbesar adalah ",end="")
B=B1
if B<B2:B=B2
if B<B3:B=B3
if B<B4:B=B4
if B<B5:B=B5
print(B)


# In[11]:


# mencetak bilangan terbesar dan terkecil dari 5 buah bilangan
B1=int(input("Bilangan Pertama = "))
B2=int(input("Bilangan Kedua = "))
B3=int(input("Bilangan Ketiga = "))
B4=int(input("Bilangan Keempat = "))
B5=int(input("Bilangan Kelima = "))
print("Bilangan Terbesar adalah ",end="")
B=B1
if B<B2:B=B2
if B<B3:B=B3
if B<B4:B=B4
if B<B5:B=B5
print(B)
print("Bilangan Terkecil adalah = ",end="")
B=B1
if B>B2:B=B2
if B>B3:B=B3
if B>B4:B=B4
if B>B5:B=B5
print(B)


# In[13]:


# mencetak bilangan terbesar dan terkecil dari 5 buah bilangan
# dengan mnegunakan 2 variable bantuan BB dan Bk
B1=int(input("Bilangan Pertama = "))
B2=int(input("Bilangan Kedua = "))
B3=int(input("Bilangan Ketiga = "))
B4=int(input("Bilangan Keempat = "))
B5=int(input("Bilangan Kelima = "))

BB=B1
BK=B1

if BB<B2:
    BB=B2
elif BK>B2:
    BK=B2
    
if BB<B3:
    BB=B3
elif BK>B3:
    BK=B3
    
if BB<B4:
    BB=B4
elif BK>B4:
    BK=B4

if BB<B5:
    BB=B5
elif BK>B5:
    BK=B5

print("Bilangan Terbesar adalah",BB)
print("Bilangan Terkecil adalah",BK)


# In[3]:


Pembilang=int(input("Pembilang = "))
Penyebut=int(input("Penyebut = "))

if Penyebut==0:
    if Pembilang==0:
        print("Tidak Terdefinisi")
    else:
        print("∞")
else: 
    print(Pembilang,"/", Penyebut,"/",Pembilang/Penyebut)  


# In[7]:


#persamaan kuadrat ax2 + bx +c = 0
#import module math
import math
#input koeisien dengan keyboard
a = int(input('Masukkan Nilai A = '))
b = int(input('Masukkan Nilai B = '))
c = int(input('Masukkan Nilai C = '))
#menghitung diskrimanan D
D = (b**2)-(4*a*c)
D = int(D)

if D==0:
    x=-b/2*a
    print("Dua Akar yang Sama",x)

elif D<0:
    print("Angka Imanginer")

else:
    x1=(-b+math.sqrt(D))/2*a
    x2=(-b-math.sqrt(D))/2*a
    print("x1=",x1)
    print("x2=",x2)


# In[14]:


#persamaan linier
# a1 x + b1 y = c1
# a2 x + b2 y = c2

A1=int(input("A1 = "))
B1=int(input("B1 = "))
C1=int(input("C1 = "))
A2=int(input("A2 = "))
B2=int(input("B2 = "))
C2=int(input("C2 = "))

DA=A1*B2-A2*B1
if DA==0:
    DC=A1*C2-A2*C1
    if DC==0:
         print("Banyak jawaban atau ∞")
    else:
        print("Tidak memiliki jawaban")
else:
    x=(C1*B2-C2*B1)/DA
    y=(A1*C2-A2*C1)/DA
    print("x=",x)
    print("y=",y)


# In[9]:


#


# In[ ]:




