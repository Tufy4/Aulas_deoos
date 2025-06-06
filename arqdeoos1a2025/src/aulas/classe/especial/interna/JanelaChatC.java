package aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JanelaChatC extends JanelaChat implements ActionListener{

    public JanelaChatC() {
        jButtonApagar.addActionListener(this);
        jButtonEnviar.addActionListener(this);
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Apagar")){
             
            System.out.println("Apagar Mensagem!");
            jTextAreaMensagem.setText("");
            jTextAreaMensagem.requestFocusInWindow();
            
        }else{
            System.out.println("Enviar Mensagem!");
        
        String msg = jTextAreaMensagem.getText();
        
        if(msg.isEmpty() == false){
            
            jTextAreaHistorico.append(msg + "\n");
            jTextAreaMensagem.setText("");
        }
        
        
        jTextAreaMensagem.requestFocusInWindow();
        }
    }
    
}
