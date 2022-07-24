import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Teste teste1 = new Teste ();
        teste1.setTitulo (" teste comportamento ");
        teste1.setDescricao(" descrição avaliar comportamento ");
        teste1.setcargaHoraria ( 5 );

        Teste teste2 = new Teste ();
        teste2.setTitulo (" teste habilidade ");
        teste2.setDescricao(" descrição avaliar habilidade ");
        teste2.setcargaHoraria ( 6 );

        Lider lider = new Lider();
        lider.setTitulo (" Liderar comportamento ");
        lider.setDescricao ("Descrição liderar comportamento");
        lider.setDate(LocalDate.now());


        Jogosdeempresas jogosdeempresas = new Jogosdeempresas();
        jogosdeempresas.setNome("Teste de Comportamento");
        jogosdeempresas.setDescricao("Descricao Teste Comportamental");
        jogosdeempresas.getJogos().add(teste1);
        jogosdeempresas.getJogos().add(teste2);
        jogosdeempresas.getJogos().add(lider);

        Jogador Luíza = new Jogador();
        Luíza.setNome("Luíza");
        Luíza.inscreverJogosdeempresas(jogosdeempresas);
        System.out.println("Jogos Inscritos Luíza:" + Luíza.getJogosIniciados());
        Luíza.pontuar();
        System.out.println("..");
        System.out.println("Jogos Inscritos Luíza:" + Luíza.getJogosIniciados());
        System.out.println("Jogos Concluídos  Luíza:" + Luíza.getJogoEncerrados());
        System.out.println("Pontos:"+ Luíza.calcularPontos());
        System.out.println("...........");

        Jogador Fernanda = new Jogador();
        Fernanda.setNome("Fernanda");
        Fernanda.inscreverJogosdeempresas(jogosdeempresas);
        System.out.println("Conteúdos Inscritos Fernanda:" + Fernanda.getJogosIniciados());
        Fernanda.pontuar();
        Fernanda.pontuar();
        Fernanda.pontuar();
        System.out.println("..");
        System.out.println("Conteúdos Inscritos Fernanda:" + Fernanda.getJogosIniciados());
        System.out.println("Jogos Concluídos  Fernanda:" + Fernanda.getJogoEncerrados());
        System.out.println("Pontos:"+ Fernanda.calcularPontos());

        Jogador Lucas = new Jogador();
        Lucas.setNome("Lucas");
        Lucas.inscreverJogosdeempresas(jogosdeempresas);
        System.out.println("Conteúdos Inscritos Lucas:" + Fernanda.getJogosIniciados());
        Lucas.pontuar();
        Lucas.pontuar();
        System.out.println("..");
        System.out.println("Conteúdos Inscritos Lucas:" + Lucas.getJogosIniciados());
        System.out.println("Jogos Concluídos  Lucas:" + Lucas.getJogoEncerrados());
        System.out.println("Pontos:"+ Lucas.calcularPontos());
    }
}
