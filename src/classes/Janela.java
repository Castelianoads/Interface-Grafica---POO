package classes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Janela extends JFrame  {

    public Janela() {
        this.setBounds(0, 0, 1280, 720);
        
        CardLayout controleTelas = new CardLayout();
        JPanel telas = new JPanel(controleTelas);    

        ClientePanel clientePanel = new ClientePanel(telas, this);
        FuncionarioPanel funcionarioPanel = new FuncionarioPanel(telas, this);
        CadastroPanel cadastroPanel = new CadastroPanel(telas, this);

        telas.add(cadastroPanel, "Tela de cadastro");
        telas.add(funcionarioPanel, "Tela de cadastro funcionario");
        telas.add(clientePanel, "Tela de cadastro cliente");
        
        this.add(telas);

        this. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

        // Janela = TV = JFrame
        // cadastroPanel = Canal 1 = JPanel
        // funcionarioPanel = canel 2 = JPanel
        // cadastroPanel = canel 3 = JPanel
    }
    
}
