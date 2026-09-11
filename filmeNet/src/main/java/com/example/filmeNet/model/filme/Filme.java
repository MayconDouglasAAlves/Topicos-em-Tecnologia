package com.example.filmeNet.model.filme;

import jakarta.persistence.*;

@Entity
@Table(name="Filme")

public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer ano;
    private String genero;

    public Filme(){}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    public Filme (DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.ano = dados.ano();
        this.genero = dados.genero();
    }


}
