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
