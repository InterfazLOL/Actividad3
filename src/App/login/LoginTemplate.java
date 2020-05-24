package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginTemplate extends JFrame {

    private JPanel pIzquierda, pDerecha;
    private JLabel lTituloApp, lFondo, lIcon;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    //private JComboBox cbTipoUsuario;
    private JCheckBox checkMantenerConexion;
    private JButton bAyuda, bEntrar, bCrearCuenta, bCantSesion, bVers;
    private Border borderCampos;

    // Declarancion objetos decoradores
    private Color colorFndoIzq, colorFndoCampos, colorFont, colorFontOp;
    private Font fontPrincipal, fontSecundaria, fontPer;
    private Cursor cMano;
    private ImageIcon iIcon, iFondo, iAyuda, iAux, iEntrar;

    public LoginTemplate() {

        colorFndoIzq = new Color(249, 249, 249);
        colorFndoCampos = new Color(237, 237, 237);
        colorFont = new Color(0, 0, 0);
        colorFontOp = new Color(0, 0, 0, 80);
        fontPrincipal = new Font("Typold Condensed Medium", Font.BOLD, 22);
        fontSecundaria = new Font("Typold Condensed Medium", Font.BOLD, 11);
        fontPer = new Font("Typold Condensed Medium", Font.BOLD, 13);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        borderCampos = BorderFactory.createLineBorder(colorFndoCampos, 3, true);

        iIcon = new ImageIcon("resources/img/iLogin.jpg");
        iFondo = new ImageIcon("resources/img/fondoLogin.jpg");
        iAyuda = new ImageIcon("resources/img/ayuda.png");
        iEntrar = new ImageIcon("resources/img/loginEntrar.png");

        pIzquierda = new JPanel();
        pIzquierda.setSize(400, 730);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setLayout(null);
        pIzquierda.setBackground(colorFndoIzq);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(900, 730);
        pDerecha.setLocation(400, 0);
        pDerecha.setLayout(null);
        //pDerecha.setBackground(Color.RED);
        this.add(pDerecha);

        iAux = new ImageIcon(iIcon.getImage().getScaledInstance(60, 65, Image.SCALE_SMOOTH));
        lIcon = new JLabel();
        lIcon.setBounds(50, 45, 60 , 65);
        lIcon.setIcon(iAux);
        pIzquierda.add(lIcon);

        iAux = new ImageIcon(iAyuda.getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bAyuda = new JButton();
        bAyuda.setSize(15, 15);
        bAyuda.setLocation(320, 70);
        bAyuda.setIcon(iAux);
        bAyuda.setBorder(null);
        bAyuda.setContentAreaFilled(false);
        bAyuda.setFocusable(false);
        pIzquierda.add(bAyuda);

        lTituloApp = new JLabel("<html><div align='justify'> Iniciar sesión con tu cuenta de Rito </div> </html>");
        lTituloApp.setSize(284, 60);
        lTituloApp.setLocation((pIzquierda.getWidth() - lTituloApp.getWidth()) / 2, 170);
        lTituloApp.setForeground(colorFont);
        lTituloApp.setFont(fontPrincipal);
        lTituloApp.setHorizontalAlignment(SwingConstants.LEFT);
        pIzquierda.add(lTituloApp);

        tNombreUsuario = new JTextField("NOMBRE DE USUARIO");
        tNombreUsuario.setSize(284, 47);
        tNombreUsuario.setLocation((pIzquierda.getWidth() - tNombreUsuario.getWidth()) / 2, 280);
        tNombreUsuario.setFont(fontSecundaria);
        tNombreUsuario.setForeground(colorFontOp);
        tNombreUsuario.setBackground(colorFndoCampos);
        tNombreUsuario.setCaretColor(Color.BLACK);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreUsuario.setBorder(borderCampos);
        pIzquierda.add(tNombreUsuario);

        tClaveUsuario = new JPasswordField();
        tClaveUsuario.setSize(284, 47);
        tClaveUsuario.setLocation((pIzquierda.getWidth() - tClaveUsuario.getWidth()) / 2, 344);
        tClaveUsuario.setText("Contraseña");
        tClaveUsuario.setFont(fontSecundaria);
        tClaveUsuario.setForeground(colorFontOp);
        tClaveUsuario.setBackground(colorFndoCampos);
        tClaveUsuario.setBorder(null);
        // tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(tClaveUsuario);

        checkMantenerConexion = new JCheckBox("Permanecer conectado");
        checkMantenerConexion.setSize(283, 30);
        checkMantenerConexion.setLocation(56, 410);
        checkMantenerConexion.setFocusable(false);
        checkMantenerConexion.setFont(fontPer);
        checkMantenerConexion.setForeground(colorFontOp);
        checkMantenerConexion.setBackground(colorFndoIzq);
        checkMantenerConexion.setCursor(cMano);
        pIzquierda.add(checkMantenerConexion);

        /*
         * cbTipoUsuario = new JComboBox(); cbTipoUsuario.addItem("Administrador");
         * cbTipoUsuario.addItem("Cajero"); cbTipoUsuario.addItem("Cliente");
         * cbTipoUsuario.setSize(250, 20);
         * cbTipoUsuario.setLocation((pIzquierda.getWidth()-cbTipoUsuario.getWidth())/2,
         * 450); cbTipoUsuario.setForeground(Color.GRAY);
         * cbTipoUsuario.setBackground(new Color(237, 237, 237)); ((JLabel)
         * cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
         * pIzquierda.add(cbTipoUsuario);
         */
        iAux = new ImageIcon(iEntrar.getImage().getScaledInstance(64, 64, Image.SCALE_AREA_AVERAGING));
        bEntrar = new JButton();
        bEntrar.setSize(64, 64);
        bEntrar.setLocation((pIzquierda.getWidth() - bEntrar.getWidth()) / 2, 486);
        bEntrar.setBorder(null);
        //bEntrar.setContentAreaFilled(false);
        bEntrar.setBackground(new Color(209, 54, 57));
        bEntrar.setIcon(iAux);
        bEntrar.setFocusable(false);
        //bEntrar.setEnabled(false);
        pIzquierda.add(bEntrar);

        bCrearCuenta = new JButton("CREAR UNA CUENTA");
        bCrearCuenta.setSize(165, 14);
        bCrearCuenta.setLocation(50, 640);
        bCrearCuenta.setHorizontalAlignment(SwingConstants.LEFT);
        bCrearCuenta.setCursor(cMano);
        bCrearCuenta.setFont(fontSecundaria);
        bCrearCuenta.setContentAreaFilled(false);
        bCrearCuenta.setBorder(null);
        pIzquierda.add(bCrearCuenta);

        bCantSesion = new JButton("¿NO PUEDES INICIAR SESIÓN?");
        bCantSesion.setSize(165, 14);
        bCantSesion.setLocation(50, 654);
        bCantSesion.setCursor(cMano);
        bCantSesion.setHorizontalAlignment(SwingConstants.LEFT);
        bCantSesion.setFont(fontSecundaria);
        bCantSesion.setContentAreaFilled(false);
        bCantSesion.setBorder(null);
        pIzquierda.add(bCantSesion);

        bVers = new JButton("V 20.3.0");
        bVers.setSize(55, 14);
        bVers.setLocation(290, 654);
        bVers.setCursor(cMano);
        bVers.setHorizontalAlignment(SwingConstants.LEFT);
        bVers.setFont(fontSecundaria);
        bVers.setBorder(null);
        bVers.setContentAreaFilled(false);
        bVers.setFocusable(false);
        pIzquierda.add(bVers);

        //Panel derecho
        iAux = new ImageIcon(iFondo.getImage().getScaledInstance(900, 730, Image.SCALE_AREA_AVERAGING));
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 900, 730);
        lFondo.setIcon(iAux);
        pDerecha.add(lFondo);

        this.setSize(1300, 730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setUndecorated(true);
        this.setTitle("Rito Client");
        this.setVisible(true);
    }
}