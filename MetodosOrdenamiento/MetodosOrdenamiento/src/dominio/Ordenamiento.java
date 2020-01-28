/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Arrays;

/**
 *
 * @author danni
 */
public class Ordenamiento {
static int []matrix;
int t;
Insert in;

    public Ordenamiento() {
       
      
        
    }

   

    public int[] getMatrix() {
        return matrix;
    }
    

    public void burbujaOptimizada(int[] matrix) {
        
        int buffer;
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < i; j++) {
                if (matrix[i] < matrix[j]) {
                    buffer = matrix[j];
                    matrix[j] =matrix[i];
                    matrix[i] = buffer;
                }
            }
        }
        
    }

 
                
   
     public void InsertionSort(int[] matrix) {
        int pos, aux;
        for (int i = 0; i < matrix.length; i++) {
            pos = i;
            aux = matrix[i];
            while ((pos > 0) && (matrix[pos - 1] > aux)) {
                matrix[pos] = matrix[pos - 1];
                pos--;
            }
            matrix[pos] = aux;
        }
    }

    public void  seleccion(int[] matrix) {
         
        int i, j, k, p, buffer, limit = matrix.length - 1;
        for (k = 0; k < limit; k++) {
            p = k;
            for (i = k + 1; i <= limit; i++) {
                if (matrix[i] < matrix[p]) {
                    p = i;
                }
            }
            if (p != k) {
                buffer = matrix[p];
                matrix[p] = matrix[k];
                matrix[k] = buffer;
            }
        }
               
    }

    public void  shellSort(int[] matrix) {
        
        for (int increment = matrix.length / 2; increment > 0; increment
                = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < matrix.length; i++) {
                for (int j = i; j >= increment && matrix[j - increment]
                        > matrix[j]; j -= increment) {
                    int temp = matrix[j];
                    matrix[j] = matrix[j - increment];
                    matrix[j - increment] = temp;
                }
            }
        }
                
    }

 public void quicksort(int matriz[], int primero, int ultimo){
      int i,j,pivote,aux;
      i=primero;
      j=ultimo;
      pivote= matriz[(primero + ultimo)/2];
      do{
        while(matriz[i]<pivote){
        i++;
        }
       while(matriz[j]>pivote){
        j--;
       }
          if(i<=j){
            aux = matriz[i];
            matriz[i]=matriz[j];
            matriz[j]=aux;
            i++;
            j--;
       }
      }while(i<=j);
     // Con esto 
     if(primero <j){
       quicksort(matriz,primero,j);
         }
     if (i<ultimo){
       quicksort(matriz,i,ultimo);
          }  
    }
 public static void ordenacionMergeSort(int vec[]){
                if(vec.length<=1) return;
                int mitad= vec.length/2;
                int izq[]=Arrays.copyOfRange(vec, 0, mitad);
                int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
                ordenacionMergeSort(izq);
                ordenacionMergeSort(der);       
                combinarVector(vec, izq, der);
        }
        
        public static void combinarVector(int v[], int izq[],int der[]){
                int i=0;
                int j=0;
                for(int k=0;k<v.length;k++){
                        if(i>=izq.length){
                                v[k]=der[j];
                                j++;
                                continue;
                        }
                        if(j>=der.length){
                                v[k]=izq[i];
                                i++;
                                continue;
                        }
                        if(izq[i]<der[j]){
                                v[k]=izq[i];
                                i++;
            }else{
                                v[k]=der[j];
                                j++;
                        }
                }
        }

    
}
