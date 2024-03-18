package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio05;

public class Pizza {
/*Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. 
El siguiente código del programa principal debe dar la salida que se muestra:Crea la clase Pizza con los atributos y métodos necesarios. 
Sobre cada pizza se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro quesos o funghi - y su estado - pedida o servida.
 La clase debe almacenar información sobre el número total de pizzas que se han pedido y que se han servido. 
 Siempre que se crea una pizza nueva, su estado es “pedida”. 
 El siguiente código del programa principal debe dar la salida que se muestra:*/
	
	//Atributos
	private String [] tamanio = {"mediana","familiar"};

	private String [] tipo = {"margarita", "cuatro quesos","funghi"};
		
	private String [] estado = {"pedida", "servida"};
	
	private int pedidas = 0;
	private int servidas = 0;

	
}
