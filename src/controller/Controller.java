package controller;

import model.Jugador;
import model.persistence.Archivo;
import model.persistence.JugadorDAO;
import view.PanelJuego;
import view.VentanaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.applet.AudioClip;

public class Controller implements ActionListener {

    private String marcador;
    private AudioClip sonido;
    private String nombreUsuario;
    private String contrasena;
    private String contrasena2;
    private VentanaPrincipal vista;
    private Archivo archivo;
    private File datos;
    private JugadorDAO jugadorDAO;
    ArrayList<Jugador> lista_jug;

    public Controller() {

        lista_jug = new ArrayList<Jugador>();
        datos = new File("Datos/Jugadores.dat");
        archivo = new Archivo(datos);
        jugadorDAO = new JugadorDAO(archivo);
        jugadorDAO.setJugadores(archivo.leerArchivo(datos));
        lista_jug = jugadorDAO.getJugadores();

        nombreUsuario = "";
        contrasena = "";

        vista = new VentanaPrincipal();

        oyentes();

        sonido = java.applet.Applet.newAudioClip( getClass().getResource( "/sonido/musicaJuego.wav" ));
        sonido.play();
        sonido.loop();

    }

    public void oyentes() {

        //Sonido
        vista.getPanelIngreso().getBtn_Sonido().addActionListener(this);
        vista.getPanelIngreso().getBtn_noSonido().addActionListener(this);
        vista.getPaneljuego().getBtn_Sonido().addActionListener(this);
        vista.getPaneljuego().getBtn_noSonido().addActionListener(this);
        vista.getPanelModoJuego().getBtn_Sonido().addActionListener(this);
        vista.getPanelModoJuego().getBtn_noSonido().addActionListener(this);
        vista.getPanelPrincipal().getBtn_Sonido().addActionListener(this);
        vista.getPanelPrincipal().getBtn_noSonido().addActionListener(this);
        vista.getPanelRegistro().getBtn_Sonido().addActionListener(this);
        vista.getPanelRegistro().getBtn_noSonido().addActionListener(this);

        //Panel Principal
        vista.getPanelPrincipal().getBtn_ingresar().addActionListener(this);
        vista.getPanelPrincipal().getBtn_registrarse().addActionListener(this);

        //Panel registro
        vista.getPanelRegistro().getBtn_finalizar().addActionListener(this);
        vista.getPanelRegistro().getBtn_volver().addActionListener(this);

        //Panel ingreso
        vista.getPanelIngreso().getBtn_ingresar().addActionListener(this);
        vista.getPanelIngreso().getBtn_volver().addActionListener(this);

        //Panel Modo juego
        vista.getPanelModoJuego().getBtn_jugVsjug().addActionListener(this);
        vista.getPanelModoJuego().getBtn_jugVsMaq().addActionListener(this);

        //Panel juego
        vista.getPaneljuego().getBtn_salir().addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent o) {

        String e = o.getActionCommand();



        if (e.equals("BTN-SONIDO")) {

            vista.getPanelIngreso().getBtn_Sonido().setVisible(false);
            vista.getPanelIngreso().getBtn_noSonido().setVisible(true);
            vista.getPaneljuego().getBtn_Sonido().setVisible(false);
            vista.getPaneljuego().getBtn_noSonido().setVisible(true);
            vista.getPanelModoJuego().getBtn_Sonido().setVisible(false);
            vista.getPanelModoJuego().getBtn_noSonido().setVisible(true);
            vista.getPanelPrincipal().getBtn_Sonido().setVisible(false);
            vista.getPanelPrincipal().getBtn_noSonido().setVisible(true);
            vista.getPanelRegistro().getBtn_Sonido().setVisible(false);
            vista.getPanelRegistro().getBtn_noSonido().setVisible(true);

            sonido.play();

        } else if (e.equals("BTN-MUTE")) {

            vista.getPanelIngreso().getBtn_Sonido().setVisible(true);
            vista.getPanelIngreso().getBtn_noSonido().setVisible(false);
            vista.getPaneljuego().getBtn_Sonido().setVisible(true);
            vista.getPaneljuego().getBtn_noSonido().setVisible(true);
            vista.getPanelModoJuego().getBtn_Sonido().setVisible(true);
            vista.getPanelModoJuego().getBtn_noSonido().setVisible(false);
            vista.getPanelPrincipal().getBtn_Sonido().setVisible(true);
            vista.getPanelPrincipal().getBtn_noSonido().setVisible(false);
            vista.getPanelRegistro().getBtn_Sonido().setVisible(true);
            vista.getPanelRegistro().getBtn_noSonido().setVisible(false);

            sonido.stop();

        }else if (e.equals("BTN-VOLVER")){

            cambiarPanel(vista.getPanelPrincipal());

        }
        else if (e.equals("BTN-REGISTRATE")) {

            cambiarPanel(vista.getPanelRegistro());

        } else if (e.equals("BTN-INGRESAR")) {


            cambiarPanel(vista.getPanelIngreso());

        } else if (e.equals("BTN-FINALIZAR-REGISTRO")) {

            char[] arrayC = vista.getPanelRegistro().getContrasena().getPassword();
            String pass = new String(arrayC);

            char[] arrayO = vista.getPanelRegistro().getContrasena2().getPassword();
            String pass2 = new String(arrayO);

            nombreUsuario = vista.getPanelRegistro().getUsuario().getText().toLowerCase().trim();
            contrasena = pass;
            contrasena2 = pass2;

            if (validarRegistro(nombreUsuario, contrasena , contrasena2)) {

                print("Registro exitoso :D ");
                print("Bienvenid@ "+ nombreUsuario);
                jugadorDAO.anadirJugador(nombreUsuario, contrasena  , datos);
                lista_jug = jugadorDAO.getJugadores();
                cambiarPanel(vista.getPanelModoJuego());
            }


        } else if (e.equals("BTN-LOGIN")) {

            char[] arrayC = vista.getPanelIngreso().getContrasena().getPassword();
            String pass = new String(arrayC);

            nombreUsuario = vista.getPanelIngreso().getUsuario().getText().toLowerCase().trim();
            contrasena = pass;

            validadIngreso(nombreUsuario, contrasena);

            if (jugadorDAO.encontrarJugador(nombreUsuario, contrasena)!= null ){

                print("Hola! " + nombreUsuario + " disfruta el juego ;D");
                cambiarPanel(vista.getPanelModoJuego());
            }

        } else if (e.equals("BTN-JUGVSJUG")) {

            String nomInvitado = "";

            do {
             nomInvitado =  JOptionPane.showInputDialog("Ingresa el nombre del otro jugador ");

            }while (nomInvitado.equals(""));

            vista.getPaneljuego().getJugador1().setText(nombreUsuario);
            vista.getPaneljuego().getJugador2().setText(nomInvitado);

            cambiarPanel(vista.getPaneljuego());

        } else if (e.equals("BTN-JUGVSMAQ")) {

            cambiarPanel(vista.getPaneljuego());

        }
         else if (e.equals("BTN-SALIR")) {

            int op = JOptionPane.showConfirmDialog(null, "Estas seguro de abandonar el juego ?");

            if (op == 0) {
                cambiarPanel(vista.getPanelPrincipal());
            } else {

            }


        }


    }

