package view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    private PanelIngreso panelIngreso;
    private PanelJuego paneljuego;
    private PanelModoJuego panelModoJuego;
    private PanelPrincipal panelPrincipal;
    private PanelRegistro panelRegistro;

    public VentanaPrincipal() {

        setTitle("TRIQUI (GAME) ");
        setResizable(false);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicializarComponentes();
        setVisible(true);

    }

    public void inicializarComponentes() {

        panelIngreso = new PanelIngreso();
        getContentPane().add(panelIngreso);

        panelModoJuego = new PanelModoJuego();
        getContentPane().add(panelModoJuego);

        panelRegistro = new PanelRegistro();
        getContentPane().add(panelRegistro);

        paneljuego = new PanelJuego();
        getContentPane().add(paneljuego);

        panelPrincipal = new PanelPrincipal();
        getContentPane().add(panelPrincipal);


    }

    public PanelIngreso getPanelIngreso() {
        return panelIngreso;
    }

    public void setPanelIngreso(PanelIngreso panelIngreso) {
        this.panelIngreso = panelIngreso;
    }

    public PanelJuego getPaneljuego() {
        return paneljuego;
    }

    public void setPaneljuego(PanelJuego paneljuego) {
        this.paneljuego = paneljuego;
    }

    public PanelPrincipal getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public PanelRegistro getPanelRegistro() {
        return panelRegistro;
    }

    public void setPanelRegistro(PanelRegistro panelRegistro) {
        this.panelRegistro = panelRegistro;
    }

    public PanelModoJuego getPanelModoJuego() {
        return panelModoJuego;
    }

    public void setPanelModoJuego(PanelModoJuego panelModoJuego) {
        this.panelModoJuego = panelModoJuego;
    }
}
