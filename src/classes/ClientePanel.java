package classes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;

public class ClientePanel extends TelaPanel {

    private JButton botaoVoltar;

    public ClientePanel(JPanel telas, JFrame janela) {
        super(telas, janela);

        
        JLabel menssagen = new JLabel("Cadastro de Cliente");
        menssagen.setBounds(100, 10, 200, 50);

       
        botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(100, 100, 100, 25);
        botaoVoltar.addActionListener(this);
        
        this.add(menssagen);
        this.add(botaoVoltar);
    }

    public void executarBotao (ActionEvent e) {
        trocarTela("Tela de cadastro");
    }
    
    
}
