/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raphsody;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;

/**
 *
 * @author danni
 */
public class MAin {
    public static void main(String[] args) {
        double[]pol=new double[5];
        pol[0]=4;
        pol[1]=5;
        pol[2]=5;
        pol[3]=6;
        pol[4]=7;
       
       Apache a=new Apache(pol);
       a.add(a);
        PolynomialFunctionNewtonForm.evaluate(pol, pol, 0);
        evaluate
        System.out.println(a);
        System.out.println(a.polynomialDerivative());
    
      
        
    
        
        
        
       
       
        
        
    }
}
