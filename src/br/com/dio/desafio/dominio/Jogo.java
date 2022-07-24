package br.com.dio.desafio.dominio;

public abstract class Jogo {
    protected  static final double calcularPontos = 20d;

    private String titulo;
    private String descricao;

    public abstract double calcularPontos();

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }
}
