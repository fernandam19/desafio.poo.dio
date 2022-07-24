package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import  java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Jogosdeempresas {
    private String nome;
    private String descricao;
    private final LocalDate dateInicial = LocalDate.now();
    private final LocalDate dateFinal = dateInicial.plusDays(1);
    private static Set<Jogador> jogosIniciados = new HashSet<>();
    private static Set<Jogador> jogadoresInscritos = new HashSet<>();
    private static Set<Jogo> jogos = new LinkedHashSet<>();


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dateInicial;
    }

    public LocalDate getDataFinal() {
        return dateFinal;
    }


    public static Set<Jogador> getjogadoresInscritos() {
        return jogadoresInscritos;
    }

  public void setJogadoresInscritos(Set<Jogador> jogadoresIncritos){
        this.jogadoresInscritos = jogadoresIncritos;
  }
    public static Set<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(Set<Jogo> jogos) {
        this.jogos = jogos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogosdeempresas jogosdeempresas = (Jogosdeempresas) o;
        return Objects.equals(nome, jogosdeempresas.nome) && Objects.equals(descricao, jogosdeempresas.descricao) && Objects.equals(dateInicial, jogosdeempresas.dateInicial) && Objects.equals(dateFinal, jogosdeempresas.dateFinal) && Objects.equals(jogadoresInscritos, jogosdeempresas.jogadoresInscritos) && Objects.equals(jogos, jogosdeempresas.jogos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dateInicial, dateFinal, jogosIniciados, jogos);
    }
}
