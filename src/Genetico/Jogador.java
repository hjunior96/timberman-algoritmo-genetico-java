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
public class Jogador {
    private byte direita;
    private byte esquerda;
    private int score;
    
    
    public Jogador(){}
    public Jogador(byte direita, byte esquerda){
        this.direita = direita;
        this.esquerda = esquerda;
        this.score= 0;
    }

    public byte getDireita() {
        return direita;
    }

    public void setDireita(byte direita) {
        this.direita = direita;
    }

    public byte getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(byte esquerda) {
        this.esquerda = esquerda;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
}
