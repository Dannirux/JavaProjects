/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import gui.IngresoManual;
import java.util.Random;
import validaciones.ValueInt;

/**
 *
 * @author danni
 */
public class Insert {

    IngresoManual manual;
    static int[] array;
    static String[] manu;
    Random aleatorio1;
    String b;
    int con;
    String t;
    static int[] tempmanual;
    Ordenamiento o;
    int[] tempBubble;
    int[] tempInser;
    int[] tempSelect;
    int[] tempShell;
    int[] tempQuick;
    int[] tempMerge;
    static int[] manualBubble;
    static int[] manualInser;
    static int[] manualSelect;
    static int[] manualShell;
    static int[] manualQuick;
    static int[] manualMerge;

    public Insert() {
        manual = new IngresoManual();
        o = new Ordenamiento();

    }

    public static int[] getTempmanual() {
        return tempmanual;
    }

    public int[] getArray() {
        return array;
    }

    public int[] getTempBubble() {
        return tempBubble;
    }

    public int[] getTempInser() {
        return tempInser;
    }

    public int[] getTempSelect() {
        return tempSelect;
    }

    public int[] getTempShell() {
        return tempShell;
    }

    public int[] getTempQuick() {
        return tempQuick;
    }

    public String[] getManu() {
        return manu;
    }

    public int[] getManualBubble() {
        return manualBubble;
    }

    public int[] getManualInser() {
        return manualInser;
    }

    public int[] getManualSelect() {
        return manualSelect;
    }

    public int[] getManualShell() {
        return manualShell;
    }

    public int[] getManualQuick() {
        return manualQuick;
    }

    public int[] getTempMerge() {
        return tempMerge;
    }

    public static int[] getManualMerge() {
        return manualMerge;
    }

    public void crearArrayAleatorio(int tam, int max, int min) {
        array = new int[tam];
        int aleatorio;
        aleatorio1 = new Random();
        for (int i = 0; i < array.length; i++) {
            aleatorio = (min + aleatorio1.nextInt((max + 1) - min));
            array[i] = aleatorio;
        }
        tempBubble = new int[tam];
        tempInser = new int[tam];
        tempSelect = new int[tam];
        tempShell = new int[tam];
        tempQuick = new int[tam];
        tempMerge = new int[tam];

        System.arraycopy(array, 0, tempBubble, 0, tam);
        System.arraycopy(array, 0, tempInser, 0, tam);
        System.arraycopy(array, 0, tempQuick, 0, tam);
        System.arraycopy(array, 0, tempSelect, 0, tam);
        System.arraycopy(array, 0, tempShell, 0, tam);
        System.arraycopy(array, 0, tempMerge, 0, tam);

    }

    public void crearManual() {

        int tam1;
        tam1 = manual.getContadornulo();
        System.out.println(tam1);
        manu = new String[tam1];
        tempmanual = new int[tam1];
        System.arraycopy(manual.getCambiovector(), 0, manu, 0, tam1);
        for (int i = 0; i < tam1; i++) {
            tempmanual[i] = Integer.parseInt(manu[i]);
        }
        manualBubble = new int[tam1];
        manualInser = new int[tam1];
        manualSelect = new int[tam1];
        manualShell = new int[tam1];
        manualQuick = new int[tam1];
        manualMerge = new int[tam1];
        System.arraycopy(tempmanual, 0, manualBubble, 0, tam1);
        System.arraycopy(tempmanual, 0, manualInser, 0, tam1);
        System.arraycopy(tempmanual, 0, manualQuick, 0, tam1);
        System.arraycopy(tempmanual, 0, manualSelect, 0, tam1);
        System.arraycopy(tempmanual, 0, manualShell, 0, tam1);
        System.arraycopy(tempmanual, 0, manualMerge, 0, tam1);

    }

    public String imprimirAleatorio(int cualquier[]) {
        b = "";
        for (int i = 0; i < cualquier.length; i++) {
            b += String.valueOf(cualquier[i] + " ");

        }
        return b;
    }

    public String imprimirManual(int cualquier[]) {
        b = "";
        for (int i = 0; i < cualquier.length; i++) {
            b += cualquier[i] + " ";

        }
        return b;
    }

    public String imprimirManual1(String cualquier[]) {
        b = "";
        for (int i = 0; i < cualquier.length; i++) {
            b += cualquier[i] + " ";

        }
        return b;
    }
}
