package unidad_07_Array.Bidimensionales;

import unidad_07_Array.Methods;

/*
Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).
 */
public class Ejercicio13_7 {
    public static void main(String[] args) {
        String [] pais = {"Espania","Rusia","Japon","Australia"};

        int [][] estaturas = Methods.arrayBidimensionalNumAleatorios(4,10,140,210);
        int sum=0,med=0,min=210,max=140;

        for (int i = 0; i < 4; i++) {
            System.out.print(pais[i]+": ");

            for (int j = 0; j < 10; j++) {
                System.out.print(estaturas[i][j]+" ");

                if(min>estaturas[i][j])
                    min=estaturas[i][j];

                if(max<estaturas[i][j])
                    max=estaturas[i][j];

                med+=estaturas[i][j];
                sum++;
            }

            System.out.println("MED: "+med/sum+" MIN: "+min+" MAX: "+max);
        }
    }
}
