package br.com.project.movie.model;

public class Filme {

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
