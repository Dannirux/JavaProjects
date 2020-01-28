/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrecursivo.dominio;

import java.math.BigInteger;

/**
 *
 * @author danni
 */
public class Factorial {
    
    static BigInteger factorialBigInteger(BigInteger num){
    if (num.equals(BigInteger.ZERO))
        return BigInteger.ONE;
    else
        return num.multiply(factorialBigInteger(num.subtract(BigInteger.ONE)));
}
    
    static long factorialInt(long num){
    if (num==0)
        return 1;
    else 
        return num*factorialInt(num-1);
        
        
    }
}
