import java.awt.*;
import javax.swing.*;

public class FlowLayoutFrame extends JFrame {

    private Container container;

    private JLabel loginLabel;
    private JTextField loginTexto;
    private JLabel senhaLabel;
    private JPasswordField senhaTexto;

    // CONFIGURA GUI
    public FlowLayoutFrame() {
        super("Demonstração de um Layout");

        container = getContentPane(); // Obtém o contêiner para layout
        setLayout(new FlowLayout(FlowLayout.LEFT)); // Configura o layout do frame

        // Painel para os campos de login e senha com layout vertical (BoxLayout)
        JPanel quadradosCaixinhas = new JPanel();
        quadradosCaixinhas.setLayout(new BoxLayout(quadradosCaixinhas, BoxLayout.Y_AXIS));

        // Campo de login
        loginLabel = new JLabel("Login:");
        loginTexto = new JTextField(15);
        quadradosCaixinhas.add(loginLabel);
        quadradosCaixinhas.add(loginTexto);

        // Espaço entre os campos
        quadradosCaixinhas.add(Box.createVerticalStrut(10));

        // Campo de senha
        senhaLabel = new JLabel("Senha:");
        senhaTexto = new JPasswordField(15);
        quadradosCaixinhas.add(senhaLabel);
        quadradosCaixinhas.add(senhaTexto);

        // Criando o painel quadrado
        JPanel quadradinho = new JPanel();
        quadradinho.setPreferredSize(new Dimension(100, 100)); // Tamanho fixo para o quadrado
        quadradinho.setBackground(Color.LIGHT_GRAY); // Cor de fundo para o quadrado

        // Criar um painel principal para agrupar os campos e o quadrado
        JPanel quadradoPrincipal = new JPanel(new FlowLayout(FlowLayout.LEFT));
        quadradoPrincipal.add(quadradosCaixinhas); // Adiciona o painel dos campos
        quadradoPrincipal.add(quadradinho); // Adiciona o painel quadrado

        // Adiciona o painel principal ao frame
        add(quadradoPrincipal);

        // Configuração do tamanho da janela
        setSize(400, 200);
    }
}
