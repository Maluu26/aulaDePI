package br.ufes.inf.lives;

import java.io.FileReader;
import java.io.Reader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        Reader in = new FileReader("female-and-male-life-expectancy-at-birth-in-years.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        LinkedList<Pais> paises = new LinkedList<>();
        for (CSVRecord record : records) {
            String pais = record.get(0);
            String sigla = record.get(1);
            String ano = record.get(2);
            String mulher = record.get(4);
            if (ano.equals("2020")) {
                Pais novo = new Pais(pais, sigla, ano, mulher);
                paises.addLast(novo);
            }

        }
        Collections.sort(paises, new ComparaPaises());
        int i = 0;
        for(Pais p: paises){
            i++;
            System.out.println(i + "° - " + p.getNome() + ", " +  p.getExpectativa() );
        }
    }
}
