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

    public static int decidirRecibidor (){
        String mensaje = """
                Estas en el recibidor, ¿quieres abrir
                la puerta del salon o la de la 
                biblioteca?
                """;;
        String biblioSalon = "";
        int biblioSalonInt = 0;
        do{
            biblioSalon = JOptionPane.showInputDialog(mensaje);
        }while(!(biblioSalon.equalsIgnoreCase("salon") || biblioSalon.equalsIgnoreCase("biblioteca")));

        biblioSalonInt = biblioSalon.equalsIgnoreCase("salon") ? 1:2;
        return biblioSalonInt;
    }

    public static int decidirCocina (){
        String mensaje = """
                Estas en la cocina, ¿quieres abrir
                la puerta de la despensa o la del
                pasillo?
                """;;
        String despensaPasillo = "";
        int despensaPasilloInt = 0;
        do{
            despensaPasillo = JOptionPane.showInputDialog(mensaje);
        }while(!(despensaPasillo.equalsIgnoreCase("despensa") || despensaPasillo.equalsIgnoreCase("pasillo")));

        despensaPasilloInt = despensaPasillo.equalsIgnoreCase("despensa") ? 1:2;
        return despensaPasilloInt;
    }

    public static int escapaOjuega(){
        Random numrandom = new Random();

        int numAleatorio = numrandom.nextInt(100);
        return numAleatorio;
        

    }
}

   


