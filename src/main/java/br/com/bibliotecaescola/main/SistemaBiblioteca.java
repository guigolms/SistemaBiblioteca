package br.com.bibliotecaescola.main;

import br.com.bibliotecaescola.view.TelaPrincipal;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                telaPrincipal.setVisible(true);
            }
        });
    }
}

               