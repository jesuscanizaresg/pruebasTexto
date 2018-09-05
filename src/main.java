import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;
import org.apache.tika.Tika;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ocr.TesseractOCRConfig;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.parser.pdf.PDFParserConfig;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import com.google.common.io.Files;
import com.healthmarketscience.jackcess.util.ImportUtil;

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
		
		//Quitando Caracters de Control No probado, No subido con commit a fecha 28-08-2018
		//pagina = pagina.replaceAll("\\p{Cntrl}", " ");
		
		System.out.println(pagina);
		
		
		texto = "https://sede.seg-social.gob.es/wps/portal/sede/sede/TablonAnuncios/!ut/p/z1/jY9NT8MwDIZ_yw49ErvL6Bpu0YrQtqKqGoEulymVsmyoNFUa1sGvJ8CJ8TXfbD2P7RckVCBbddgb5fe2VU3o1zLZ0DiZxAzj_CbLZ8jF_ZKypBxjivBwAuD8OgC3S8FoSZEhyHN8_KX4v_5K92GHPMG-f_EB_HFmAdI0tv6MzNuapgak01vttCPPLox33nf9VYQRDsNAjLWm0UT3Ef5k7GzvofoCwjpEnW4uixTjBY7zQmQT5GzGSpEViMUUVu9vPqqDOpLOOt9oT1TQELonUR3nF7J-oa93fDR6AybpG3A!/dz/d5/L2dBISEvZ0FBIS9nQSEh/p0/IZ7_5O801J02LOUD40A9C9QUDO00O7=CZ6_31641901LGDLC0AUVK396Q2080=LA0=Epaginar!2==/#Z7_5O801J02LOUD40A9C9QUDO00O7";
		p = Pattern.compile("==/");
		m = p.matcher(texto);
		if(m.find()) {
			System.out.println(texto);
			String identificador = StringUtils.substringAfter(texto,m.group(0));
			System.out.println(identificador);
		}
		
		System.out.println("Salida con librerias BodycontenHandler: ************************************************************");
		//TEST tika
		/*** Tika ***/
		BodyContentHandler handler = new BodyContentHandler();
		Metadata metadata = new Metadata();
		FileInputStream inputstream = null;
		try {
			inputstream = new FileInputStream("C:\\Temp\\DescargaBOP\\Albacete\\2018\\79-6_(06_07_2018).pdf");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ParseContext pcontext = new ParseContext();
		
		//org.apache.tika.parser.pdf.PDFParser parser1 = new org.apache.tika.parser.pdf.PDFParser();
		Parser parser1 = new AutoDetectParser();
		try {
			parser1.parse(inputstream, handler, metadata,pcontext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TikaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = null;
		try {
			out = new PrintWriter(new File("C:\\Temp\\Parser_tika_org.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("Contenido del PDF: \r\n"
				+ "BodyContentHandler handler = new BodyContentHandler();"+"\r\n"
				+ "FileInputStream inputstream = null;"+"\r\n"
				+ "Metadata metadata = new Metadata();"+"\r\n"
				+ "Parser parser1 = new AutoDetectParser();"+"\r\n"
				+ "parser1.parse(inputstream, handler, metadata,pcontext);"+"\r\n"
				+ "TEXTO EXTRAIDO Con este procedimiento: -------------------------------------->"+"\r\n"
				+handler.toString());
		out.close();
		
		System.out.println("Salida con Clase TIKA: *************************************************");
		Tika tika = new Tika();
		tika.setMaxStringLength(-1);
		PrintWriter salida = null;
		try {
			salida = new PrintWriter(new File("C:\\Temp\\Tika_class.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			texto = tika.parseToString(new File("C:\\Temp\\DescargaBOP\\Albacete\\2018\\82-9_(13_07_2018).pdf"));
			//System.out.println(texto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TikaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		salida.print("Contenido del PDF: \r\n"
				+ "BodyContentHandler handler = new BodyContentHandler();"+"\r\n"
				+ "FileInputStream inputstream = null;"+"\r\n"
				+ "Metadata metadata = new Metadata();"+"\r\n"
				+ "Parser parser1 = new AutoDetectParser();"+"\r\n"
				+ "parser1.parse(inputstream, handler, metadata,pcontext);"+"\r\n"
				+ "TEXTO EXTRAIDO Con este procedimiento: -------------------------------------->"+"\r\n"
				+ texto);
		salida.close();
		
		
		System.out.println("Salida con PDFParser forzado**************************************");
		
		//TEST tika forzando PDFparser
				/*** Tika ***/
				handler = new BodyContentHandler();
				metadata = new Metadata();
				inputstream = null;
				try {
					inputstream = new FileInputStream("C:\\Temp\\DescargaBOP\\Albacete\\2018\\79-6_(06_07_2018).pdf");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pcontext = new ParseContext();
				
				//org.apache.tika.parser.pdf.PDFParser parser1 = new org.apache.tika.parser.pdf.PDFParser();
				PDFParser parser2 = new PDFParser();
				try {
					parser2.parse(inputstream, handler, metadata,pcontext);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TikaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				PrintWriter out_pdfparser = null;
				try {
					out_pdfparser = new PrintWriter(new File("C:\\Temp\\PdfParser_tika_org.txt"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out_pdfparser.println("Contenido del PDF: \r\n"
						+ "BodyContentHandler handler = new BodyContentHandler();"+"\r\n"
						+ "FileInputStream inputstream = null;"+"\r\n"
						+ "Metadata metadata = new Metadata();"+"\r\n"
						+ "PDFParser parser2 = new PDFParser();"+"\r\n"
						+ "parser2.parse(inputstream, handler, metadata,pcontext);"+"\r\n"
						+ "TEXTO EXTRAIDO Con este procedimiento: -------------------------------------->"+"\r\n"
						+handler.toString());
				out_pdfparser.close();
				
				System.out.println("Salida con Librerias OCR *****************************************************");
				
				InputStream pdfOcr = null;
				try {
					pdfOcr = new FileInputStream("C:\\Users\\Jesus-Pc\\Desktop\\Madrid_ERROR\\144-140_(18_06_2018).pdf");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ByteArrayOutputStream outByORC = new ByteArrayOutputStream();
				TikaConfig tikaConfig = TikaConfig.getDefaultConfig();
				BodyContentHandler handlerOcr = new BodyContentHandler(outByORC);
				Parser parserOCR = new AutoDetectParser(tikaConfig);
				Metadata metaOCR = new Metadata();
				ParseContext parseContext = new ParseContext();
				
				PDFParserConfig pdfConfigOCR = new PDFParserConfig();
				pdfConfigOCR.setExtractInlineImages(true);
				
				TesseractOCRConfig tesserConfig = new TesseractOCRConfig();
				tesserConfig.setLanguage("eng");
				tesserConfig.setTessdataPath("C:\\Program Files (x86)\\Tesseract-OCR\\tesseract.exe");
				
				parseContext.set(Parser.class, parserOCR);
				parseContext.set(PDFParserConfig.class, pdfConfigOCR);
				parseContext.set(TesseractOCRConfig.class, tesserConfig);
				try {
					parserOCR.parse(pdfOcr, handlerOcr, metaOCR, parseContext);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TikaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//System.out.println(new String(outByORC.toByteArray(), Charset.defaultCharset()));
				
				OutputStream ops = null;
				try {
					ops = new FileOutputStream("C:\\Temp\\TesseractOCR_tika_org.txt");
					outByORC.writeTo(ops);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						outByORC.close();
						ops.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			

			System.out.println("PROGRAMA FINALIZADO.......");	
	}
	
	
}