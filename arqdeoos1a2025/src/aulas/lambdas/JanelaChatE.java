package aulas.lambdas;

import aulas.classe.especial.interna.JanelaChat;


public class JanelaChatE extends JanelaChat{
    public JanelaChatE(){
        jButtonApagar.addActionListener((ae) -> {
            System.out.println("Apagar Mensagem");
            jTextAreaMensagem.setText("");
            jTextAreaMensagem.requestFocusInWindow();
            
        });
        
        jButtonEnviar.addActionListener((ae) -> {
            System.out.println("Enviar Mensagem");
            String msg = jTextAreaMensagem.getText();
            
            if(msg.isEmpty() == false){
                jTextAreaHistorico.append(msg + "\n");
                jTextAreaMensagem.setText("");
            }
            
          jTextAreaMensagem.requestFocusInWindow();
            
        });
    }
    
    public static void main(String[] args) {
        JanelaChatE janela = new JanelaChatE();
    }
}
