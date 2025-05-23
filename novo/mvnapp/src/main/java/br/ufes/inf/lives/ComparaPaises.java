package br.ufes.inf.lives;

import java.util.Comparator;

public class ComparaPaises implements Comparator<Pais> {

    
    public int compare(Pais arg0, Pais arg1) {
        if(arg0.getExpectativa()>arg1.getExpectativa()) return -1;
        if(arg0.getExpectativa()<arg1.getExpectativa()) return 1;
        return 0;

    }
    
}
