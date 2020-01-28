/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayoritario;

import java.util.ArrayList;

/**
 *
 * @author vicen
 */
public class MayoritarioDYV {

   
    public static class NoMayoritarioExceptionn extends Exception {
        public NoMayoritarioExceptionn(){
            super("No hay elementos mayoritarios ");
        }
    }

    public int calcularMayoritario(ArrayList<Integer> vect)throws NoMayoritarioExceptionn {
        if (vect.size() < 2) {
            throw new NoMayoritarioExceptionn();
        }
        switch (vect.size()) {
            case 2:
                if (vect.get(0) == vect.get(1)) {
                    return vect.get(0);
                }
                throw new NoMayoritarioExceptionn();

            case 3:
                if (vect.get(0) == vect.get(1) || vect.get(0) == vect.get(2)) {
                    return vect.get(0);
                } else if (vect.get(2) == vect.get(1)) {
                    return vect.get(1);

                }
               throw new NoMayoritarioExceptionn();

        }

        if (vect.size() ==2) {
        }
        ArrayList<Integer> candi = new ArrayList<>();
        for (int i = 0; i < vect.size() - 2; i += 3) {
            if (vect.get(i) == vect.get(i + 1) || vect.get(i) == vect.get(i + 2)) {
                candi.add(vect.get(i));
            }
            if (vect.get(i+1) == vect.get(i + 2)) {
                candi.add(vect.get(i + 1));
            }
        }
        int len = vect.size();
        if (len % 2 == 0 && vect.get(len - 2) == vect.get(len - 1)) {
            candi.add(vect.get(len - 1));
        }

        if (candi.size() >= vect.size() / 2) {
            vect = null;
            return this.calcularMayoritario(candi);
        } else {
           throw new NoMayoritarioExceptionn();
        }

    }
}
