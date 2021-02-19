package model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import model.Jugador;

public class JugadorDAO implements Serializable {

    private static final long serialVersionUID = 514969837687921800L;
    private Archivo archive;
    private ArrayList<Jugador> jugadores;

    public JugadorDAO(Archivo archive) {
        this.archive = archive;
        jugadores = new ArrayList<Jugador>();
    }

    public Jugador encontrarJugador(String usuario, String contrasena) {
        Jugador jug = null;


        if (!jugadores.isEmpty()) {
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println(jugadores.get(i).getNombre());
                System.out.println(jugadores.get(i).getContrasena());
                if (jugadores.get(i).getNombre().equals(usuario) && jugadores.get(i).getContrasena().equals(contrasena)) {
                    jug = jugadores.get(i);


                }
            }
        }
        return jug;
    }

    public boolean anadirJugador (String nombreUsuario, String contrasena, File file) {

        var verificar = false;

        if (encontrarJugador(nombreUsuario, contrasena) == null) {

            Jugador jug  = new Jugador(nombreUsuario, contrasena);

            jugadores.add(jug);
            archive.writeFile(jugadores, file);
            verificar = true;

        } else
            verificar = false;

        return verificar;
    }

    public boolean eliminarJugador(String usuario, String contrasena, File file) {
        var resp = false;
        try {
            for (int i = 0; i < jugadores.size() ; i++) {
                if (usuario.equals(jugadores.get(i).getNombre()) && contrasena.equals(jugadores.get(i).getContrasena())) {

                    jugadores.remove(i);
                    file.delete();
                    file.createNewFile();
                    archive.writeFile(jugadores, file);
                    resp = true;

                }
            }
            return resp;
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return resp;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Archivo getArchive() {
        return archive;
    }

    public void setArchive(Archivo archive) {
        this.archive = archive;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
