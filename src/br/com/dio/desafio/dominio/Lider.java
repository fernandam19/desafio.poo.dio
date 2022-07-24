package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public  class Lider extends Jogo {


    private LocalDate date;

    @Override
    public double calcularPontos() {

        return calcularPontos + 20d ;
    }
    public Lider() {
    }


    public LocalDate getDate() {

        return date;
    }

    public void setDate(LocalDate date) {

        this.date = date;
    }

    @Override
    public String toString() {

        return "Lider{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }

}