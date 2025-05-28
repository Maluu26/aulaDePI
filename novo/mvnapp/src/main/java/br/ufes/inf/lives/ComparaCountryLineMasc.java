package br.ufes.inf.lives;

import java.util.Comparator;

public class ComparaCountryLineMasc implements Comparator<CountryLine>{

 
    public int compare(CountryLine arg0, CountryLine arg1) {
        
        if(arg0.getExpectativaMasc()>arg1.getExpectativaMasc()) return 1;
        if(arg0.getExpectativaMasc()<arg1.getExpectativaMasc()) return -1;
        return 0;
    }
    
}
