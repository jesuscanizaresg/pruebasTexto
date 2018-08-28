import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;

public class main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String año= "2017";
//		String numeroBoletin = "/$File/06917.pdf";
//		//numeroBoletin = numeroBoletin.substring(numeroBoletin.lastIndexOf("/") + 1, numeroBoletin.indexOf(".pdf")- año.length());
//		numeroBoletin = numeroBoletin.substring(numeroBoletin.lastIndexOf("/") + 1, numeroBoletin.indexOf(".pdf")-2);
//		System.out.println("Boletin "+numeroBoletin);
//
//		
//		String numeroEdicto= "e/18-01132.pdf";
//		numeroEdicto = numeroEdicto.substring(numeroEdicto.lastIndexOf("-")+1,numeroEdicto.indexOf(".pdf"));
//		System.out.println("Edicto "+numeroEdicto);
//		
//		
//		String numeroAnuncio = "//2018/abril/02/anuncio_BOP-2018-1448.pdf";
//		numeroAnuncio = numeroAnuncio.substring(numeroAnuncio.indexOf(".pdf") - 4,numeroAnuncio.indexOf(".pdf"));
//		System.out.println("numero de anuncio "+numeroAnuncio);
//		
//		
//		String pagina = "https/announcement/1306";
//		String dia="25";
//		String mes ="01";
		String año = "2016";
//		int inicio = pagina.lastIndexOf("/")+1;
//		
//		System.out.println(inicio);
//
//		
//		String numeroBo = pagina.substring(inicio).trim();
//		System.out.println(numeroBo);
		System.out.println("---------------------------");
		String numeroAnuncio = "73";
		String textoPaganuncio =" <";
		//System.out.println(numeroAnunci.substring(0,1));
		//System.out.println(numeroAnunci.substring(1));
		if(numeroAnuncio.length()>3) {
			for(int i = 1; i < 10; i ++) {
				if(textoPaganuncio.contains(" "+(numeroAnuncio.substring(0, 1))+"."+(numeroAnuncio.substring(1)+"/"+String.valueOf(Integer.parseInt(año)-i)))) {
					numeroAnuncio = numeroAnuncio+"_"+String.valueOf(Integer.parseInt(año)-i);
					break;
				}
			}
			
		}else {
			for(int i = 1; i < 10; i ++) {
				if(textoPaganuncio.contains(" "+numeroAnuncio+"/"+(String.valueOf(Integer.parseInt(año)-i)))) {
					numeroAnuncio = numeroAnuncio+"_"+String.valueOf(Integer.parseInt(año)-i);
					break;
				}
			}
			
		}
		
//		System.out.println(numeroAnuncio);
//		
//		String numeroBoletin = "Bop Número: 80/0";
//		numeroBoletin = numeroBoletin.substring(numeroBoletin.indexOf("Bop Número: ")+"Bop Número: ".length(), numeroBoletin.indexOf("/")).trim();
//		System.out.println(numeroBoletin);
		
