package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio06_09;

public class Tiempo {
    /*
    Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
donde los parámetros que se le pasan al constructor son las horas, los minutos
y los segundos respectivamente. Crea el método toString para ver los intervalos
de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el
resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar
que la clase funciona bien.
     */
    //Atributos
    public static final int VALOR_MINIMO = 0,
            HORA_MAXIMA = 24,
            MINUTO_MAXIMO = 59,
            SEGUNDO_MAXIMO = 50;

    private int hora, minuto, segundo;

    //Metodos
    //Constructor
    public Tiempo(int hora, int minuto, int segundo) {
        if (hora < VALOR_MINIMO || minuto <VALOR_MINIMO || segundo < VALOR_MINIMO) {
            throw new IllegalArgumentException("Hour, minute, and second must be non-negative.");
        }
        if (hora >= HORA_MAXIMA || minuto >= MINUTO_MAXIMO || segundo >= SEGUNDO_MAXIMO) {
            throw new IllegalArgumentException("Hour, minute, and second must be within valid ranges.");
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
        public void suma(Tiempo otroTiempo) {
        //Chatgpt
            this.segundo += otroTiempo.segundo;
            this.minuto += otroTiempo.minuto + this.segundo / 60;
            this.segundo %= 60;
            this.hora += otroTiempo.hora + this.minuto / 60;
            this.minuto %= 60;
        }
    public void resta(Tiempo otroTiempo) {
        //Chatgpt
        this.segundo -= otroTiempo.segundo;
        if (this.segundo < 0) {
            this.segundo += 60;
            this.minuto--;
        }
        this.minuto -= otroTiempo.minuto;
        if (this.minuto < 0) {
            this.minuto += 60;
            this.hora--;
        }
        this.hora -= otroTiempo.hora;
        if (this.hora < 0) {
            this.hora = this.minuto = this.segundo = 0;
        }
    }

    @Override
    public String toString() {
        return "" + hora + "h " +
                minuto + "m " +
                segundo + "s";
    }

}
