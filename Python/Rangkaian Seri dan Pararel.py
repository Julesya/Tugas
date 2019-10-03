#!/usr/bin/env python
# coding: utf-8

# In[ ]:


def seri (R1, R2, R3):
    return (r1+r2+r3)
def pararel(R1, R2, R3):
    return 1 / (1 / r1 +1 / r2 + 1 / r3)

# Input.
r1 = float(input('R1: '))
r2 = float(input('R2: '))
r3 = float(input('R3: '))

print('seri: ' + str(seri(r1, r2, r3)))
print('pararel: ' + str(pararel(r1, r2, r3))) 


# In[ ]:




