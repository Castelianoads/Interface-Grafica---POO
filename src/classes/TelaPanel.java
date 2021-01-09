package classes;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class TelaPanel extends JPanel implements ActionListener {
    private JPanel telas;
    private CardLayout controleTelas;
    private JFrame janela;

    public TelaPanel(JPanel telas, JFrame janela) {
        this.telas = telas;
        this.controleTelas = (CardLayout) telas.getLayout();
        this.janela = janela;
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       executarBotao(e);
    }

    protected void executarBotao (ActionEvent e) {
        
    }

    protected void trocarTela(String identificador) {
        controleTelas.show(telas, identificador);
    }
    
}

