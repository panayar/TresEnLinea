package view;

import javax.swing.*;
import java.awt.*;

public class PanelIngreso extends JPanel {

    private JButton btn_Sonido;
    private JButton btn_noSonido;
    private JButton btn_ingresar;
    private JButton btn_volver;
    private JPasswordField contrasena;
    private JTextField usuario;
    private JLabel txt_1;
    private JLabel txt_2;
    private JLabel txt_3;
    private JLabel logo;

    public PanelIngreso() {

        setLayout(null);
        setBounds(520, 10, 50, 50);
        setBackground(Color.white);
        inicializarComponentes();
        setVisible(false);

    }

    public void inicializarComponentes() {


        ImageIcon file_img = new ImageIcon(getClass().getResource("/img/miniLogo.png"));
        ImageIcon icon = new ImageIcon(file_img.getImage().getScaledInstance(101, 83, Image.SCALE_DEFAULT));
        logo = new JLabel(icon);
        logo.setBounds(30, 30, 101, 83);
        add(logo);

        file_img = new ImageIcon(getClass().getResource("/img/btn-sound.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        btn_Sonido = new JButton();
        btn_Sonido.setBorder(null);
        btn_Sonido.setBounds(30, 470, 50, 50);
        btn_Sonido.setActionCommand("BTN-SONIDO");
        btn_Sonido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_Sonido.setIcon(icon);
        add(btn_Sonido);

        file_img = new ImageIcon(getClass().getResource("/img/btn-mute.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        btn_noSonido = new JButton();
        btn_noSonido.setBorder(null);
        btn_noSonido.setBounds(30, 470, 50, 50);
        btn_noSonido.setActionCommand("BTN-MUTE");
        btn_noSonido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_noSonido.setVisible(false);
        btn_noSonido.setIcon(icon);
        add(btn_noSonido);

        txt_1 = new JLabel("Nombre usuario");
        txt_1.setFont(new Font("arial", Font.BOLD, 16));
        txt_1.setBounds(120, 170, 300, 20);
        add(txt_1);
        txt_1 = new JLabel("___________________________");
        txt_1.setFont(new Font("arial", Font.BOLD, 16));
        txt_1.setBounds(120, 205, 300, 20);
        add(txt_1);

        txt_2 = new JLabel("Contrasena");
        txt_2.setFont(new Font("arial", Font.BOLD, 16));
        txt_2.setBounds(120, 240, 300, 20);
        add(txt_2);
        txt_2 = new JLabel("___________________________");
        txt_2.setFont(new Font("arial", Font.BOLD, 16));
        txt_2.setBounds(120, 275, 300, 20);
        add(txt_2);

        txt_3 = new JLabel("Ingresar");
        txt_3.setFont(new Font("arial", Font.BOLD, 20));
        txt_3.setForeground(new Color(251,19,189));
        txt_3.setBounds(330, 85, 300, 20);
        add(txt_3);

        usuario = new JTextField();
        usuario.setEnabled(true);
        usuario.setBorder(null);
        usuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        usuario.setBounds(120, 192, 200, 30);
        add(usuario);

        contrasena = new JPasswordField();
        contrasena.setEnabled(true);
        contrasena.setBorder(null);
        contrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contrasena.setBounds(120, 262, 200, 30);
        add(contrasena);

        file_img = new ImageIcon(getClass().getResource("/img/btn-ingresar.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(185, 37, Image.SCALE_DEFAULT));
        btn_ingresar = new JButton ();
        btn_ingresar.setBorder(null);
        btn_ingresar.setBounds(150, 320, 185, 37);
        btn_ingresar.setActionCommand("BTN-LOGIN");
        btn_ingresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_ingresar.setIcon(icon);
        add(btn_ingresar);


        file_img = new ImageIcon(getClass().getResource("/img/btn-volver.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        btn_volver = new JButton();
        btn_volver.setBorder(null);
        btn_volver.setBounds(385, 470, 50, 50);
        btn_volver.setActionCommand("BTN-VOLVER");
        btn_volver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_volver.setIcon(icon);
        add(btn_volver);



    }

    public JButton getBtn_Sonido() {
        return btn_Sonido;
    }

    public void setBtn_Sonido(JButton btn_Sonido) {
        this.btn_Sonido = btn_Sonido;
    }

    public JButton getBtn_noSonido() {
        return btn_noSonido;
    }

    public void setBtn_noSonido(JButton btn_noSonido) {
        this.btn_noSonido = btn_noSonido;
    }

    public JButton getBtn_ingresar() {
        return btn_ingresar;
    }

    public void setBtn_ingresar(JButton btn_ingresar) {
        this.btn_ingresar = btn_ingresar;
    }

    public JPasswordField getContrasena() {
        return contrasena;
    }

    public void setContrasena(JPasswordField contrasena) {
        this.contrasena = contrasena;
    }

    public JTextField getUsuario() {
        return usuario;
    }

    public void setUsuario(JTextField usuario) {
        this.usuario = usuario;
    }

    public JButton getBtn_volver() {
        return btn_volver;
    }

    public void setBtn_volver(JButton btn_volver) {
        this.btn_volver = btn_volver;
    }
}
