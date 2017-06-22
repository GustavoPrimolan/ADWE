/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Primolan
 */
public class Situacao {
    private String hora, minuto, situacao, acao1, acao2, acao3;
    private List<String> emocoesAA = new ArrayList();
    private List<String> emocoesA = new ArrayList();
    public Situacao(){
        
    }

    public String getAcao1() {
        return acao1;
    }

    public void setAcao1(String acao1) {
        this.acao1 = acao1;
    }

    public String getAcao2() {
        return acao2;
    }

    public void setAcao2(String acao2) {
        this.acao2 = acao2;
    }

    public String getAcao3() {
        return acao3;
    }

    public void setAcao3(String acao3) {
        this.acao3 = acao3;
    }

    public List<String> getEmocoesAA() {
        return emocoesAA;
    }

    public void setEmocoesAA(List<String> emocoesAA) {
        this.emocoesAA = emocoesAA;
    }

    public List<String> getEmocoesA() {
        return emocoesA;
    }

    public void setEmocoesA(List<String> emocoesA) {
        this.emocoesA = emocoesA;
    } 
    
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }
    
}