//		String numeroBoletin ="";
//		int inicio = 0;
//		System.out.println(inicio);
//		int fin = numeroBoletin.indexOf("-");
//		numeroBoletin = (numeroBoletin.substring(inicio,fin).trim());
//		System.out.println(numeroBoletin);
			
		URL pdf = null;
		try {
			pdf = new URL("http://www.google.es");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String enlace = pdf.toString();
		String numeroEdicto="";
		try {
			Pattern p = Pattern.compile("&numeroEdicto=");
			Matcher m = p.matcher(enlace);
			int inicio = -1;
			if (m.find()) {
				inicio = m.end(0);
				numeroEdicto = enlace.substring(inicio, enlace.indexOf("&ejercicioBop", inicio+1)).trim();
			}

		} catch (Exception e) {
			System.out.println("No se pudo obtener el número de boletín.");
			throw e;
			
		}
		
		System.out.println("Edicto: "+numeroEdicto);
		System.out.println("------------------------------------------------");
		
		System.out.println("hola");
		String texto = "Oficial de la Provincia de H, Nº";
		
		if(texto.contains("Oficial de la Provincia de H, Nº")) {
			System.out.println("lo continene");
		}else {
			System.out.println("no lo continene");
		}
		
//		int e = 0;
//		
//		while (e < 10) {
//			System.out.println(++e);
//		}
//		System.out.println("-------------------------");
//		
//		String contenedorNumerobop = "etn nº 067 en pdf";
//		String numBoletin="";
//		numBoletin= contenedorNumerobop.replaceAll("\\D+","");
//		System.out.println(numBoletin);
//		String mes = "01";
//		String dia = "02";
//		año = "2018";
//		String href = "?archivo=20180102-08820-2017-00.pdf";
//		//href = href.substring(href.indexOf("php"), href.indexOf(".pdf"));
//		href = href.substring(href.indexOf("archivo="+año+mes+dia+"-")+(("archivo="+año+mes+dia+"-").length()));
//		
//		//String numAnuncio = StringUtils.substringAfter(href,"-");
//		//String numAnuncio = href.substring(0,href.indexOf("-"));
//		//System.out.println("Numero de anuncio "+numAnuncio);
//		
//		System.out.println("----------------------------------");
		
		String urlError = "c-a-2018-088-2189.pdf";
		//String fechaBop= StringUtils.substringBetween(urlError, "-", "-");
		//String numBop = urlError.replaceAll(".*[-][0-9]{3}[-]","");
		Pattern pattern = Pattern.compile("-([0-9]{4})-");
		Matcher matcher = pattern.matcher(urlError);
		if (matcher.find()) {
		    System.out.println(matcher.group(1));
		}
		//String numAnum = StringUtils.substringBetween(href, año+"/", "/index.html");
		//System.out.println("Url -> "+urlError+"\n"+"numero bop -> "+numBop);
		String href = "/bop/services/anuncios/contenidoPdfIdAnuncio?csv=BOP-2017-1163";
		System.out.println(href.substring(href.indexOf("/bop/services/anuncios/contenido")).trim());
		
		
		String textoGuipuzcoa = "<div id=\"sumario\">\r\n" + 
				"					<h2>\r\n" + 
				"						Bolet&iacute;n\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"					    	06-04-2018,&nbsp;N&uacute;mero&nbsp;66\r\n" + 
				"" + 
				"\r\n" + 

				"";
		Pattern p = Pattern.compile("N.+mero&nbsp;\\d{1,3}");
		Matcher m = p.matcher(textoGuipuzcoa);
		
		//Reemplazo patrón si lo encuentra, elimino todo aquello que no sea un número.
		if(m.find()) {
		 System.out.println(m.group(0).replaceAll("\\D", "").trim());
		}
		
		texto ="Núm ewe oqwero qoeu q núm";
		
		
//		p= Pattern.compile("[Nn]úm.");
//		m = p.matcher(texto);
//		if(m.find()) {
//			System.out.println("contiene");
//		}
//		
		//texto= "/boletin/index.php/9-general/26792-boletin-oficial-de-la-provincia-de-guadalajara-num-103-de-lunes-29-de-mayo-de-2017";
		texto = "/boletin/index.php/9-general/26789-Bolet%C3%ADn-Oficial-de-la-Provincia-de-Guadalajara-n%C3%BAm-102-de-lunes-29-de-Mayo-de-2017";
		

		p= Pattern.compile("[Gg]uadalajara-n[\\W |\\w]m-");
		
		//Busca Guadalajara o guadalajara seguido de -n y terminado en m-, y entre -n y m- indica que puede haber caracteres letra w, o caracteres no letra W,
		// entre 1 y 10 p0siciones
		//Pattern p= Pattern.compile("[Gg]uadalajara-n[\\w \\ \\W]{1,10}m-"); Este es el que quedo en programa final
		m=p.matcher(texto);
		if(m.find()) {
			System.out.println("encontrado: "+m.group(0));
		}
		
	
		

		texto ="";
		p = Pattern.compile("BOP nº");
		m = p.matcher(texto);
		if(m.find()) {
			
		}
		
		texto = "/lehendakaritza/Bao_bob/2018\\\\06\\\\28/I-633_cas.pdf";
		
		texto = texto.replaceAll("\\\\","/");
		System.out.println("direccion correcta: "+texto);
		
		//Original busqueda por dia mes y año
		//http:///index.asp?MP=8&MS=114&MN=3&accion=si&fecha=25/06/2018%22&filtrodia=1
		
		texto = "hola  como lo llevas?    Bien   vamos "
				+ "tirando\n como podemos";
		texto = texto.replaceAll("  *", " ");
		//texto = texto.replaceAll("\\s{2,}", " ");
		System.out.println("El texto sin espacios dobles: "+texto);
		
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Texto filtrado por limpiaCaracteresUTF8");
		
		String pagina =  "horas.  Instituto de Educación Secundaria «Diego Porcelos», sito en la calle Eloy García de Quevedo, "
				+ "s/n. Se examinarán los aspirantes que tengan su domicilio en las provincias de Burgos y Soria. LEÓN: 9:30 horas."
				+ "  Centro Integrado de Formación Profesional (CIFP) «Tecnológico Industrial», sito en calle Profesor Gaspar Morocho, "
				+ "s/n. Se examinarán los aspirantes que tengan su domicilio en las provincias de León y Zamora. VALLADOLID: 9:30 horas.  Instituto d";
		
		pagina = pagina.replaceAll("ﬁ ", "fi");
		
		//Eliminar caracteres no latín.
		pagina = pagina.replaceAll( "[^\\p{InBasic_Latin}\\p{InLatin-1Supplement}]", " ").replaceAll("[\\xC2\\x9E]|[\\xC2\\x94]","").trim();
		pagina = pagina.replaceAll("\\p{Cntrl}", "");
		
		//A continuación caracteres individuales UTF8 y UTF84mb que aparecen en determinados boletínes.
		pagina = pagina.replaceAll("[\\xC2\\x85]|[\\xC2\\x83]","").trim();
		pagina = pagina.replaceAll("[\\xC2\\x89]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x91\\xC2\\x90\\x03\\x11]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x87\\xC2\\x87\\xC2\\x92]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x95\\xC2\\x96\\xC2\\x8B]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x86\\xC2\\x8E\\xC2\\x86]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x88]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x8C\\xC2]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x97\\xC3\\x97\\xC2\\x97]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x84\\xC2\\x98\\xC3\\x97]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9B\\xC2\\x8F\\x10]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9B\\xC2\\x8F\\x10]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x8A\\xC2\\x93]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9C]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x80]", "").trim();
		//pagina = pagina.replaceAll("[\\xCD\\xB2\\x03]", "").trim();
		
		
		// no funciona, el texto extraido es incorrecto, lleno de caracteres extraños.
		/*pagina = pagina.replaceAll("[\\xC2\\x824\\xC2\\xA8]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x99\\xC2\\xABe\\xC2]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9F]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9A]", "").trim();*/
		
		
		// errores indexando. El texto resultante no es correcto.
		pagina = pagina.replaceAll("[\\xC2\\x82\\x1D]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x99]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9A\\xC2\\x9A\\x0A]", "").trim();
		
		//
		//pagina = pagina.replaceAll("[\\xC2\\x9A]", "").trim();

		
		//Quitando espacios duplicados
		//pagina = pagina.replaceAll("\\s{2,}", " ");
		pagina = pagina.replaceAll("  +", " ");
		
		//Quitando tabuladores ( se indexaba con tab en lugar de espacios)
		pagina = pagina.replaceAll("\t+", " ");
		
		System.out.println(pagina);
		
	}
	
	
}