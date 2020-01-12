#!/usr/bin/env python
# coding: utf-8

# In[2]:


n=8
print("n = ",n)
n+=4
print("n = ",n)
n-=5
print("n = ",n)


# In[6]:


for i in range(5):
    print(i,end=" ")
print()
for i in range(1,5):
    print(i,end=" ")
print()
for i in range(1,5,2):
    print(i,end=" ")
print()
for i in range(5,1,-1):
    print(i,end=" ")
print()


# In[7]:


n=int(input("Banyaknya Suku = "))
total=0
print("for")
for i in range (1,n):
    total+=i
    print(i," + ",end="")
total+=n
print(n,"=",total)

print("while")
i=1;total=0
while i<n:
    total+=i
    print(i," + ",end="")
    i+=1
total+=i
print(i,"=",total)
    


# In[10]:


# mendeteksi bilangan ganjil dan genap
n=int(input("Banyaknya Suku = "))
for i in range (1,n,2):
    print(i,"adalah bilangan ganjil")
    print(i+1,"adalah bilangan genap")
    
if n%2 !=0:
    print(n,"adalah bilangan ganjil")


# In[11]:


#menggunakan for untuk mencetak bilang terbesar
n=int(input("Banyaknya Data = "))
B=-99
for i in range (n):
    B1=int(input("Data ke-"+str(i+1)+" = "))
    if B<B1:
        B=B1
        
print("Bilangan Terbesar = ",B)


# In[ ]:




