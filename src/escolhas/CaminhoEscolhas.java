
package escolhas;

import bean.Personagem;
import bean.Situacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import telas.TelaComecar;
import telas.TelaIniciar;

public class CaminhoEscolhas {
    public static String caminho = "";
    Situacao situacao = null;
    private final List<String> emocoesAA = new ArrayList();
    private final List<String> emocoesA = new ArrayList();
    
    public CaminhoEscolhas(){
        this.caminho = "";
    }
    
    public Situacao configurar(String acao, Personagem personagem, int pontuacao){
        int n;
        situacao = new Situacao();
        caminho = caminho + acao;
        System.out.println(caminho);
        

        //CLICOU NO PRIMEIRO BOTAO PELA PRIMEIRA VEZ
        if(caminho.equals("1")){
            //ZERA AS LISTAS PARA DAR NOVOS VALORES PARA ELAS
            emocoesAA.removeAll(emocoesAA);
            emocoesA.removeAll(emocoesA);
            
            //ADICIONA AS EMOÇÕES DA SITUACAO NA LISTA APÓS A AÇÃO
            emocoesAA.add("Orgulho");
            emocoesAA.add(sorteio("Admiração","Reprovação"));
            emocoesAA.add(sorteio("Esperança","Medo"));
            
            
            //ADICIONA AS EMOÇÕES ATUAIS
            emocoesA.add("Alegria");
            emocoesA.add("Amor");
            emocoesA.add("Feliz por outro");
            
            //SETA AS AÇÃOS POSSÍVEIS PARA A SITUAÇÃO
            situacao.setAcao1("<html>Entrar na sala de aula.</html>");
            situacao.setAcao2("<html>Matar aula.</html>");

            
            //SETA A SITUAÇÃO
            situacao.setSituacao("<html>Sua mãe preparou o café da manhã e o serviu.<br/>Logo após o levou à escola. "
                + "<br/><br/>Chegando à escola, avistou seus amgios, Linus e Ada."
                + "<br/>Linus informou para " +personagem.getNome()+ " que havia conseguido boa nota "
                + "em matemática."
                + "<br/>O sinal toca e os alunos começam a entrar nas salas."
                + "<br/><br/>Por favor, escolha uma ação para "+personagem.getNome()+".</html>");
            
            //SETA AS LISTAS
            situacao.setEmocoesAA(emocoesAA);
            situacao.setEmocoesA(emocoesA);
            
            //RETORNA O OBJETO
            return situacao;
            
            
        }else if(caminho.equals("2")){
            //ZERA AS LISTAS PARA DAR NOVOS VALORES PARA ELAS
            emocoesAA.removeAll(emocoesAA);
            emocoesA.removeAll(emocoesA);
            
            //ADICIONA AS EMOÇÕES DA SITUACAO NA LISTA APÓS A AÇÃO
            emocoesAA.add("Raiva");
            emocoesAA.add(sorteio("Esperança","Medo"));
            
            
            //ADICIONA AS EMOÇÕES ATUAIS
            emocoesA.add("Alegria");
            emocoesA.add("Feliz por outro");
            
            //SETA AS AÇÃOS POSSÍVEIS PARA A SITUAÇÃO
            situacao.setAcao1("<html>Entrar na sala de aula.</html>");
            situacao.setAcao2("<html>Matar aula.</html>");
            
            //SETA A SITUAÇÃO
            situacao.setSituacao("<html>Sua mãe fica brava e o força a ir para a escola. "
                + "<br/><br/>Chegando à escola avistou seus amgios Linus e Ada."
                + "<br/>Linus informou para " +personagem.getNome()+ " que havia conseguido boa nota "
                + "em matemática."
                + "<br/>O sinal toca e os alunos começam a entrar nas salas."
                + "<br/><br/>Por favor, escolha uma ação para "+personagem.getNome()+".</html>");
            
            //SETA AS LISTAS
            situacao.setEmocoesAA(emocoesAA);
            situacao.setEmocoesA(emocoesA);
            
            //RETORNA O OBJETO
            return situacao;
            
            
        }else if(caminho.equals("11")){
            //ZERA AS LISTAS PARA DAR NOVOS VALORES PARA ELAS
            emocoesAA.removeAll(emocoesAA);
            emocoesA.removeAll(emocoesA);
            
            //ADICIONA AS EMOÇÕES DA SITUACAO NA LISTA APÓS A AÇÃO
            String emocao = sorteio("Esperança","Medo");
            emocoesAA.add(emocao);
            
            
            //ADICIONA AS EMOÇÕES ATUAIS
            if(emocao.equals("Esperança")){
                emocoesA.add("Júbilo");
            }else{
                emocoesA.add("Medo confirmado");
            }
            
            //SETA AS AÇÃOS POSSÍVEIS PARA A SITUAÇÃO
            situacao.setAcao1("<html>67º.</html>");
            situacao.setAcao2("<html>157º.</html>");
            
            //SETA A SITUAÇÃO
            situacao.setSituacao("<html>Aula de mátematica. "
                + "<br/><br/>O Professor Andrew Tanenbaum está passando o conceito de ângulos complementares."
                + "<br/>O professor faz uma perguta para "+personagem.getNome()+"." 
                + "<br/>'Qual o complemento de 27º, "+personagem.getNome()+"?'"
                + "<br/><br/>Por favor, escolha uma ação para "+personagem.getNome()+".</html>");
            
            //SETA AS LISTAS
            situacao.setEmocoesAA(emocoesAA);
            situacao.setEmocoesA(emocoesA);
            
            //RETORNA O OBJETO
            return situacao;
            
            
        }else if(caminho.equals("12")){
            //ZERA AS LISTAS PARA DAR NOVOS VALORES PARA ELAS
            emocoesAA.removeAll(emocoesAA);
            emocoesA.removeAll(emocoesA);
            
            //ADICIONA AS EMOÇÕES DA SITUACAO NA LISTA APÓS A AÇÃO
            
            emocoesAA.add(sorteio("Orgulho", "Vergonha"));
            
            
            //ADICIONA AS EMOÇÕES ATUAIS
            emocoesA.add(sorteio("Esperança", "Medo"));
            
            //SETA AS AÇÃOS POSSÍVEIS PARA A SITUAÇÃO
            situacao.setAcao1("<html>Velocidade é igual a espaço sobre tempo.</html>");
            situacao.setAcao2("<html>Velocidade é igual a tempo mais espaço.</html>");
            
            //SETA A SITUAÇÃO
            situacao.setSituacao("<html>Na tentativa de ficar fora da aula, o espetor o encontra e o leva direto para a aula. "
                + "<br/>Aula de física."
                + "<br/><br/>O professor faz uma perguta para "+personagem.getNome()+"." 
                + "<br/>'Qual é a formula da velocidade, "+personagem.getNome()+"?'"
                + "<br/><br/>Por favor, escolha uma ação para "+personagem.getNome()+".</html>");
            
            //SETA AS LISTAS
            situacao.setEmocoesAA(emocoesAA);
            situacao.setEmocoesA(emocoesA);
            
            //RETORNA O OBJETO
            return situacao;
            
            
        }
        else if(caminho.equals("21")){
            //ZERA AS LISTAS PARA DAR NOVOS VALORES PARA ELAS
            emocoesAA.removeAll(emocoesAA);
            emocoesA.removeAll(emocoesA);
            
            //ADICIONA AS EMOÇÕES DA SITUACAO NA LISTA APÓS A AÇÃO
            String emocao = sorteio("Esperança","Medo");
            emocoesAA.add(emocao);
            
            
            //ADICIONA AS EMOÇÕES ATUAIS
            if(emocao.equals("Esperança")){
                emocoesA.add("Júbilo");
            }else{
                emocoesA.add("Medo confirmado");
            }
            
            //SETA AS AÇÃOS POSSÍVEIS PARA A SITUAÇÃO
            situacao.setAcao1("<html>Velocidade é igual a espaço sobre tempo.</html>");
            situacao.setAcao2("<html>Velocidade é igual a tempo mais espaço.</html>");
            
            //SETA A SITUAÇÃO
            situacao.setSituacao("<html>Na tentativa de ficar fora da aula, o espetor o encontra e o leva direto para a aula. "
                + "<br/>Aula de física."
                + "<br/><br/>O professor faz uma perguta para "+personagem.getNome()+"." 
                + "<br/>'Qual é a formula da velocidade, "+personagem.getNome()+"?'"
                + "<br/><br/>Por favor, escolha uma ação para "+personagem.getNome()+".</html>");
            
            //SETA AS LISTAS
            situacao.setEmocoesAA(emocoesAA);
            situacao.setEmocoesA(emocoesA);
            
            //RETORNA O OBJETO
            return situacao; 
        }
        
        else if(caminho.equals("22")){
            //ZERA AS LISTAS PARA DAR NOVOS VALORES PARA ELAS
            emocoesAA.removeAll(emocoesAA);
            emocoesA.removeAll(emocoesA);
            
            //ADICIONA AS EMOÇÕES DA SITUACAO NA LISTA APÓS A AÇÃO
            
            emocoesAA.add(sorteio("Orgulho", "Vergonha"));
            
            
            //ADICIONA AS EMOÇÕES ATUAIS
            emocoesA.add(sorteio("Esperança", "Medo"));
            
            
            //SETA AS AÇÃOS POSSÍVEIS PARA A SITUAÇÃO
            situacao.setAcao1("<html>Ácido etanoico (ácido acético) e água.</html>");
            situacao.setAcao2("<html>Ácido etanoico e etanal.</html>");
            
            //SETA A SITUAÇÃO
            situacao.setSituacao("<html>Na tentativa de ficar fora da aula, o espetor o encontra e o leva direto para a aula. "
                + "<br/>Aula de química."
                + "<br/><br/>O professor faz uma perguta para "+personagem.getNome()+"." 
                + "<br/>' "+personagem.getNome()+", o vinagre usado para temperar saladas é uma mistura, em proporções adequadas, de...'"
                + "<br/><br/>Por favor, escolha uma ação para "+personagem.getNome()+".</html>");
            
            //SETA AS LISTAS
            situacao.setEmocoesAA(emocoesAA);
            situacao.setEmocoesA(emocoesA);
            
            //RETORNA O OBJETO
            return situacao;
            
            
        }
        
        else if(caminho.equals("111")){
            //ZERA AS LISTAS PARA DAR NOVOS VALORES PARA ELAS
            emocoesAA.removeAll(emocoesAA);
            emocoesA.removeAll(emocoesA);
            
            //ADICIONA AS EMOÇÕES DA SITUACAO NA LISTA APÓS A AÇÃO
            emocoesAA.add("Orgulho");
            
            
            //ADICIONA AS EMOÇÕES ATUAIS
            
            
            //SETA AS AÇÃOS POSSÍVEIS PARA A SITUAÇÃO
            situacao.setAcao1("<html>Dizer que está cansado e ir para casa.</html>");
            situacao.setAcao2("<html>Aceitar.</html>");
            
            //SETA A SITUAÇÃO
            situacao.setSituacao("<html>Resposta correta. "
                + "<br/>O Professor parabeniza "+personagem.getNome()+"."
                + "<br/><br/>Ao final das aulas Linus e Ada convidam "+personagem.getNome()+" "
                    + "para ir ao Shopping"
                + "<br/><br/>Por favor, escolha uma ação para "+personagem.getNome()+".</html>");
            
            //SETA AS LISTAS
            situacao.setEmocoesAA(emocoesAA);
            situacao.setEmocoesA(emocoesA);
            
            //RETORNA O OBJETO
            return situacao;
            
        }
        else{
            situacao.setSituacao("FIM");
            return situacao;
        }
    }
    
    public String sorteio(String emocao1, String emocao2){
        int n = (int) (1 + Math.random() * (10));
        if(n <=5){
            return emocao1;
        }else{
            return emocao2;
        }
    }
}
