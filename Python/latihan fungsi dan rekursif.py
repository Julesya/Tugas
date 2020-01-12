#!/usr/bin/env python
# coding: utf-8

# In[3]:


a=8; b=6;
def init():
    a=0; b=0;
def tambah():
    return a+b
def kurang():
    return a-b
def cetak(n):
    print(n)
init()
print("a= ",a)
print("b= ",b)
print(tambah())
print(kurang())
cetak(9)
cetak(4+tambah())
cetak(kurang())


# In[7]:


def Reamur(x):
    return 4/5*c
def Fahrenheit(x):
    return 9/5*x+32
def Kelvin(x):
    return 273+x
def cetak(s,x):
    print(s,"=",x)
    
c=float(input("celcius= "))
cetak("Celcius",c)
cetak("Reamur",Reamur(c))
cetak("Fahrenheit",Fahrenheit(c))
cetak("Kelvin",Kelvin(c))


# In[9]:


def Reamur(x):
    print("Reamur= ",4/5*x)
def Fahrenheit(x):
    print("Fahrenheit= ",9/5*x+32)
def Kelvin(x):
    print("Kelvin= ",273+x)
c=float(input("Celcius= "))
Reamur(c)
Fahrenheit(c)
Kelvin(c)
        


# In[10]:


def Keliling(x,y):
    return 2*(x+y)
def Luas(x,y):
    return x*y
panjang=float(input("Panjang= "))
lebar=float(input("Lebar= "))
print("Keliling= ",Keliling(panjang,lebar))
print("Luas= ",Luas(panjang,lebar))


# In[14]:


def deret(n):
    if n>0:
        return deret(n-1)+n
    else:
        return 0
def deret1(a,b,n):
    if n>0:
        return deret1(a,b,n-1)+a+(n-1)*b
    else: 
        return 0
def fak(n):
    if n>0:
        return n*fak(n-1)
    else:
        return 1
def pangkat(a,n):
    if n>0:
        return a*pangkat(a,n-1)
    else:
        return 1
def fibo(n):
    if n>2:
        return fibo(n-1)+fibo(n-2)
    else: 
        return 1
def GCD(a,b):
    if b==0:
        return a
    else:
        return GDC(b,a%b)

print(deret(4))
print(deret1(3,4,6))
print(fak(8))
print(pangkat(6,4))
print(fibo(6))
print(GCD(15,8))
print(GCD(8,15))


# In[ ]:


def deret(n,h):
    if n

