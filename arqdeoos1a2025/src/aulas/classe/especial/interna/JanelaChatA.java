
package aulas.classe.especial.interna;

public class JanelaChatA extends JanelaChat{

    public JanelaChatA() {
        jButtonApagar.addActionListener(new ApagarMensagem(jTextAreaMensagem));
        jButtonEnviar.addActionListener(new EnviarMensagem(jTextAreaHistorico,jTextAreaMensagem));
    }
    
}
