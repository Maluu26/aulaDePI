package br.ufes.inf.lives;

public class Pais {
    private String nome;
    private String sigla;
    private String ano;
    private Float expectativa;

    public Pais(String nome, String sigla, String ano, String expectativa){
        this.nome = nome;
        this.sigla = sigla;
        this.ano = ano;
        this.expectativa = Float.parseFloat(expectativa);
    }
    public float getExpectativa(){
        return expectativa;
    }
    public String getNome(){
        return nome;
    }
}
