package br.com.dio.desafio.dominio;

import java.util.*;

public class Jogador {

    private String nome;
    private Set<Jogo> jogosIniciados = new LinkedHashSet<>();
    private Set<Jogo> jogosEncerrados = new LinkedHashSet<>();

    public void inscreverJogosdeempresas(Jogosdeempresas jogosdeempresas) {
        this.jogosIniciados.addAll(Jogosdeempresas.getJogos());
        Jogosdeempresas.getjogadoresInscritos().add(this);
    }
    public void pontuar() {
        Optional<Jogo> jogo = this.jogosIniciados.stream().findFirst();
        if (jogo.isPresent()) {
            this.jogosEncerrados.add(jogo.get());
            this.jogosIniciados.remove(jogo.get());
        } else {

            System.err.println("Você não está participando desta jogada");
        }

    }

    public double calcularPontos () {
            Iterator<Jogo> iterator = this.jogosEncerrados.iterator();
            double soma = 0;
            while (iterator.hasNext()) {
                double next = iterator.next().calcularPontos();
                soma += next;
            }
            return soma;
        }

        public String getNome () {
            return nome;
        }


        public void setNome (String nome){
            this.nome = nome;
        }

        public Set<Jogo> getJogosIniciados() {
            return jogosIniciados;
        }

        public void setJogoIniciados (Set < Jogo > jogosIniciados) {
            this.jogosIniciados = jogosIniciados;
        }

        public Set<Jogo> getJogoEncerrados() {
            return jogosEncerrados;
        }

        public void setJogosEncerrados (Set<Jogo> jogosEncerrados) {
            this.jogosEncerrados = jogosEncerrados;
        }

        @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Jogador jogador = (Jogador) o;
            return Objects.equals(nome, jogador.nome) && Objects.equals(jogosIniciados, jogador.jogosIniciados) && Objects.equals(jogosEncerrados, jogador.jogosEncerrados);
        }

        @Override
        public  int  hashCode()  {
            return Objects.hash(nome, jogosIniciados, jogosEncerrados);
        }

}


