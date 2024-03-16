package unidad_05_Bucles;

public class Ejercicio62_5 {
    public static void main(String[] args) {
        /*
        Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no.
         */
        Methods.soutPedirInt();
    long num = Methods.pedirLong();
    int buena=0,mala=0;
    buena+=Methods.cuentaOcurrencias(num,3)+
            Methods.cuentaOcurrencias(num,7)+
            Methods.cuentaOcurrencias(num,8)+
            Methods.cuentaOcurrencias(num,9);

    mala+=Methods.cuentaOcurrencias(num,0)+
            Methods.cuentaOcurrencias(num,1)+
            Methods.cuentaOcurrencias(num,2)+
            Methods.cuentaOcurrencias(num,4)+
            Methods.cuentaOcurrencias(num,5)+
            Methods.cuentaOcurrencias(num,6);

    if(buena>mala)
        System.out.println("El "+num+" es un número afortunado.");
    else
        System.out.println("El "+num+" no es un número afortunado.");
    }
}
