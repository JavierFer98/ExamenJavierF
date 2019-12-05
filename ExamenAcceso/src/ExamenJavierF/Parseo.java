package ExamenJavierF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Parseo {
		
	public static void hacerParseo() {
		SAXBuilder sa = new SAXBuilder();
		ArrayList<Transporte> lista = new ArrayList<Transporte>();		try {
			URL url = new URL("http://opendata.emtmadrid.es/data/opendata/XML/Lines.xml");
			URLConnection con = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			Document documento = sa.build(url);
			Element raiz = documento.getRootElement();
			Element document = raiz.getChild("DocumentElement");
			List<Element> listatrafico = document.getChildren("REG");
				for (Element element : listatrafico) {
					String label = element.getChildText("Label");
					String namea = element.getChildText("NameA");
					String nameb = element.getChildText("NameB");
						Transporte trafico = new Transporte(label, namea, nameb);
						lista.add(trafico);
					
				}
				String html = Escribir.hacerHTML(lista);
				AccesoBBDD.insertarValores(lista);
				AccesoFichero.crearTxt(lista);
				AccesoBBDD.selectLineas();
		} catch (IOException | JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
