/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetico;

/**
 *
 * @author Hamilton
 */
public class Funcoes {
    
    /***
     * Preenche os cromossomos para serem usados no algoritmo genético
     * @param jogadores
     * @return 
     */
    public Jogador[] preencheJogadores(Jogador[] jogadores){
        
        for (int i = 0; i <5;i++){
            //jogadores[i].setDireita(this.gerarAleatorio((byte)4, (byte)1));
            jogadores[i]= new Jogador(this.gerarAleatorio((byte)4, (byte)1),this.gerarAleatorio((byte)4, (byte)1));
            //jogadores[i].setEsquerda(this.gerarAleatorio((byte)4, (byte)1));
            //jogadores[i].setScore(0);
        }
        crossover(jogadores);
        return jogadores;
    }
    
    /**
     * Mistura os cromossomos iniciais para criar cruzamentos
     * @param jogadores 
     */
    public void crossover(Jogador[] jogadores){
        for(int i =5; i < 9; i++){
            if(Math.random() >= 0.5){
                //jogadores[i].setDireita(jogadores[i-5].getDireita());
                jogadores[i] = new Jogador(jogadores[i-5].getDireita(),jogadores[i-4].getEsquerda());
		//jogadores[i].setEsquerda(jogadores[i-4].getEsquerda());
            }else{
		//jogadores[i].setDireita(jogadores[i-4].getDireita());
                jogadores[i] = new Jogador(jogadores[i-4].getDireita(),jogadores[i-5].getEsquerda());
                //jogadores[i].setEsquerda(jogadores[i-5].getEsquerda());
            }
	}
    }
    
    //Pega o último cromossomo e adiciona uma mutação vinda de outro cromossomo aleatório
    public void mutacao(Jogador[] jogadores){
        byte cromossomoBase = this.gerarAleatorio((byte)9,(byte) 1);//Math.floor(Math.random() * (9 - 0 + 1)) + 0;
        Jogador jogadorMutante = new Jogador();
	if(Math.random() >= 0.5){
            jogadorMutante.setDireita(jogadores[cromossomoBase].getDireita()); 
            jogadorMutante.setEsquerda(gerarAleatorio((byte)4,(byte)1));
	}else{
            jogadorMutante.setDireita(gerarAleatorio((byte)4,(byte)1));
            jogadorMutante.setEsquerda(jogadores[cromossomoBase].getEsquerda());
	}
        jogadores[9] = jogadorMutante;
    }
    
    
    /**
     * Gera um número aleatório
     * @param max
     * @param min
     * @return 
     */
    private byte gerarAleatorio(byte max, byte min){
        return (byte) ((byte)(Math.random() * (max -min + 1)) + min);
    }
}
