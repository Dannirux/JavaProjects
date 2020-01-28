/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivocancion;

import javax.swing.JOptionPane;

/**
 *
 * @author danni
 */
public class Application {

    public static void main(String[] args) {
        int p = 3;
        float solucion[] = new float[p];
        Beneficio objetos[] = new Beneficio[p];
        llenar(objetos);
        mostrar(objetos);
        directa(objetos);
        mostrar(objetos);
        objetivo(solucion, objetos);
        mostrar(solucion, objetos);

    }

    public static void llenar(Beneficio vector[]) {

        for (int i = 0; i < vector.length; i++) {
            int p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese peso" + (i + 1)));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese beneficio" + (i + 1)));
            vector[i] = new Beneficio(b, p);
        }
    }

    public static void directa(Beneficio vector[]) {
     
        int k, j, i;
        double menor;
        Beneficio aux = new Beneficio();
        aux = vector[0];
        for (i = 0; i < vector.length; i++) {
            menor = vector[i].getBxp();
            k = i;

            for (j = i + 1; j < vector.length; j++) {
                if (vector[j].getBxp() < menor) {
                    menor = vector[j].getBxp();
                    aux = vector[j];
                    k = j;

                }

            }
            aux = vector[k];
            vector[k] = vector[i];
            vector[i] = aux;

        }
       

    }

    public static void mostrar(Beneficio[] aux) {
        String beneficio = "beneficio:  ", peso = "peso", valor = "valor por unidad:  ";
        for (int i = 0; i < aux.length; i++) {
            beneficio += aux[i].getBeneficio() + "  ,  ";
            peso += aux[i].getPeso() + " , ";
            valor += (aux[i].getBeneficio() / aux[i].getPeso()) + " , ";

        }
        JOptionPane.showMessageDialog(null, peso + "\n" + beneficio + "\n" + valor);
    }

    public static void mostrar(float aux[], Beneficio b[]) {
        String solucion = " solucion:  ";
        float suma = 0;
        for (int i = 0; i < aux.length; i++) {
            solucion += aux[i] + "-------";
            suma += aux[i] * b[i].getBeneficio();
        }
        JOptionPane.showMessageDialog(null, solucion + "\n total beneficio: " + suma);
    }
//funcion para seleccionar los objetos

    public static void objetivo(float solucion[], Beneficio objetos[]) {
        int m = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la mochila"));
        float pesoactual = 0;
        int i = solucion.length - 1;

        while (pesoactual < m || i >= 0) {
            JOptionPane.showMessageDialog(null, " peso actual: " + pesoactual + "   peso objeto " + i + "  :" + objetos[i].getPeso() + "\n  ");

            if ((pesoactual + objetos[i].getPeso()) < m) {
                solucion[i] = 1;
                pesoactual += objetos[i].getPeso();
                JOptionPane.showMessageDialog(null, " peso actual: " + pesoactual + "   porcentaje tomado del objeto  " + i + "  :" + solucion[i] * 100 + "\n  ");
            } else {
                solucion[i] = (m - pesoactual) / objetos[i].getPeso();
                pesoactual += ((m - pesoactual) / objetos[i].getPeso()) * objetos[i].getPeso();
                JOptionPane.showMessageDialog(null, " peso actual: " + pesoactual + "   porcentaje tomado del objeto  " + i + "  :" + solucion[i] * 100 + "\n  ");
            }

            i--;
        }

    }

}
