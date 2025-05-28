package br.ufes.inf.lives;

import java.io.FileReader;
import java.io.Reader;
import java.util.Collections;
import java.util.LinkedList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CountryLineList {
    
    private LinkedList <CountryLine> paises = new LinkedList<>() ;
    private String gen;
    private String ano;

    public CountryLineList(String filename, String ano, String gen){
        
        
        this.gen = gen;
        try{
            Reader in = new FileReader(filename);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records) {
                String pais = record.get(0);
                String sigla = record.get(1);
                String ano1 = record.get(2);
                String masc = record.get(3);
                String mulher = record.get(4);
                if (ano.equals(ano1)) {
                    CountryLine novo = new CountryLine(pais, sigla, ano1, masc, mulher);
                    paises.addLast(novo);
                }
    
            }
        }
        catch(Exception e){
            System.out.println("Erro na leiturav de dados");
            return;

        }
        if(gen.equals("fem")){
            Collections.sort(paises, new ComparaCountryLineFem());
        }else if(gen.equals("masc")){
            Collections.sort(paises, new ComparaCountryLineMasc());
        }
        
    }
    public LinkedList<CountryLine> getPaises(){
        return this.paises;
    }
}