package daw;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String situacion1 = """
                Ha aparecido Doraemon detras tuya
                adivina el número en el que esta pensando
                o te meterá en su bolsillo mágico
                """;
        String situacion2 = """
                Cuidado, ha aparecido Vico con un examen
                sorpresa a primera hora de la mañana, si no
                aciertas el número te espera un suspenso seguro
                """;
        String situacion3 = """
                Te ha salido Antonio Lobato desde una esquina
                ¡si no quieres saber cuanto vale tu coche acierta
                el número y escapa!
                """;
        String situacion4 = """
                ¡CUIDADO! ha aparecido un cryptobro
                y pretende venderte su curso de emprendimiento,
                más vale que aciertes el número secreto si no quieres
                llegar a tu primer millón con billetes del monopoli
                """;
        boolean salir = false;
        do {
            salir = false; // para resetear el control de salida en caso de repetir y no querer entrar a la
                           // casa
            Juego.menu();
            int apertura = Juego.puertaOVentana();
            switch (apertura) {
                case 1 -> {
                    String ventana = "";

                    do {
                        ventana = JOptionPane
                                .showInputDialog("El destino ha querido abrirte una ventana ¿quieres entrar?");
                    } while (!(ventana.equalsIgnoreCase("si") || ventana.equalsIgnoreCase("no")));

                    if (ventana.equalsIgnoreCase("no")) {
                        JOptionPane.showMessageDialog(null, "Te has cagado, nos vemos en otra ocasión");
                        break;
                    }
                    int decisionPuerta = Juego.decidirCocina();
                    switch (decisionPuerta) {
                        case 1 -> {
                            JOptionPane.showMessageDialog(null, "Has abierto la puerta de la despensa...");
                            int suerte = Juego.escapaOjuega();
                            if (suerte <= 50) {
                                JOptionPane.showMessageDialog(null,
                                        "Es tu día de suerte, el fantasma esta dormido y has escapado");
                                break;
                            }

                            JOptionPane.showMessageDialog(null, situacion1);
                            int numAleatorio = Juego.sobrevive();
                            int oportunidad = 0;
                            boolean controlExcepciones;
                            int contadorVidas;
                            do{
                                contadorVidas = 3;
                                controlExcepciones = false; //reseteamos en caso de repeticion si luego se hace bien para que no
                                                            //quede en true
                            try {
                            for (int i = 0; i < 3; i++) {

                                
                                    do {

                                        oportunidad = Integer.parseInt(
                                                JOptionPane.showInputDialog("Adivina el número entre 1 y 20"));
                                    } while (oportunidad < 1 || oportunidad > 20);
                                
                                if (numAleatorio == oportunidad) {

                                    JOptionPane.showMessageDialog(null, "Enhorabuena, has escapado");
                                    break;
                                } else{
                                    contadorVidas--;
                                }

                            } 
                            } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "Has introducido mal el número");
                                    controlExcepciones = true;
                                } 
                            }while(controlExcepciones);
                            if(contadorVidas==0){
                            JOptionPane.showMessageDialog(null,
                                    "Has perdido las 3 vidas, Doraemon te ha mandado de vuelta a la entrada");
                            salir = true;
                            }
                        }
                        case 2 -> {
                            JOptionPane.showMessageDialog(null, "Has abierto la puerta del pasillo...");
                            int suerte = Juego.escapaOjuega();
                            if (suerte <= 50) {
                                JOptionPane.showMessageDialog(null,
                                        "Es tu día de suerte, el fantasma esta dormido y has escapado");
                                break;
                            }

                            JOptionPane.showMessageDialog(null, situacion2);
                           int numAleatorio = Juego.sobrevive();
                            int oportunidad = 0;
                            boolean controlExcepciones;
                            int contadorVidas;
                            do{
                                contadorVidas = 3; //reseteo
                                controlExcepciones = false; //reseteamos en caso de repeticion si luego se hace bien para que no
                                                            //quede en true
                            try {
                            for (int i = 0; i < 3; i++) {

                                
                                    do {

                                        oportunidad = Integer.parseInt(
                                                JOptionPane.showInputDialog("Adivina el número entre 1 y 20"));
                                    } while (oportunidad < 1 || oportunidad > 20);
                                
                                if (numAleatorio == oportunidad) {

                                    JOptionPane.showMessageDialog(null, "Enhorabuena, has escapado");
                                    break;
                                } else{
                                    contadorVidas--;
                                }

                            } 
                            } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "Has introducido mal el número");
                                    controlExcepciones = true;
                                } 
                            }while(controlExcepciones);
                            if(contadorVidas==0){
                            JOptionPane.showMessageDialog(null,
                                    "Has perdido las 3 vidas, Vico te ha suspendido y has aparecido en la entrada");
                            salir = true;
                            }
                            
                        }
                    }
                }
                case 2 -> {
                    String puerta = "";
                    do {
                        puerta = JOptionPane
                                .showInputDialog("El destino ha querido abrirte la puerta ¿quieres entrar?");
                    } while (!(puerta.equalsIgnoreCase("si") || puerta.equalsIgnoreCase("no")));

                    if (puerta.equalsIgnoreCase("no")) {
                        JOptionPane.showMessageDialog(null, "Te has cagado, nos vemos en otra ocasión");
                        break;
                    }

                    int decisionPuerta = Juego.decidirRecibidor();
                    switch (decisionPuerta) {
                        case 1 -> {
                            JOptionPane.showMessageDialog(null, "Has entrado en el salon...");
                            int suerte = Juego.escapaOjuega();
                            if (suerte <= 50) {
                                JOptionPane.showMessageDialog(null,
                                        "Es tu día de suerte, el fantasma esta dormido y has escapado");
                                break;
                            }

                            JOptionPane.showMessageDialog(null, situacion3);
                            int numAleatorio = Juego.sobrevive();
                            int oportunidad = 0;
                            boolean controlExcepciones;
                            int contadorVidas;
                            do{
                                contadorVidas =3;
                                controlExcepciones = false; //reseteamos en caso de repeticion si luego se hace bien para que no
                                                            //quede en true
                            try {
                            for (int i = 0; i < 3; i++) {

                                
                                    do {

                                        oportunidad = Integer.parseInt(
                                                JOptionPane.showInputDialog("Adivina el número entre 1 y 20"));
                                    } while (oportunidad < 1 || oportunidad > 20);
                                
                                if (numAleatorio == oportunidad) {

                                    JOptionPane.showMessageDialog(null, "Enhorabuena, has escapado");
                                    break;
                                } else{
                                    contadorVidas--;
                                }

                            } 
                            } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "Has introducido mal el número");
                                    controlExcepciones = true;
                                } 
                            }while(controlExcepciones);
                            if(contadorVidas==0){
                            JOptionPane.showMessageDialog(null,
                                    "Has perdido las 3 vidas, Lobato ha vendido tu coche y has reaparecido en la entrada");
                            salir = true;
                            }
                            
                            
                        }

                        case 2 -> {
                            JOptionPane.showMessageDialog(null, "Has entrado en la biblioteca...");
                            int suerte = Juego.escapaOjuega();
                            if (suerte <= 50) {
                                JOptionPane.showMessageDialog(null,
                                        "Es tu día de suerte, el fantasma esta dormido y has escapado");
                                break;
                            }

                            JOptionPane.showMessageDialog(null, situacion4);
                            int numAleatorio = Juego.sobrevive();
                            int oportunidad = 0;
                            boolean controlExcepciones;
                            int contadorVidas;
                            do{
                                contadorVidas = 3;
                                controlExcepciones = false; //reseteamos en caso de repeticion si luego se hace bien para que no
                                                            //quede en true
                            try {
                            for (int i = 0; i < 3; i++) {

                                
                                    do {

                                        oportunidad = Integer.parseInt(
                                                JOptionPane.showInputDialog("Adivina el número entre 1 y 20"));
                                    } while (oportunidad < 1 || oportunidad > 20);
                                
                                if (numAleatorio == oportunidad) {

                                    JOptionPane.showMessageDialog(null, "Enhorabuena, has escapado");
                                    break;
                                } else{
                                    contadorVidas--;
                                }

                            } 
                            } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "Has introducido mal el número");
                                    controlExcepciones = true;
                                } 
                            }while(controlExcepciones);
                            if(contadorVidas==0){
                            JOptionPane.showMessageDialog(null,
                                    "Has perdido las 3 vidas, el cryptobro se ha quedado con tu dinero y has reaparecido en la entrada");
                            salir = true;
                            }

                        }
                    }
                }
            }
        } while (salir);
    }
}
