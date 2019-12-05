package ExamenJavierF;

import java.util.ArrayList;

public class Escribir {

	public static String hacerHTML(ArrayList<Transporte> lista) {
			String html = "<html>";
			html += lista.get(0) + ", " + lista.get(1);
			html += "<table border=2>";
			html += "<tr><td> Label </td><td> NameA </td><td> NameB </td> </tr>";
			for (Transporte transporte : lista) {
				html += "<tr><td>" + transporte.getLabel() + "</td>";
				html += "<td>" + transporte.getNameA() + "</td>";
				html += "<td>" + transporte.getNameB() + "</td></tr>";
			}
			html += "</table>";
			html += "</html>";
			AccesoFichero.FicheroEscribir(html);
			return html;

		}

	

		
	}


