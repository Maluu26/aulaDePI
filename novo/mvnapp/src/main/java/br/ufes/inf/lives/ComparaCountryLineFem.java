package br.ufes.inf.lives;

import java.util.Comparator;

public class ComparaCountryLineFem implements Comparator<CountryLine>{

 
    public int compare(CountryLine arg0, CountryLine arg1) {
        
        if(arg0.getExpectativaFem()>arg1.getExpectativaFem()) return 1;
        if(arg0.getExpectativaFem()<arg1.getExpectativaFem()) return -1;
        return 0;
    }
    
}
