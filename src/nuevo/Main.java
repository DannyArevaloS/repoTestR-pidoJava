package nuevo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Danny");
		System.out.println("@@@DANNY -> por aquí pasa el código de programación");
		saludo();
		mensajeDeBuenosDias();

	}
	
	public static String saludo() {
		String saludo = "Hola Danielito";
		System.out.println("@@@DANNY -> por aquí pasa el código en el método saludo() : " + saludo);
		return saludo;
	}
	
	public static String mensajeDeBuenosDias() {
		String mensaje = "Buenos días, hermoso";
		System.out.println("@@@DANNY -> el mensaje de este método dice: " + mensaje);
		return mensaje;
	}

}
