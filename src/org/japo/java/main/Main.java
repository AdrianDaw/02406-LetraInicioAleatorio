/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {

    // Instanciar Random
    public static final Random RND = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constantes
        final char LETRA_INI = 'A';
        final char LETRA_FIN = 'Z';

        // Variable
        char letra;

        // Generar dato
        // La suma de char puede exceder un char
        // El cast debe englobar todo
        letra = (char) (RND.nextInt(LETRA_FIN - LETRA_INI + 1) + LETRA_INI);

        // Mensaje
        System.out.printf("Letra de inicio de examen .: %c%n", letra);
    }
}
