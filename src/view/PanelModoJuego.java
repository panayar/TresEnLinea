package view;

import javax.swing.*;
import java.awt.*;

public class PanelModoJuego extends JPanel {

    private JButton btn_Sonido;
    private JButton btn_noSonido;
    private JButton btn_jugVsjug;
    private JButton btn_jugVsMaq;
    private JLabel text;
    private JLabel skin;
    private JLabel logo;

    public PanelModoJuego() {

        setLayout(null);
        setBounds(520, 10, 50, 50);
        setBackground(Color.WHITE);
        inicializarComponentes();
        setVisible(false);

    }

    public void inicializarComponentes() {

        ImageIcon file_img = new ImageIcon(getClass().getResource("/img/skin.png"));
        ImageIcon icon = new ImageIcon(file_img.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        skin = new JLabel(icon);
        skin.setBounds(330, 170, 30, 30);
        add(skin);

        text = new JLabel("Elige modo de juego ");
        text.setFont(new Font("arial", Font.BOLD, 20));
        text.setBounds(120, 170, 300, 30);
        add(text);

        file_img = new ImageIcon(getClass().getResource("/img/jugvsjug.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(185, 37, Image.SCALE_DEFAULT));
        btn_jugVsjug = new JButton();
        btn_jugVsjug.setBorder(null);
        btn_jugVsjug.setBounds(153, 220, 185, 37);
        btn_jugVsjug.setActionCommand("BTN-JUGVSJUG");
        btn_jugVsjug.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_jugVsjug.setIcon(icon);
        add(btn_jugVsjug);

        file_img = new ImageIcon(getClass().getResource("/img/jugMag.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(185, 37, Image.SCALE_DEFAULT));
        btn_jugVsMaq = new JButton();
        btn_jugVsMaq.setBorder(null);
        btn_jugVsMaq.setBounds(153, 270, 185, 37);
        btn_jugVsMaq.setActionCommand("BTN-JUGVSMAQ");
        btn_jugVsMaq.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_jugVsMaq.setIcon(icon);
        add(btn_jugVsMaq);

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

        file_img = new ImageIcon(getClass().getResource("/img/miniLogo.png"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(101, 83, Image.SCALE_DEFAULT));
        logo = new JLabel(icon);
        logo.setBounds(340, 440, 101, 83);
        add(logo);


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

    public JButton getBtn_jugVsjug() {
        return btn_jugVsjug;
    }

    public void setBtn_jugVsjug(JButton btn_jugVsjug) {
        this.btn_jugVsjug = btn_jugVsjug;
    }

    public JButton getBtn_jugVsMaq() {
        return btn_jugVsMaq;
    }

    public void setBtn_jugVsMaq(JButton btn_jugVsMaq) {
        this.btn_jugVsMaq = btn_jugVsMaq;
    }

}


