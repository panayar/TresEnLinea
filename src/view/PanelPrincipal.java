package view;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private JButton btn_Sonido;
    private JButton btn_noSonido;
    private JButton btn_ingresar;
    private JButton btn_registrarse;
    private JLabel logo;


    public PanelPrincipal() {

        setLayout(null);
        setBounds(520, 10, 50, 50);
        setBackground(Color.WHITE);
        inicializarComponentes();
        setVisible(true);


    }

    public void inicializarComponentes() {

        ImageIcon file_img = new ImageIcon(getClass().getResource("/img/logo.png"));
        ImageIcon icon = new ImageIcon(file_img.getImage().getScaledInstance(319, 261, Image.SCALE_DEFAULT));
        logo = new JLabel(icon);
        logo.setBounds(90, 80, 319, 261);
        add(logo);

        file_img = new ImageIcon(getClass().getResource("/img/btn-ingresa.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(185, 37, Image.SCALE_DEFAULT));
        btn_ingresar = new Boton();
        btn_ingresar.setBorder(null);
        btn_ingresar.setBounds(153, 370, 185, 37);
        btn_ingresar.setActionCommand("BTN-INGRESAR");
        btn_ingresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_ingresar.setIcon(icon);
        add(btn_ingresar);


        file_img = new ImageIcon(getClass().getResource("/img/btn-registrate.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(185, 37, Image.SCALE_DEFAULT));
        btn_registrarse = new Boton();
        btn_registrarse.setBorder(null);
        btn_registrarse.setBounds(153, 420, 185, 37);
        btn_registrarse.setActionCommand("BTN-REGISTRATE");
        btn_registrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_registrarse.setIcon(icon);
        add(btn_registrarse);

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

    public JButton getBtn_registrarse() {
        return btn_registrarse;
    }

    public void setBtn_registrarse(JButton btn_registrarse) {
        this.btn_registrarse = btn_registrarse;
    }

    public JLabel getLogo() {
        return logo;
    }

    public void setLogo(JLabel logo) {
        this.logo = logo;
    }
}
