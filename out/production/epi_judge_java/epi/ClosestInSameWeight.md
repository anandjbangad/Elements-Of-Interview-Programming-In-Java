##Question??
Find Closest weight , check pg 29
## Knowledge needed to solve that question?

Bit Swapp
##What Logic do you use to solve it? 

Swap the right most two unequal pair of bits.

Another apporach is check x - 1, x + 1, x +2 and son and see weights.
##Pseudo Code that solves the problem

```java
for(int i=0; i<62; i++){
    if((x >>> i) &1 != (x >>> i+1) &1){
        Swap bits;
        break; // This break wiill break from main for loop and not if
    }
}
```