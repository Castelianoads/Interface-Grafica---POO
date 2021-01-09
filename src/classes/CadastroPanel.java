package classes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroPanel extends TelaPanel {

   private Botao botaoFuncionario;
    private Botao botaoCliente;

    public CadastroPanel(JPanel telas, JFrame janela) {
        super(telas, janela);  
        
        JLabel menssagen = new JLabel("Cadastro");
        menssagen.setBounds(200, 10, 200, 50);

        botaoFuncionario = new Botao("Funcionario");
        botaoFuncionario.setBounds(100, 200, 100, 25);
        botaoFuncionario.addActionListener(this);
        

        botaoCliente = new Botao("Cliente");
        botaoCliente.setBounds(100, 500, 100, 25);
        botaoCliente.addActionListener(this);

        this.add(menssagen);
        this.add(botaoFuncionario);
        this.add(botaoCliente);      
    }

    @Override 
    public void executarBotao(ActionEvent e) {        
        if (e.getSource() == botaoCliente) {
            trocarTela("Tela de cadastro cliente");
        } else if (e.getSource() == botaoFuncionario){
            trocarTela("Tela de cadastro funcionario");
        }
    }        
}
