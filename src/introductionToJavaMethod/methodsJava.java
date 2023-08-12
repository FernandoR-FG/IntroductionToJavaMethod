package introductionToJavaMethod;

public class methodsJava {

	//Los metodos se escriben por encima del main o metodo principal
	//Metodo void que no devulve valor solo realiza una accion
	static void sayHelloWorldTwice() {
		System.out.println("Hello world");
		System.out.println("Hello world\n");
	}
	//Metodo para imprimir 4 statements
	static void misFrases() {
		System.out.println("He creado mi primera variable");
		System.out.println("Mi primer metodo");
		System.out.println("Mi primer loop");
		System.out.println("Me gusta aprender java\n");
	}
	//Metodo para imprimir Hello World las veces que quiera
	static void sayHello(int times) { //parameters int times
		for (int i=1; i<=times;i++ ) {
			System.out.println("Hello world");
		}
	}
	//Metodo para imprimir una lista de numeros y sus cuadrados
	static void numberList(int n, boolean x) {
		for(int i = 1; i<= n;i++) {
			if(x == true) {
				System.out.println(i + " " + i*i);
			}
			else {
				System.out.println(i);
			}
		}
	}
	//Metodo para imprimir la tabla de multiplicar de cualquier numero
	static void tableMul(int n) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d", n,i,n*i).println();
		}
	}
	//Tambien se puede hacer una sobrecarga de metodos en donde se diferencian por los parametros que tienen
	static void tableMul() {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d", 5,i,5*i).println();
		}
	}
	
	//Metodos que pasan varios parametros
	static void calculadora(int primerN, int segundoN, char op) {
		if(op == 's') {
			System.out.printf("La suma es: %d",primerN+segundoN).println();
		}
		else if(op == '*') {
			System.out.printf("La multiplicacion es: %d",primerN*segundoN).println();
		}
	}
	
	//Ejercicios
	//Metodos que devuleven un valor
	static int sumaNumeros(int a, int b) {
		return a+b;
	}
	static int sumaNumeros(int a, int b, int c) {
		return a+b+c;
	}
	
	//Dados dos angulos localiza el tercer
	static double anguloF(double a, double b) {
		double res = (180-(a+b));
		return res;
	}
	
	public static void main(String[] args) {
		
		// Creando metodos simples
		/*Syntax
		 * satic       void       name   
		 * AccesType ReturnType nameOfMethod(parameters){
		 * Body of the method
		 * }
		 * */
		//Llamada al metodo
		sayHelloWorldTwice();
		misFrases();
		
		//En jshell se puede guardar con /save nombre.txt ademas con /list nombreMetodo podemos ver el contenido
		//Para editar el metodo se puede ocupar /edit nombreMetodo solo en JSHELL
		//Para ver los metodos creados /methods
		
		//Ahora pasaremos argumentos a los metodos
		sayHello(3);
		
		//Llamamos al metodo que imprime numeros y sus cuadrados si se solicita
		System.out.println("\nLista de numeros");
		numberList(5, false);
		System.out.println();
		System.out.println("Numeros y sus cuadrados");
		numberList(5, true);
		
		//Llamando al metodo que imprime la tabla de multiplicar
		//Se puede llamar al metodo sobrecargado si se envia los argumentos correctos
		System.out.println();
		tableMul();
		//Metodo sobrecargado
		System.out.println();
		tableMul(50);
		
		//Metodo con varios parametros
		System.out.println();
		calculadora(5,6,'s');
		calculadora(5,6,'*');
		
		//Probando metodos que devulven un valor
		//Como estos metodos devuelven un valor determinado se debe guardar en una variable
		System.out.println();
		int res = sumaNumeros(5,6);
		System.out.println(res);
		
		//Llamada al metodo anguloF
		System.out.println();
		double faltante = anguloF(90.970,30.0);
		System.out.println("El angulo faltante es: "+faltante);
	}

}
