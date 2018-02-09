#Parity
##How would you compute the parity of a very large number of 64-bit words?
##Knowledge Needed?
1. What is parity?

    The parity of a binary word is 1 if the number of Is in the word is odd; otherwise,
it is 0. For example, the parity of 1011 is 1, and the parity of 10001000 is 0. Parity
checks are used to detect single bit errors in data storage and communication. It is
fairly straightforward to write code that computes the parity of a single 64-bit word
2. &Operator, | operator, ^ operator.

    a = 15 = 0000 1111
    
    b = 27 = 0001 1011
    
    a&b = 11 = 0000 1011 and each bit
    
    a|b = 31 = 0001 1111 or each bit

3. ">>" Right Shift and "<<" Left Shift and "<<<" left shift 0 fill operator ">>>" Right shift zero fill operator
    
    * eg a = 15 = 0000 1111
    
    a =  a << 2 = 60 = 0011 1100
    
    End mein 2 zero add kar de aur uske baad as it is number likh. So 8 ke upar ya pehle jo hai wo discard
    
    2 se left shift hai so 2 zero end mein add kar aur left shift so 0000 1111 I add 2 zeroes at end  xxxx xx00 baki jo bhi hai usko left shift so now it becomes
    _{00}_ starting 2 zeroes become discarded and result is 0011 1100    
    
    * a = 15 = 0000 11111
    
    a = a >> 2 = 3 = 0000 0011
    
    Start mein 2 zero add kar aur baki number as it is likhde. 8 ke baad jo gaya wo gaya
    
    * a = 15 = 0000 1111
    
    a = a >>> 2 = 
    
    