    public void cambiarPanel(Component panel) {
        vista.getContentPane().removeAll();
        vista.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setVisible(true);
        vista.getContentPane().repaint();
    }

    public void print(String m) {

        JOptionPane.showMessageDialog(null, m, "Mensaje", JOptionPane.WARNING_MESSAGE);
    }

    public Boolean validarRegistro(String nombreUsuario, String contrasena, String contrasena2) {

        Boolean existe = false;
        Boolean validatePassword = false;

        for (int i = 0; i < lista_jug.size(); i++) {

            if (lista_jug.get(i).getNombre().equals(nombreUsuario)) {

                existe = true;
            }
        }


        if (existe) {
            print("Este usuario ya existe, intenta con otro");
        }

        if (nombreUsuario.equals("")) {
            print("Por favor ingresa el nombre de usuraio");
        }


        if (contrasena.equals("") || contrasena2.equals("")) {

            print("Por favor ingresa la contrasena");

        } else {

            if (contrasena.equals(contrasena2)) {
                validatePassword = true;
            }
            if (!contrasena.equals(contrasena2)) {
                validatePassword = false;
                print("Las contrasenas no coinciden");
            }
        }

        if (!existe && validatePassword == true) {

            return true;

        } else {
            return false;
        }


    }

    public void validadIngreso (String nombreUsuario, String contrasena){

        Boolean password = false;
        Boolean user = false;

        if (lista_jug.size() != 0) {

            for (int i = 0; i < lista_jug.size(); i++) {

                if (lista_jug.get(i).getNombre().equals(nombreUsuario) && !lista_jug.get(i).getContrasena().equals(contrasena)) {

                    password = false;
                    user = true;
                }
                if (lista_jug.get(i).getNombre().equals(nombreUsuario) && lista_jug.get(i).getContrasena().equals(contrasena)) {

                    password = true;
                    user = true;
                }

            }

            if (!password && user) {
                print("Contrasena incorrecta");
            }else if (password && user){
            }else {
                print("Credenciales incorrectas");
            }

        }else {
            print("Primero debes registarte :3");
        }




    }


}


