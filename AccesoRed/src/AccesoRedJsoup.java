import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class AccesoRedJsoup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "http://alviento.cuatrovientos.org";
		// importar Document de la librer�a jsoup
		try {
			Document documento =
					Jsoup.connect(url).get();
			// importar Elements de la librer�a jsoup
			Elements enlaces = documento.select("a");
			for (Element enlace : enlaces) {
				System.out.println(enlace.attr("href"));
			}
			
		} catch (IOException e) {
			System.err.println("Cagada " + e.getMessage());
		}
	}

}
