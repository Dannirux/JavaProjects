/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raphsody;

/**
 *
 * @author danni
 */

   import java.io.*; 

public class Raphsody { 

static BufferedReader reader; 

public Raphsody() { 
reader = new BufferedReader(new InputStreamReader(System.in)); 
} 

public static double readDouble() throws IOException { 
return (new Double(reader.readLine())).doubleValue(); 
} 

// Codificación de la función x cubica menos 4.3 por x cuadrada mas 4 por x 
// menos 17.2 
public static double f(double x) { 
return x*x*x*x+x*x*x+1*x*x+1*x+2; 
} 

// Derivada de la funcion anterior 
public static double df(double x) { 
return 4*x*x*x+2*x+1; 
} 

public static void main(String[] args) { 
double x,y,epsilon; 
boolean done = false; 
Raphsody v = new Raphsody(); 

    

try{ 
System.out.print("x? "); 
x = readDouble(); 
System.out.println(); 
System.out.print("epsilon? "); 
epsilon = readDouble(); 
do{ 
y = f(x); 
System.out.println(x+" "+y); 
if(Math.abs(y) < epsilon) done = true; 
x -= y/df(x); 
}while(!done); 
System.out.println("Raiz de la Ecuación : "+x); 
}catch(Exception e) { 
e.printStackTrace(); 
} 
} 
}
