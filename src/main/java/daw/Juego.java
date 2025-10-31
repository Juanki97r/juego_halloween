package daw;

import java.util.Random;

import javax.swing.JOptionPane;

public class Juego {

    public static String menu(){
        String menu = """
                Bienvenido a la casa del terror
                una ráfaga de viento misteriosa 
                abrirá una puerta o una ventana 
                suerte con tu destino
                """;
        JOptionPane.showMessageDialog(null, menu);
        return menu;
    }

    public static int puertaOVentana(){
        Random numRandom = new Random();
        int puertaVentana = numRandom.nextInt(2) +1;
        return puertaVentana; 

    }
}


