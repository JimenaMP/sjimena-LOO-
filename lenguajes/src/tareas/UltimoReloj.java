/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Calendar;

/**
 *
 * @author T-102
 */
public class UltimoReloj {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                   //para hacerlo infinito:
        while (true) {
            Calendar c = Calendar.getInstance();
            try {
                //Sacamos la hora del sistema
                Thread.sleep(1000);//en milisegundos
                int hora = c.get(Calendar.HOUR);
                int minuto = c.get(Calendar.MINUTE);
                int segundos = c.get(Calendar.SECOND);
                System.out.println("La hora es " + hora + ":" + minuto + ":" + segundos);
                //HASTA AQUI DA LA HORA HASTA QUE LO CORREMOS.
            } catch (InterruptedException e) {

            }
        }

            }
        }); //ESTO ES UN BACKGROUND TRHEAD. SI TRUENA ESTE NO TRUENA EL MAIN

        t1.start();

    }
}
