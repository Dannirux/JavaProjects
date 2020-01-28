/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayoritario;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vicen
 */
public class MayoritarioIterativo {

    public int calcularMayoritario(ArrayList<Integer> vect) throws MayoritarioDYV.NoMayoritarioExceptionn {
        DecimalFormat formato1 = new DecimalFormat("#.00");
        Collections.sort(vect);
        int ulti = vect.get(vect.size() - 1);

        int num = 0;
        int max = 0;
        int cont = 0;

        if (vect.size() < 2) {
            throw new MayoritarioDYV.NoMayoritarioExceptionn();
        }
        switch (vect.size()) {
            case 2:
                if (vect.get(0) == vect.get(1)) {
                    return vect.get(0);
                } else {
                    throw new MayoritarioDYV.NoMayoritarioExceptionn();
                }
            case 3:
                if (vect.get(0) == vect.get(1) || vect.get(0) == vect.get(2)) {
                    return vect.get(0);
                } else if (vect.get(2) == vect.get(1)) {
                    return vect.get(1);

                }
                throw new MayoritarioDYV.NoMayoritarioExceptionn();
        }

        if (vect.size() == 2) {
        }
        for (int i = 0; i < ulti + 1; i++) {
            for (int j = 0; j < vect.size(); j++) {

                if (i == vect.get(j)) {
                    cont++;
                }
            }

            if (cont >= max) {
                max = cont;
                num = i;
            }

            cont = 0;
        }

        int n = (int) (vect.size() / 2);
        if (max > n) {
            return num;
        } else {
            throw new MayoritarioDYV.NoMayoritarioExceptionn();
        }

    }

}
