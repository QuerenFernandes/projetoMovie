package br.com.project.movie.model;

import jakarta.persistence.*;

@Entity
@Table(name = "filmes")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer anoDeLancamento;
    private Integer duracao;
    private String genero;

    public Filme(DadosCadastroFilme dados){
        this.nome = dados.nome();
        this.anoDeLancamento = dados.anoDeLancamento();
        this.duracao = dados.duracao();
        this.genero = dados.genero();

    }
    public String getNome() {
        return nome;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", duracao=" + duracao +
                ", genero='" + genero + '\'' +
                '}';
    }
}
