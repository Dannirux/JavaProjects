/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raphsody;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem;
/**
 *
 * @author danni
 */
public class Apache extends PolynomialFunction  {

    public Apache(double[] c) throws NullArgumentException, NoDataException {
        super(c);
    }

    @Override
    public PolynomialFunction add(PolynomialFunction p) {
        return super.add(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int degree() {
        return super.degree(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PolynomialFunction polynomialDerivative() {
        return super.polynomialDerivative(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UnivariateFunction derivative() {
        return super.derivative(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double value(double x) {
        return super.value(x); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
    
    
}
