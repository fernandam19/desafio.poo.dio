package br.com.dio.desafio.dominio;



public class Teste extends Jogo  {


    @Override
    public double calcularPontos() {
        return calcularPontos * cargaHoraria;
    }

    public Teste() {
    }
    private int cargaHoraria;


    public int cargaHoraria() {
        return cargaHoraria();
    }

    public void setcargaHoraria (int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Teste{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
