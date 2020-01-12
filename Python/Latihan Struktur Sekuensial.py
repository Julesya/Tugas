#!/usr/bin/env python
# coding: utf-8

# Struktur Sekuensial atau Algoritma Runtutan

# In[2]:


A= 9
B= 7
C= A+B
print(C)


# In[3]:


A= 9
C= A+B
B= 7
print(C)


# In[7]:


B= 7
A= 9
C= B+A
print(C)


# In[8]:


A= 9
B= 7
print("Sebelum Ditukar= A=",A,"B=",B)
C=A
A=B
B=C
print("Sesudah Ditukar= A=",A,"B=",B)


# In[9]:


A= 9
B= 7
print("Sebelum Ditukar= A=",A,"B=",B)
A,B=B,A
print("Sesudah Ditukar= A=",A,"B=",B)


# In[ ]:


print(6//3)
print(6%3)
print(3//6)
print(3%6)


# In[ ]:


Celcius=float(input("Masukkan Nilai Celcius="))
Reamur=4/5*Celcius
Fahrenheit=9/5*Celcius+32
Kelvin=Celcius+273
print("Celcius=", Celcius)
print("Reamur=", Reamur)
print("Fahrenheit=", Fahrenheit)
print("Kelvin=", Kelvin)


# In[ ]:




