package unidad_07_Array;

public class Ejercicio14_7Main {

	public static void main(String[] args) {
		/*Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.*/
	final	String  []   COLORS = {"verde", "rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
			String [] input = Ejercicio14_7Methods.arrayStringUserInput(COLORS.length);
			String [] ordered = new String [input.length];
			
			int elementsInArray= 0;
			boolean color = false;
			
			//add the colors to the begining of the ordered array.
			 for (int i = 0; i<input.length;i++) {//run input array
				 for (int j = 0; j < COLORS.length;j++) {//for each element of array, run entirety of compared array
					 if (input[i].equals(COLORS[j])){//in case an equality as been found
						 ordered[elementsInArray]=input[i];
						 elementsInArray++;
						 break;//we do not need to check for the other colors
					 }
				 }
			 }
			 
			 for (int i = 0; i<input.length;i++) {//run input array
				 for (int j = 0; j < COLORS.length;j++) {//for each element of array, run entirety of compared array
					 if (input[i].equals(COLORS[j])){//in case an equality as been found
						 color = true;//mark the flag
						 break;//we do not need to check for the other colors
					 }
				 }
				 
				 if (color) {//in case there is a color in this place, just reset the flag
					 color = false;
				 } else {
					 ordered [elementsInArray] = input[i];//in the other case, attribute the value, add to the counter and reset the flag
					 elementsInArray++;
					 color = false;
				 }
			 }
			
			 Ejercicio14_7Methods.printStringArray(input);
			 System.out.println();
			 Ejercicio14_7Methods.printStringArray(ordered);
	}

}
