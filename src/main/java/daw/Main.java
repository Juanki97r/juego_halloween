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
            }
        }
    }
}