package daw;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Juego.menu();
        int apertura = Juego.puertaOVentana();
        switch (apertura) {
            case 1 ->{
                String ventana = "";

               do{
                ventana = JOptionPane.showInputDialog("El destino ha querido abrirte una ventana ¿quieres entrar?");
               } while(!(ventana.equalsIgnoreCase("si") || ventana.equalsIgnoreCase("no")));

               if(ventana.equalsIgnoreCase("no")){
                JOptionPane.showMessageDialog(null, "Te has cagado, nos vemos en otra ocasión");
                break;
               }
               int decisionPuerta = Juego.decidirCocina();
               switch (decisionPuerta) {
                case 1-> {
                    JOptionPane.showMessageDialog(null, "Has abierto la puerta de la despensa...");
                    int suerte = Juego.escapaOjuega();
                    if(suerte <= 50){
                        JOptionPane.showMessageDialog(null, "Es tu día de suerte, el fantasma esta dormido y has escapado");
                    }
                }
                case 2-> {
                    JOptionPane.showMessageDialog(null, "Has abierto la puerta del pasillo...");
                    int suerte = Juego.escapaOjuega();
                    if(suerte <= 50){
                        JOptionPane.showMessageDialog(null, "Es tu día de suerte, el fantasma esta dormido y has escapado");
                    }
                }
               }
            }
            case 2 ->{
                String puerta="";
                do{
                 puerta = JOptionPane.showInputDialog("El destino ha querido abrirte la puerta ¿quieres entrar?");
                }while(!(puerta.equalsIgnoreCase("si") || puerta.equalsIgnoreCase("no")));

                if(puerta.equalsIgnoreCase("no")){
                    JOptionPane.showMessageDialog(null, "Te has cagado, nos vemos en otra ocasión");
                    break;
                }

                int decisionPuerta = Juego.decidirRecibidor();
                switch (decisionPuerta) {
                    case 1 -> {
                        JOptionPane.showMessageDialog(null, "Has entrado en el salon...");
                        int suerte = Juego.escapaOjuega();
                    if(suerte <= 50){
                        JOptionPane.showMessageDialog(null, "Es tu día de suerte, el fantasma esta dormido y has escapado");
                    }
                    }

                    case 2 -> {
                        JOptionPane.showMessageDialog(null, "Has entrado en la biblioteca...");
                        int suerte = Juego.escapaOjuega();
                    if(suerte <= 50){
                        JOptionPane.showMessageDialog(null, "Es tu día de suerte, el fantasma esta dormido y has escapado");
                    }
                    
                    }
            }
        }
    }
}
}