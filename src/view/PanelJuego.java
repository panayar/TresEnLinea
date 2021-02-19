package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;

public class PanelJuego extends JPanel implements ActionListener {

    private JButton btn_Sonido;
    private JButton btn_noSonido;
    private JButton btn_salir;
    private JLabel logo;
    private JLabel grilla;
    private JLabel jugador1;
    private JLabel jugador2;
    private JLabel marcador;
    private JLabel turnoAzul;
    private JLabel turnoNaranja;
    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;
    private String turno;
    private JButton btns[];
    int opc[][] = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}
    };
    int puntaje1 = 0;
    int puntaje2 = 0;

    public PanelJuego() {

        setLayout(null);
        setBounds(520, 10, 50, 50);
        setBackground(Color.white);
        inicializarComponentes();
        setVisible(false);

        btns = new JButton[9];
        btns[0] = btn_1;
        btns[1] = btn_2;
        btns[2] = btn_3;
        btns[3] = btn_4;
        btns[4] = btn_5;
        btns[5] = btn_6;
        btns[6] = btn_7;
        btns[7] = btn_8;
        btns[8] = btn_9;
        turno = "O";
    }

    public void inicializarComponentes() {


        ImageIcon file_img = new ImageIcon(getClass().getResource("/img/miniLogo.png"));
        ImageIcon icon = new ImageIcon(file_img.getImage().getScaledInstance(101, 83, Image.SCALE_DEFAULT));
        logo = new JLabel(icon);
        logo.setBounds(188, 440, 101, 83);
        add(logo);


        jugador1 = new JLabel("Nombre 1");
        jugador1.setFont(new Font("arial", Font.BOLD, 14));
        jugador1.setBounds(70, 30, 300, 20);
        add(jugador1);

        jugador2 = new JLabel("Nombre 2");
        jugador2.setFont(new Font("arial", Font.BOLD, 14));
        jugador2.setBounds(350, 30, 300, 20);
        add(jugador2);

        marcador = new JLabel("0 - 0");
        marcador.setFont(new Font("arial", Font.BOLD, 20));
        marcador.setBounds(222, 30, 300, 20);
        add(marcador);

        file_img = new ImageIcon(getClass().getResource("/img/tunoAzul.png"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        turnoAzul = new JLabel("0 - 0");
        turnoAzul.setFont(new Font("arial", Font.BOLD, 20));
        turnoAzul.setBounds(85, 52, 30, 30);
        turnoAzul.setIcon(icon);
        turnoAzul.setEnabled(false);
        add(turnoAzul);

        file_img = new ImageIcon(getClass().getResource("/img/turnoNaranja.png"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        turnoNaranja = new JLabel("0 - 0");
        turnoNaranja.setFont(new Font("arial", Font.BOLD, 20));
        turnoNaranja.setBounds(370, 52, 30, 30);
        turnoNaranja.setEnabled(true);
        turnoNaranja.setIcon(icon);
        add(turnoNaranja);


        btn_1 = new JButton("");
        btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_1.setBorder(null);
        btn_1.setBounds(70, 110, 100, 100);
        btn_1.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_1.setActionCommand("btn_1");
        btn_1.addActionListener(this);
        btn_1.setBackground(Color.white);
        btn_1.setOpaque(true);
        add(btn_1);

        btn_2 = new JButton("");
        btn_2.setBorder(null);
        btn_2.setBounds(190, 110, 100, 100);
        btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_2.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_2.setOpaque(true);
        btn_2.setActionCommand("btn_2");
        btn_2.addActionListener(this);
        btn_2.setBackground(Color.white);
        add(btn_2);


        btn_3 = new JButton("");
        btn_3.setBorder(null);
        btn_3.setBounds(310, 110, 100, 100);
        btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_3.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_3.setOpaque(true);
        btn_3.setActionCommand("btn_3");
        btn_3.addActionListener(this);
        btn_3.setBackground(Color.white);
        add(btn_3);

        btn_4 = new JButton("");
        btn_4.setBounds(70, 222, 100, 100);
        btn_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_4.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_4.setActionCommand("btn_4");
        btn_4.addActionListener(this);
        btn_4.setBackground(Color.white);
        btn_4.setBorder(null);
        btn_4.setOpaque(true);
        add(btn_4);

        btn_5 = new JButton();
        btn_5.setBorder(null);
        btn_5.setBounds(190, 222, 100, 100);
        btn_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_5.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_5.setActionCommand("btn_5");
        btn_5.addActionListener(this);
        btn_5.setBackground(Color.white);
        btn_5.setOpaque(true);
        add(btn_5);

        btn_6 = new JButton("");
        btn_6.setBorder(null);
        btn_6.setBounds(310, 222, 100, 100);
        btn_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_6.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_6.setOpaque(true);
        btn_6.setActionCommand("btn_6");
        btn_6.addActionListener(this);
        btn_6.setBackground(Color.white);
        add(btn_6);

        btn_7 = new JButton("");
        btn_7.setBorder(null);
        btn_7.setBounds(70, 335, 100, 100);
        btn_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_7.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_7.setActionCommand("btn_7");
        btn_7.addActionListener(this);
        btn_7.setBackground(Color.white);
        btn_7.setOpaque(true);
        add(btn_7);

        btn_8 = new JButton("");
        btn_8.setBorder(null);
        btn_8.setBounds(190, 335, 100, 100);
        btn_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_8.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_8.setBackground(Color.white);
        btn_8.setActionCommand("btn_8");
        btn_8.addActionListener(this);
        btn_8.setOpaque(true);
        add(btn_8);

        btn_9 = new JButton("");
        btn_9.setBorder(null);
        btn_9.setBounds(310, 335, 100, 100);
        btn_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_9.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
        btn_9.setBackground(Color.white);
        btn_9.setBackground(Color.white);
        btn_9.setActionCommand("btn_9");
        btn_9.addActionListener(this);
        btn_9.setOpaque(true);
        add(btn_9);

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

        file_img = new ImageIcon(getClass().getResource("/img/btn-salir.jpg"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        btn_salir = new Boton();
        btn_salir.setBorder(null);
        btn_salir.setBounds(380, 470, 50, 50);
        btn_salir.setActionCommand("BTN-SALIR");
        btn_salir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_salir.setIcon(icon);
        add(btn_salir);

        file_img = new ImageIcon(getClass().getResource("/img/grilla.png"));
        icon = new ImageIcon(file_img.getImage().getScaledInstance(345, 345, Image.SCALE_DEFAULT));
        grilla = new JLabel(icon);
        grilla.setBounds(70, 100, 345, 345);
        add(grilla);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String m = e.getActionCommand();

        if (m.equals("btn_1")) {
            marcar(1);
        } else if (m.equals("btn_2")) {
            marcar(2);
        } else if (m.equals("btn_3")) {
            marcar(3);
        } else if (m.equals("btn_4")) {
            marcar(4);
        } else if (m.equals("btn_5")) {
            marcar(5);
        } else if (m.equals("btn_6")) {
            marcar(6);
        } else if (m.equals("btn_7")) {
            marcar(7);
        } else if (m.equals("btn_8")) {
            marcar(8);
        } else if (m.equals("btn_9")) {
            marcar(9);
        }

    }

    public void marcar(int casilla) {

        String m = btns[casilla - 1].getText().toString();
        System.out.println(m);

        if (m.equals("")) {

            btns[casilla - 1].setText(turno);

            cambiarTurno();
            if (turno.equals("O")) {
                btns[casilla - 1].setForeground(new Color(5, 255, 255));
            } else {
                btns[casilla - 1].setForeground(new Color(251, 61, 19));
            }
            darGanador();

        } else {

            JOptionPane.showMessageDialog(null, "No puedes elegir esta opcion");
        }
    }

    public void cambiarTurno() {

        if (turno.equals("O")) {

            turnoAzul.setEnabled(true);
            turnoNaranja.setEnabled(false);
            turno = "X";

        } else {
            turnoNaranja.setEnabled(true);
            turnoAzul.setEnabled(false);
            turno = "O";
        }

    }

    public void darGanador() {

        for (int i = 0; i < opc.length; i++) {
            if (btns[(opc[i][0]) - 1].getText().equals("X")
                    && btns[(opc[i][1]) - 1].getText().equals("X")
                    && btns[(opc[i][2]) - 1].getText().equals("X")) {


                btns[(opc[i][0]) - 1].setBackground(new Color(103, 146, 210));
                btns[(opc[i][1]) - 1].setBackground(new Color(103, 146, 210));
                btns[(opc[i][2]) - 1].setBackground(new Color(103, 146, 210));
                puntaje1++;
                marcador.setText(puntaje1 + " - " + puntaje2);
                print("Ha ganado X ");

                int op = JOptionPane.showConfirmDialog(null, "Otra partida?");

                if (op == 0) {
                    limpiarTablero();
                }
                if (op == 1) {

                    print("Hasta luego ;D");
                    System.exit(0);
                }

            }
            if (btns[(opc[i][0]) - 1].getText().equals("O")
                    && btns[(opc[i][1]) - 1].getText().equals("O")
                    && btns[(opc[i][2]) - 1].getText().equals("O")) {


                btns[opc[i][0] - 1].setBackground(new Color(255, 232, 22));
                btns[opc[i][1] - 1].setBackground(new Color(255, 232, 22));
                btns[opc[i][2] - 1].setBackground(new Color(255, 232, 22));
                puntaje2++;
                marcador.setText(puntaje1 + " - " + puntaje2);
                print("Ha ganado O ");

                int op = JOptionPane.showConfirmDialog(null, "Otra partida?");

                if (op == 0) {
                    limpiarTablero();
                }
                if (op == 1) {

                    print("Hasta luego ;D");
                    System.exit(0);
                }
            }

        }


    }

    public void limpiarTablero() {

        for (int i = 0; i < btns.length; i++) {

            btns[i].setBackground(Color.white);
            btns[i].setText("");

        }

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

    public JLabel getLogo() {
        return logo;
    }

    public void setLogo(JLabel logo) {
        this.logo = logo;
    }

    public JLabel getGrilla() {
        return grilla;
    }

    public void setGrilla(JLabel grilla) {
        this.grilla = grilla;
    }

    public JLabel getJugador1() {
        return jugador1;
    }

    public void setJugador1(JLabel jugador1) {
        this.jugador1 = jugador1;
    }

    public JLabel getJugador2() {
        return jugador2;
    }

    public void setJugador2(JLabel jugador2) {
        this.jugador2 = jugador2;
    }

    public JLabel getMarcador() {
        return marcador;
    }

    public void setMarcador(JLabel marcador) {
        this.marcador = marcador;
    }

    public JLabel getTurnoAzul() {
        return turnoAzul;
    }

    public void setTurnoAzul(JLabel turnoAzul) {
        this.turnoAzul = turnoAzul;
    }

    public JLabel getTurnoNaranja() {
        return turnoNaranja;
    }

    public void setTurnoNaranja(JLabel turnoNaranja) {
        this.turnoNaranja = turnoNaranja;
    }


    public JButton getBtn_salir() {
        return btn_salir;
    }

    public void setBtn_salir(JButton btn_salir) {
        this.btn_salir = btn_salir;
    }

    public void print(String m) {

        JOptionPane.showMessageDialog(null, m);
    }


}