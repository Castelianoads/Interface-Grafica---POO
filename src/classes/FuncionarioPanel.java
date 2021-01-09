package classes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;

public class FuncionarioPanel extends TelaPanel {

    private Botao botaoVoltar;

    public FuncionarioPanel(JPanel telas, JFrame janela){
        super(telas, janela);

        JLabel menssagen = new JLabel("Cadastro de Funcionario");
        menssagen.setBounds(100, 10, 200, 50);

        botaoVoltar = new Botao("Voltar"); 
        botaoVoltar.setBounds(100, 100, 100, 25);
        botaoVoltar.addActionListener(this);
        
        this.add(menssagen);
        this.add(botaoVoltar);
        
    }

    public void executarBotao (ActionEvent e) {
        trocarTela("Tela de cadastro");
    }    
}
