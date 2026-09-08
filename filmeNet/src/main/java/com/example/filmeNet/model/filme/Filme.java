package com.example.filmeNet.model.filme;

public class Filme {
    private String nome;
    private Integer ano;
    private String genero;

    public Filme (DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.ano = dados.ano();
        this.genero = dados.genero();
    }

    public String getNome() {
        return nome;
    }

    public Integer ano() {
        return ano;
    }

    public String genero() {
        return genero;
    }

}
