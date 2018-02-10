#Question Swap i and j bits of a given number

## Knowledge needed to solve that question?
">>>" and "<<<" use of this and use of exor.
Generate a bitmask, thhat is not writing a number in binary. but generating a number with specific bits set to 1 to handle other manipulations.

##What Logic do you use to solve it?

###Remember to use here i startign from 0 and not 1 

1. Find out i and j bit? 
    By right shifting i times & 1 (x <<<i & 1) 
    
    if 0 then ith poisition 0, if 1 then ith 1.
    
2. How to create bitmask ? 

    Bitmask will be needed to swap so that when I exor with this I will get my specific i and j bits reversed if they are different.
    
    Bitmask creation by left shift 1L (000000......1) i times, left shift 1L j times and or 
    eg long bitmask = 1L <<< i | 1L <<< j
    
3. Swapping the two bits.
    
    Exor number with the bitmask that we created.
    


 