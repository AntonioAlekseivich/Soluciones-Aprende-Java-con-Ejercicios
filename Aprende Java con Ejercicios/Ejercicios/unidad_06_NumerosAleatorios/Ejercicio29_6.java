package unidad_06_NumerosAleatorios;
/*
Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima.
 */
public class Ejercicio29_6 {
    public static final int MIN_PRIMAVERA=15, MIN_VERANO=25, MIN_OTONIO=20, MIN_INVIERNO=0;
    public static final int MAX_PRIMAVERA=30, MAX_VERANO=45, MAX_OTONIO=30, MAX_INVIERNO=25;

    public static void main(String[] args) {
        int tempMinVariable=0, tempMaxVariable=0, tempMinCalculo =0, tempMaxCalculo=0;
        int valorCielo=0,probabilidadCielo=0;
        String cielo="";

        soutMenu();
        int input = Methods.inputBetween2Num(1,4);

        switch (input){
            case 1:
                tempMinVariable=MIN_PRIMAVERA;
                tempMaxVariable=MAX_PRIMAVERA;
                probabilidadCielo=4;
                break;
            case 2:
                tempMinVariable=MIN_VERANO;
                tempMaxVariable=MAX_VERANO;
                probabilidadCielo=2;
                break;
            case 3:
                tempMinVariable=MIN_OTONIO;
                tempMaxVariable=MAX_OTONIO;
                probabilidadCielo=6;
                break;
            case 4:
                tempMinVariable=MIN_INVIERNO;
                tempMaxVariable=MAX_INVIERNO;
                probabilidadCielo=8;
                break;
            default:
                System.out.println("error");

}

  do {
      tempMinCalculo=Methods.numAleatorioEnRango(tempMinVariable,tempMaxVariable);
      tempMaxCalculo=Methods.numAleatorioEnRango(tempMinVariable,tempMaxVariable);
  } while (tempMinCalculo>=tempMaxCalculo);

        valorCielo=Methods.numAleatorioEnRango(0,10);
        if(valorCielo>probabilidadCielo)
            cielo="soleado";
        else
            cielo="nublado";

    soutResultado(tempMinCalculo,tempMaxCalculo,cielo);
    }

    private static void soutMenu(){
        System.out.println("1. Primavera\n" +
                "2. Verano\n" +
                "3. Otoño\n" +
                "4. Invierno\n" +
                "Seleccione la estación del año (1-4):");
    }

    private static void soutResultado(int tempMinCalculo, int tempMaxCalculo, String cielo){
        System.out.println("Previsión del tiempo para mañana\n" +
                "--------------------------------\n" +
                "Temperatura mínima: "+tempMinCalculo+"\n" +
                "Temperatura máxima: "+tempMaxCalculo+"\n" +
                ""+cielo);
    }
}
