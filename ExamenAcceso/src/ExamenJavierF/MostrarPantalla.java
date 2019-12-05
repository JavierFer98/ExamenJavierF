package ExamenJavierF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MostrarPantalla {
	public static void sacarConsola() throws MalformedURLException {
		try {
			URL url = new URL("http://opendata.emtmadrid.es/data/opendata/XML/Lines.xml");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String linea;
			while ((linea = br.readLine())!=null) {
				System.out.println(linea+"\n");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
