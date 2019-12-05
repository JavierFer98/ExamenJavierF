package ExamenJavierF;

import java.net.MalformedURLException;

public class ClasePrincipal {
public static void main(String[] args) {
	try {
		MostrarPantalla.sacarConsola();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Parseo.hacerParseo();
}
}
