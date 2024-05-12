package unidad_06_NumerosAleatorios;
/*Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.

 */
public class Ejercicio16_6 {
    public static void main(String[] args) {
        int vFigura=0;
        String figura1,figura2,figura3;

        figura1=asignarValor(Methods.numAleatorioEnRango(1,5));
        figura2=asignarValor(Methods.numAleatorioEnRango(1,5));
        figura3=asignarValor(Methods.numAleatorioEnRango(1,5));

        System.out.println(figura1+" "+figura2+" "+figura3);

        if(figura1.equals(figura2)&&figura1.equals(figura3))
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        else if(figura1.equals(figura2)||figura1.equals(figura3)||figura2.equals(figura3))
            System.out.println("Bien, ha recuperado su moneda");
        else
            System.out.println("Lo siento, ha perdido");
    }
    private static String asignarValor(int vFigura){
        String figura="";

        switch (vFigura){
            case 1:
                figura="corazon";
                break;
            case 2:
                figura="diamante";
                break;
            case 3:
                figura="herradura";
                break;
            case 4:
                figura="campana";
                break;
            case 5:
                figura="limon";
                break;
            default:
                figura="error";
        }
    return figura;
    }

}
