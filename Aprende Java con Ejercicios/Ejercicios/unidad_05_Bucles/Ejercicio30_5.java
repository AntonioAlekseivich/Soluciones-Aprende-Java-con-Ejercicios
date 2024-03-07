package unidad_05_Bucles;

public class Ejercicio30_5 {
    public static void main(String[] args) {
        /*
        Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
         */
        final int HORAS_EN_DIA = 24;
        int dia1, dia2;
        int hora1, hora2;
        int contador = 0;
        int horasDiferencia = 0;

        boolean fechaValida=true;
        do {
            System.out.println("Por favor, introduzca la primera hora.");
            System.out.println("Dia:");
            dia1 = Methods.inputBetween2Num(1, 7);
            System.out.println("Hora:");
            hora1 = Methods.inputBetween2Num(0, 23);

            System.out.println("Por favor, introduzca la segunda hora.");
            System.out.println("Dia:");
            dia2 = Methods.inputBetween2Num(1, 7);
            System.out.println("Hora:");
            hora2 = Methods.inputBetween2Num(0, 23);

            if(dia2<dia1||dia1==dia2&&hora2<=hora1) {
                fechaValida = false;
                System.out.println("Fecha no valida");
            }
        }while(!fechaValida);

        for (int i = dia1; i < (dia2); i++) {
            contador++;
        }
        if (contador == 0)
            horasDiferencia += hora2 - hora1;//Si es el mismo dia
         else if(contador==1)
            horasDiferencia += hora2 + HORAS_EN_DIA - hora1;//Calculamos la diferencia de hora
        else
            horasDiferencia += HORAS_EN_DIA * (contador-1);


        System.out.println("Entre las " + hora1 + ":00 del dia " + dia1 + " y las " + hora2 + ":00 del dia " + dia2 + " hay " + horasDiferencia + " hora/s.");
    }
}
