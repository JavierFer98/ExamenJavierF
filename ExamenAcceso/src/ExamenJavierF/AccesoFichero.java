package ExamenJavierF;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AccesoFichero {

	public static void FicheroEscribir(String html) {

		try {
			FileWriter fw = new FileWriter("C:\\Users\\Javier Fernández .LAPTOP-EV3GM0D2\\Desktop\\Examen.html");

			fw.write(html);
			fw.close();

		} catch (IOException e) {
		}
	}

	public static void crearTxt(ArrayList<Transporte> lista) {
		String ruta = "C:\\Users\\\\Javier Fernández .LAPTOP-EV3GM0D2\\Desktop\\Examen.txt";
		File archivo = new File(ruta);
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(archivo));
			for (Transporte transporte : lista) {
				bw.write(transporte.getLabel() + ";" + transporte.getNameA() + ";"+ transporte.getNameB()+"\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();

		}

		return;

	}

}
