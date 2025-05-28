package br.ufes.inf.lives;

public class CountryLine{
    private String nome;
    private Float expectativaFem;
    private Float expectativaMasc;
    private String sigla;
    private String ano;

    public CountryLine(String nome, String sigla, String ano, String expectativaFem, String expectativaMasc){
        this.nome = nome;
        this.sigla = sigla;
        this.ano = ano;
        this.expectativaFem = Float.parseFloat(expectativaFem);
        this.expectativaMasc = Float.parseFloat(expectativaMasc);
    }
    public Float getExpectativaFem(){
        return this.expectativaFem;
    }
    public Float getExpectativaMasc(){
        return this.expectativaMasc;
    }
 
}