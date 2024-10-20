import javax.swing.JFrame;  // Importação da classe JFrame para criar uma janela.
import javax.swing.JButton;  // Importação da classe JButton para criar botões.
import java.awt.*;           // Importação geral de pacotes de layout e gráficos.
import javax.swing.*;        // Importação de outros componentes do Swing (JLabel, JTextField, etc.).

public class Janela extends JFrame {

    // Declaração dos componentes da interface (botões, labels e campos de texto).
    private JButton bConfirm, bWant, bPlus;    // Botões para ações específicas.
    private JLabel imagemLabel;                // Label para exibir a imagem.
    private JLabel loginLabel;                 // Label para o campo de login.
    private JTextField loginTexto;             // Campo de texto para o login.
    private JLabel senhaLabel;                 // Label para o campo de senha.
    private JPasswordField senhaTexto;         // Campo de senha para entrada da senha.

    public Janela() {

        super("Aula de Programação 2 com Emanoel Barreiros");  // Define o título da janela.

        setLayout(new FlowLayout(FlowLayout.LEFT));  // Define o layout inicial como FlowLayout alinhado à esquerda.

        // Carrega a imagem do caminho especificado.
        ImageIcon imagemOriginal = new ImageIcon("Imagem\\cartaz.png");

        // Redimensiona a imagem para 400x400 pixels, mantendo a qualidade.
        Image imagemRedimensionada = imagemOriginal.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon imagem = new ImageIcon(imagemRedimensionada); // Cria um novo ImageIcon com a imagem redimensionada.

        imagemLabel = new JLabel(imagem);  // Cria um JLabel para exibir a imagem.
        add(imagemLabel);                  // Adiciona o JLabel com a imagem ao frame.

        // Cria os botões com seus respectivos textos.
        bConfirm = new JButton("Confirmar Presença");
        bWant = new JButton("Quero me Inscrever");
        bPlus = new JButton("Saiba Mais!");

        FlowLayout flow = new FlowLayout();  // Cria um novo FlowLayout com configurações padrão.
        setLayout(flow);  // Define o layout do frame como FlowLayout.

        // Adiciona os botões ao frame.
        add(bConfirm);
        add(bPlus);
        add(bWant);

        // Cria um painel para organizar os campos de login e senha verticalmente.
        JPanel quadradosCaixinhas = new JPanel();
        quadradosCaixinhas.setLayout(new BoxLayout(quadradosCaixinhas, BoxLayout.Y_AXIS));  // Organiza os componentes em uma coluna (Y_AXIS).

        // Cria e adiciona o label e o campo de texto para o login.
        loginLabel = new JLabel("Login:");
        loginTexto = new JTextField(15);  // Campo de texto com 15 colunas.
        quadradosCaixinhas.add(loginLabel);
        quadradosCaixinhas.add(loginTexto);

        // Adiciona um espaço entre o campo de login e o campo de senha.
        quadradosCaixinhas.add(Box.createVerticalStrut(10));

        // Cria e adiciona o label e o campo de senha.
        senhaLabel = new JLabel("Senha:");
        senhaTexto = new JPasswordField(15);  // Campo de senha com 15 colunas.
        quadradosCaixinhas.add(senhaLabel);
        quadradosCaixinhas.add(senhaTexto);

        // Cria um painel principal com FlowLayout para centralizar o painel dos campos de login/senha.
        JPanel quadradoPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER));
        quadradoPrincipal.add(quadradosCaixinhas);  // Adiciona o painel de login/senha ao painel principal.

        // Adiciona o painel principal ao frame.
        add(quadradoPrincipal);

        setResizable(true);  // Permite redimensionar a janela.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define o comportamento ao fechar a janela: encerra o programa.

        setSize(500, 650);  // Define o tamanho da janela.
    }

    public static void main(String[] args) {
        new Janela();  // Cria e exibe a janela ao executar o programa.
    }
}
