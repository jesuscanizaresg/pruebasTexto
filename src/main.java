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
//		String numeroBoletin = "http://www.dipalme.org/Servicios/Boletin/bopanexos.nsf/fecha/713C1F10C483983DC12580FE00447788/$File/06917.pdf";
//		//numeroBoletin = numeroBoletin.substring(numeroBoletin.lastIndexOf("/") + 1, numeroBoletin.indexOf(".pdf")- año.length());
//		numeroBoletin = numeroBoletin.substring(numeroBoletin.lastIndexOf("/") + 1, numeroBoletin.indexOf(".pdf")-2);
//		System.out.println("Boletin "+numeroBoletin);
//
//		
//		String numeroEdicto= "http://www.dipalme.org/Servicios/Boletin/BOP.nsf/fechabop/C1257E260069CF6DC125825E003DBABD/$file/18-01132.pdf";
//		numeroEdicto = numeroEdicto.substring(numeroEdicto.lastIndexOf("-")+1,numeroEdicto.indexOf(".pdf"));
//		System.out.println("Edicto "+numeroEdicto);
//		
//		
//		String numeroAnuncio = "http://www.dip-caceres.es/export/sites/default/comun/galerias/galeriaDescargas/caceres/bop/2018/abril/02/anuncio_BOP-2018-1448.pdf";
//		numeroAnuncio = numeroAnuncio.substring(numeroAnuncio.indexOf(".pdf") - 4,numeroAnuncio.indexOf(".pdf"));
//		System.out.println("numero de anuncio "+numeroAnuncio);
//	
////		https://www.dipucordoba.es/bop/uploads/Bop/20180402/20180402.pdf
////		https://bop.dipucordoba.es/uploads/Bop/20180425/20180425_num1370.pdf
//		
//		
//		String pagina = "https://bop.dipucordoba.es/show/20180426/announcement/1306";
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
		
//		String numeroBoletin ="3458 - JUTJAT SOCIAL NÚM. 1 DE GIRONA Edicte de citació dictat en el procediment 17/2018";
//		int inicio = 0;
//		System.out.println(inicio);
//		int fin = numeroBoletin.indexOf("-");
//		numeroBoletin = (numeroBoletin.substring(inicio,fin).trim());
//		System.out.println(numeroBoletin);
			
		URL pdf = null;
		try {
			pdf = new URL("https://bop.dipujaen.es/descargarws.dip?fechaBoletin=2018-04-02&numeroEdicto=1367&ejercicioBop=2018&tipo=bop&anioExpedienteEdicto=2018");
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
		String texto = "Oficial de la Provincia de Huesca, Nº";
		
		if(texto.contains("Oficial de la Provincia de Huesca, Nº")) {
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
//		String contenedorNumerobop = "Boletín nº 067 en pdf";
//		String numBoletin="";
//		numBoletin= contenedorNumerobop.replaceAll("\\D+","");
//		System.out.println(numBoletin);
//		String mes = "01";
//		String dia = "02";
//		año = "2018";
//		String href = "https://www.bopmalaga.es/descarga.php?archivo=20180102-08820-2017-00.pdf";
//		//href = href.substring(href.indexOf("php"), href.indexOf(".pdf"));
//		href = href.substring(href.indexOf("archivo="+año+mes+dia+"-")+(("archivo="+año+mes+dia+"-").length()));
//		
//		//String numAnuncio = StringUtils.substringAfter(href,"-");
//		//String numAnuncio = href.substring(0,href.indexOf("-"));
//		//System.out.println("Numero de anuncio "+numAnuncio);
//		
//		System.out.println("----------------------------------");
		
		String urlError = "http://sede.gobcan.es/boc/boc-a-2018-088-2189.pdf";
		//String fechaBop= StringUtils.substringBetween(urlError, "-", "-");
		//String numBop = urlError.replaceAll(".*[-][0-9]{3}[-]","");
		Pattern pattern = Pattern.compile("-([0-9]{4})-");
		Matcher matcher = pattern.matcher(urlError);
		if (matcher.find()) {
		    System.out.println(matcher.group(1));
		}
		//String numAnum = StringUtils.substringBetween(href, año+"/", "/index.html");
		//System.out.println("Url -> "+urlError+"\n"+"numero bop -> "+numBop);
		String href = "https://bop.dip-caceres.es/bop/services/anuncios/contenidoPdfIdAnuncio?csv=BOP-2017-1163";
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
		//texto= "https://boletin.dguadalajara.es/boletin/index.php/9-general/26792-boletin-oficial-de-la-provincia-de-guadalajara-num-103-de-lunes-29-de-mayo-de-2017";
		texto = "https://boletin.dguadalajara.es/boletin/index.php/9-general/26789-Bolet%C3%ADn-Oficial-de-la-Provincia-de-Guadalajara-n%C3%BAm-102-de-lunes-29-de-Mayo-de-2017";
		
		p= Pattern.compile("[Gg]uadalajara-n[\\W |\\w]m-");
		m=p.matcher(texto);
		if(m.find()) {
			System.out.println("encontrado: "+m.group(0));
		}
		
		System.out.println("PALENCIA ---------------------------------------------");
		
		texto="<!DOCTYPE html><html lang=\"es\"><!--[if IE]><![endif]--><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><link rel=\"shortcut icon\" href=\"https://www.diputaciondepalencia.es/sites/all/themes/diputacion/favicon.ico\" type=\"image/vnd.microsoft.icon\" /><meta name=\"generator\" content=\"Drupal 7 (https://www.drupal.org)\" /><link rel=\"canonical\" href=\"https://www.diputaciondepalencia.es/servicios/boletin-oficial-provincia\" /><link rel=\"shortlink\" href=\"https://www.diputaciondepalencia.es/servicios/boletin-oficial-provincia\" /><title>Buscador BOP | Portal Diputación de Palencia</title><meta name=\"viewport\" content=\"width=device-width,user-scalable=0\" /><script type=\"text/javascript\"><!--//--><![CDATA[//><!--for(var fonts=document.cookie.split(\"advaggf\"),i=0;i<fonts.length;i++){var font=fonts[i].split(\"=\"),pos=font[0].indexOf(\"ont_\");-1!==pos&&(window.document.documentElement.className+=\" \"+font[0].substr(4).replace(/[^a-zA-Z0-9\\-]/g,\"\"))}if(void 0!==Storage){fonts=JSON.parse(localStorage.getItem(\"advagg_fonts\"));var current_time=(new Date).getTime();for(var key in fonts)fonts[key]>=current_time&&(window.document.documentElement.className+=\" \"+key.replace(/[^a-zA-Z0-9\\-]/g,\"\"))}//--><!]]></script><style type=\"text/css\" media=\"all\">@import url(\"https://www.diputaciondepalencia.es/modules/system/system.base.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/modules/system/system.menus.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/modules/system/system.messages.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/modules/system/system.theme.css?pa94so\");</style><style type=\"text/css\" media=\"all\">@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/jquery_update/replace/ui/themes/base/minified/jquery.ui.core.min.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/jquery_update/replace/ui/themes/base/minified/jquery.ui.theme.min.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/jquery_update/replace/ui/themes/base/minified/jquery.ui.datepicker.min.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/date/date_popup/themes/jquery.timeentry.css?pa94so\");</style><style type=\"text/css\" media=\"all\">@import url(\"https://www.diputaciondepalencia.es/modules/aggregator/aggregator.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/calendar/css/calendar_multiday.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/modules/comment/comment.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/date/date_api/date.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/date/date_popup/themes/datepicker.1.7.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/modules/field/theme/field.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/forena/forena_query.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/modules/node/node.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/office_hours/office_hours.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/modules/search/search.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/modules/user/user.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/views/css/views.css?pa94so\");</style><style type=\"text/css\" media=\"all\">@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/colorbox/styles/default/colorbox_style.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/ctools/css/ctools.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/modules/facetapi/facetapi.css?pa94so\");</style><link type=\"text/css\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Noto+Sans:400,400i,700,700i\" media=\"all\" /><link type=\"text/css\" rel=\"stylesheet\" href=\"//fonts.googleapis.com/css?family=Open+Sans\" media=\"all\" /><style type=\"text/css\" media=\"all\">@import url(\"https://www.diputaciondepalencia.es/sites/all/themes/diputacion/style.css?pa94so\");@import url(\"https://www.diputaciondepalencia.es/sites/all/themes/diputacion/flexslider.css?pa94so\");</style><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/jquery_update/replace/jquery/1.10/jquery.min.js?v=1.10.2\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/misc/jquery.once.js?v=1.2\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/misc/drupal.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/jquery_update/replace/ui/ui/minified/jquery.ui.core.min.js?v=1.10.2\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/jquery_update/replace/ui/ui/minified/jquery.ui.datepicker.min.js?v=1.10.2\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/modules/locale/locale.datepicker.js?v=1.10.2\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/date/date_popup/jquery.timeentry.pack.js?v=1.4.7\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/default/files/nfiles/languages/es_pT9BrG7NVVpWFevqpHoy52z3BpJKTVCct8D267l0w7k.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/libraries/colorbox/jquery.colorbox-min.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/colorbox/js/colorbox.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/colorbox/styles/default/colorbox_style.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/colorbox/js/colorbox_load.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/colorbox/js/colorbox_inline.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/date/date_popup/date_popup.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/google_analytics/googleanalytics.js?pa94so\"></script><script type=\"text/javascript\"><!--//--><![CDATA[//><!--(function(i,s,o,g,r,a,m){i[\"GoogleAnalyticsObject\"]=r;i[r]=i[r]||function(){(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)})(window,document,\"script\",\"https://www.google-analytics.com/analytics.js\",\"ga\");ga(\"create\", \"UA-35214666-1\", {\"cookieDomain\":\"auto\"});ga(\"set\", \"anonymizeIp\", true);ga(\"send\", \"pageview\");//--><!]]></script><script type=\"text/javascript\" defer=\"defer\" async=\"async\" src=\"https://cdn.rawgit.com/bramstein/fontfaceobserver/v2.0.13/fontfaceobserver.js\"></script><script type=\"text/javascript\" defer=\"defer\" async=\"async\" src=\"https://www.diputaciondepalencia.es/sites/all/modules/advagg/advagg_font/advagg_font.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/themes/diputacion/js/libjava.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/themes/diputacion/js/modernizr.js?pa94so\"></script><script type=\"text/javascript\" src=\"https://www.diputaciondepalencia.es/sites/all/themes/diputacion/js/jquery.flexslider-min.js?pa94so\"></script><script type=\"text/javascript\"><!--//--><![CDATA[//><!--jQuery.extend(Drupal.settings, {\"basePath\":\"\\/\",\"pathPrefix\":\"\",\"ajaxPageState\":{\"theme\":\"diputacion\",\"theme_token\":\"hGYehz-3r52vuSW0BeDbv0_3BoLsg51PBaUdOrXiKyQ\",\"css\":{\"modules\\/system\\/system.base.css\":1,\"modules\\/system\\/system.menus.css\":1,\"modules\\/system\\/system.messages.css\":1,\"modules\\/system\\/system.theme.css\":1,\"misc\\/ui\\/jquery.ui.core.css\":1,\"misc\\/ui\\/jquery.ui.theme.css\":1,\"misc\\/ui\\/jquery.ui.datepicker.css\":1,\"sites\\/all\\/modules\\/date\\/date_popup\\/themes\\/jquery.timeentry.css\":1,\"modules\\/aggregator\\/aggregator.css\":1,\"sites\\/all\\/modules\\/calendar\\/css\\/calendar_multiday.css\":1,\"modules\\/comment\\/comment.css\":1,\"sites\\/all\\/modules\\/date\\/date_api\\/date.css\":1,\"sites\\/all\\/modules\\/date\\/date_popup\\/themes\\/datepicker.1.7.css\":1,\"modules\\/field\\/theme\\/field.css\":1,\"sites\\/all\\/modules\\/forena\\/forena_query.css\":1,\"modules\\/node\\/node.css\":1,\"sites\\/all\\/modules\\/office_hours\\/office_hours.css\":1,\"modules\\/search\\/search.css\":1,\"modules\\/user\\/user.css\":1,\"sites\\/all\\/modules\\/views\\/css\\/views.css\":1,\"sites\\/all\\/modules\\/colorbox\\/styles\\/default\\/colorbox_style.css\":1,\"sites\\/all\\/modules\\/ctools\\/css\\/ctools.css\":1,\"sites\\/all\\/modules\\/facetapi\\/facetapi.css\":1,\"https:\\/\\/fonts.googleapis.com\\/css?family=Noto+Sans:400,400i,700,700i\":1,\"http:\\/\\/fonts.googleapis.com\\/css?family=Open+Sans\":1,\"sites\\/all\\/themes\\/diputacion\\/style.css\":1,\"sites\\/all\\/themes\\/diputacion\\/flexslider.css\":1},\"js\":{\"sites\\/all\\/modules\\/jquery_update\\/replace\\/jquery\\/1.10\\/jquery.min.js\":1,\"misc\\/jquery.once.js\":1,\"misc\\/drupal.js\":1,\"sites\\/all\\/modules\\/jquery_update\\/replace\\/ui\\/ui\\/minified\\/jquery.ui.core.min.js\":1,\"sites\\/all\\/modules\\/jquery_update\\/replace\\/ui\\/ui\\/minified\\/jquery.ui.datepicker.min.js\":1,\"modules\\/locale\\/locale.datepicker.js\":1,\"sites\\/all\\/modules\\/date\\/date_popup\\/jquery.timeentry.pack.js\":1,\"public:\\/\\/languages\\/es_pT9BrG7NVVpWFevqpHoy52z3BpJKTVCct8D267l0w7k.js\":1,\"sites\\/all\\/libraries\\/colorbox\\/jquery.colorbox-min.js\":1,\"sites\\/all\\/modules\\/colorbox\\/js\\/colorbox.js\":1,\"sites\\/all\\/modules\\/colorbox\\/styles\\/default\\/colorbox_style.js\":1,\"sites\\/all\\/modules\\/colorbox\\/js\\/colorbox_load.js\":1,\"sites\\/all\\/modules\\/colorbox\\/js\\/colorbox_inline.js\":1,\"sites\\/all\\/modules\\/date\\/date_popup\\/date_popup.js\":1,\"sites\\/all\\/modules\\/google_analytics\\/googlean...";

		p = Pattern.compile("BOP nº");
		m = p.matcher(texto);
		if(m.find()) {
			
		}
		
		texto = "http://www.bizkaia.eus/lehendakaritza/Bao_bob/2018\\\\06\\\\28/I-633_cas.pdf";
		
		texto = texto.replaceAll("\\\\","/");
		System.out.println("direccion correcta: "+texto);
		
		//Original busqueda por dia mes y año
		//http://www.diputaciondezamora.es/index.asp?MP=8&MS=114&MN=3&accion=si&fecha=25/06/2018%22&filtrodia=1
		
		texto = "hola  como lo llevas?    Bien   vamos "
				+ "tirando\n como podemos";
		texto = texto.replaceAll("  *", " ");
		//texto = texto.replaceAll("\\s{2,}", " ");
		System.out.println("El texto sin espacios dobles: "+texto);
		
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Texto filtrado por limpiaCaracteresUTF8");
		
		String pagina = "BOLETÍN OFICIAL DE LA RIOJANúm.84Miércoles, 18 de julio de 2018 Página 10229III.Otras disposiciones y actosCONSEJERA DE DESARROLLO ECONÓMICO E INNOVACIÓNResolución de 12 de julio de 2018, de la Dirección General de Innovación, Trabajo,Industria y Comercio, por la que se registra y publica el acuerdo sobre tablassalariales para 2016 y 2017 del convenio colectivo de trabajo para la actividad deResidencias Privadas de Personas Mayores de la Comunidad Autónoma de La Rioja201807120064461III.2249Visto el acuerdo sobre tablas salariales para 2016 y 2017 del convenio colectivo de trabajo para la actividad de ResidenciasPrivadas de Personas Mayores de la Comunidad Autónoma de La Rioja (Código núm. 26001285012005), y suscrito al efectopor la Comisión Paritaria del mismo con fecha 28 de junio de 2018, y de conformidad con lo dispuesto en los artículos 90.2y 3 del Real Decreto Legislativo 2/2015, de 23 de octubre (BOE del 24), por el que se aprueba el texto refundido de la Leydel Estatuto de los Trabajadores y en el Real Decreto 713/2010, de 28 de mayo, sobre registro y depósito de convenios yacuerdos colectivos de trabajo.Esta Dirección General de Innovación, Trabajo, Industria y Comercio, Acuerda:Primero.- Ordenar la inscripción del citado acuerdo en el correspondiente Registro de convenios y acuerdos colectivos detrabajo con funcionamiento a través de medios electrónicos de este Centro Directivo, con notificación a la Comisión Paritaria.Segundo.- Disponer su publicación en el 'Boletín Oficial de La Rioja'.Logroño a 12 de julio de 2018.- El Director General de Innovación, Trabajo, Industria y Comercio, Julio Herreros Martín.Acta de la Comisión Paritaria del II Convenio Regional Colectivo de Residencias de la Tercera Edad de La RiojaEn Logroño, a 28 de junio de 2018AsistentesRepresentación SindicalCC.OO.Carmen Martínez MarrodánVirginia López LópezCarmen Mangado MartínezU.G.T.Carlos Luis GonzálezInmaculada Rubio DomínguezEsther Tobías GraciaRepresentación Empresarial:Asociación Residencias 3ª Edad de La RiojaJuan José Martínez AlesónCarlos Leciñana ÁlvarezCésar Sacristán LlorenteAsociación Lares-RiojaAránzazu Villaluenga Iturza\r\n" + 
				"BOLETÍN OFICIAL DE LA RIOJANúm.84Miércoles, 18 de julio de 2018 Página 10230Sara Alba CorralÁngel Romero MuñozSe reúnen en las instalaciones de la Residencia Santa Justa de Logroño, sitas en Avenida de La Paz nº 111, a las 9:00horas. La reunión se convocó formalmente el 22 de junio de 2018 para abordar el siguiente orden del día:1º.- Actualización de tablas salariales correspondientes al ejercicio 2016.2º. Actualización de tablas salariales correspondientes al ejercicio 2017.3º.- Delegación de facultades para publicación del acuerdo de aprobación de tablas salariales para 2016 y 2017 en elBoletín Oficial de la Rioja.4º.- Redacción, lectura y aprobación del acta.Una vez leído el orden del día se inicia la sesión:1º.- Actualización de tablas salariales correspondientes al ejercicio 2016Por la parte empresarial se aportan las tablas salariales para 2016 con una subida del 0,25% sobre el sueldo base sobrelas tablas 2015, de conformidad al art. 6 de II Convenio Colectivo, y al criterio de la Sentencia del TSJ de La Rioja que resolvióel conflicto colectivo entablado por las partes por el que, al no existir IPC previsto publicado, se debe acudir al índice pararevalorización de pensiones, publicado en las Leyes de Presupuestos, siendo éste para 2016 de un 0,25%.Por el banco social se manifiesta conformidad a las tablas planteadas por la parte empresarial.Las partes intervinientes acuerdan expresamente por unanimidad aprobar la subida de tablas salariales para 2016, segúntabla que se adjunta firmada al acta, como anexo nº1, en prueba de dicha conformidad, siendo éstas las que se remitirán apublicación al BOR.2º. Actualización de tablas salariales correspondientes al ejercicio 2017Por la parte empresarial se aportan las tablas salariales para 2017 con una subida del 0,25% sobre el sueldo base sobrelas tablas 2016, de conformidad al art. 6 de II Convenio Colectivo, y al criterio de la Sentencia del TSJ de La Rioja que resolvióel conflicto colectivo entablado por las partes por el que, al no existir IPC previsto publicado, se debe acudir al índice pararevalorización de pensiones, publicado en las Leyes de Presupuestos, siendo éste para 2017 de un 0,25%.Por el banco social se manifiesta conformidad a las tablas planteadas por la parte empresarial.Las partes intervinientes acuerdan expresamente por unanimidad aprobar la subida de tablas salariales para 2017, segúntabla que se adjunta firmada al acta, como anexo nº1, en prueba de dicha conformidad, siendo éstas las que se remitirán apublicación al BOR.3º.- Delegación de facultades para publicación del acuerdo de aprobación de tablas salariales para 2016 y 2017 en elBoletín Oficial de la Rioja.Se acuerda por unanimidad de los intervinientes facultar indistintamente a Arantxa Villaluenga Iturza; Juan José Martínez-Alesón Gil, Carlos Leciñana Álvarez, Sara Alba Corral, César Sacristán Llorente, Ángel Romero Muñoz, Carmen MartínezMarrodán, Virginia López López, Carmen Mangado Martínez, Carlos Luis González, Inmaculada Rubio Domínguez, EstherTobías Gracia para que cualquiera de los mismos, de forma indistinta, realicen los trámites oportunos ante el Boletín Oficialde La Rioja a fin de publicar los acuerdos contenidos en los apartados 1º y 2º en relación a la aprobación de subida de lastablas salariales para 2016 y 2017.4º- Redacción, lectura y aprobación de la redacción del actaSe redacta el acta, y tras su lectura es aprobada su redacción por las partes presentes.\r\n" + 
				"BOLETÍN OFICIAL DE LA RIOJANúm.84Miércoles, 18 de julio de 2018 Página 10231Tablas Salariales Convenio Regional 2016 Grupo Categoría profesional Sal.Basx14 Hora noc. P.Trans.x11 Anti.x14 Extra Domingo A Administrador 1.744,87 3,44 50,28.- 21.- 13,22 7,00 Gerente 1.744,87 3,44 50,28.- 21.- 13,22 7,00 Director 1.744,87 3,44 50,28.- 21.- 13,22 7,00 Médico 1.463,08 2,88 50,28.- 21.- 13,22 7,00 Titulado Superior 1.463,08 2,88 50,28.- 21.- 13,22 7,00 B Supervisor 1.248,87 2,46 50,28.- 21.- 13,22 7,00 ATS/DUE 1.248,87 2,46 50,28.- 21.- 13,22 7,00 Trabajador Social 1.248,87 2,46 50,28.- 21.- 13,22 7,00 Fisioterapeuta 1.248,87 2,46 50,28.- 21.- 13,22 7,00 Terapeuta Ocupacional 1.248,87 2,46 50,28.- 21.- 13,22 7,00 Titulado Medio 1.248,87 2,46 50,28.- 21.- 13,22 7,00 Gobernante 961,42 1,90 50,28.- 21.- 13,22 7,00 C Oficial de Mantenimiento 961,42 1,90 50,28.- 21.- 13,22 7,00 TASOC 961,42 1,90 50,28.- 21.- 13,22 7,00 Oficial 961,42 1,90 50,28.- 21.- 13,22 7,00 Conductor 961,42 1,90 50,28.- 21.- 13,22 7,00 Cocinero 961,42 1,90 50,28.- 21.- 13,22 7,00 Gerocultor / Aux. de Enfer. 961,42 1,90 50,28.- 21.- 13,22 7,00 Jardinero 945,65 1,87 50,28.- 21.- 13,22 7,00 Auxiliar de Mantenimiento 945,65 1,87 50,28.- 21.- 13,22 7,00 Auxiliar Administrativo 945,65 1,87 50,28.- 21.- 13,22 7,00 Portero/Recepcionista 945,65 1,87 50,28.- 21.- 13,22 7,00 Limpiadora/Planchadora 871,69 1,71 50,28.- 21.- 13,22 7,00 Pinche de Cocina 871,69 1,71 50,28.- 21.- 13,22 7,00 D Ay. De Oficios Varios 871,69 1,71 50,28.- 21.- 13,22 7,00 Personal no cualificado 871,69 1,71 50,28.- 21.- 13,22 7,00\r\n" + 
				"BOLETÍN OFICIAL DE LA RIOJANúm.84Miércoles, 18 de julio de 2018 Página 10232Tablas Salariales Convenio Regional 2017 Grupo Categoría profesional Sal. Basx14 Hora noc. P.Trans.x11 Anti.x14 Extra Domingo A Administrador 1.749,23 3,44 50,28 21 13,22 7,00 Gerente 1.749,23 3,44 50,28 21 13,22 7,00 Director 1.749,23 3,44 50,28 21 13,22 7,00 Médico 1.466,74 2,89 50,28 21 13,22 7,00 Titulado Superior 1.466,74 2,89 50,28 21 13,22 7,00 B Supervisor 1.252,00 2,46 50,28 21 13,22 7,00 ATS/DUE 1.252,00 2,46 50,28 21 13,22 7,00 Trabajador Social 1.252,00 2,46 50,28 21 13,22 7,00 Fisioterapeuta 1.252,00 2,46 50,28 21 13,22 7,00 Terapeuta Ocupacional 1.252,00 2,46 50,28 21 13,22 7,00 Titulado Medio 1.252,00 2,46 50,28 21 13,22 7,00 Gobernante 963,82 1,90 50,28 21 13,22 7,00 C Oficial de Mantenimiento 963,82 1,90 50,28 21 13,22 7,00 TASOC 963,82 1,90 50,28 21 13,22 7,00 Oficial 963,82 1,90 50,28 21 13,22 7,00 Conductor 963,82 1,90 50,28 21 13,22 7,00 Cocinero 963,82 1,90 50,28 21 13,22 7,00 Gerocultor / Aux. de Enfer. 963,82 1,90 50,28 21 13,22 7,00 Jardinero 948,02 1,87 50,28 21 13,22 7,00 Auxiliar de Mantenimiento 948,02 1,87 50,28 21 13,22 7,00 Auxiliar Administrativo 948,02 1,87 50,28 21 13,22 7,00 Portero/Recepcionista 948,02 1,87 50,28 21 13,22 7,00 Limpiadora/Planchadora 873,87 1,72 50,28 21 13,22 7,00 Pinche de Cocina 873,87 1,72 50,28 21 13,22 7,00 D Ay. De Oficios Varios 873,87 1,72 50,28 21 13,22 7,00 Personal no cualificado 873,87 1,72 50,28 21 13,22 7,00\r\n" + 
				"";
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
		
		
		//Madrid no funciona, el texto extraido es incorrecto, lleno de caracteres extraños.
		/*pagina = pagina.replaceAll("[\\xC2\\x824\\xC2\\xA8]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x99\\xC2\\xABe\\xC2]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9F]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9A]", "").trim();*/
		
		
		//Cantabria errores indexando. El texto resultante no es correcto.
		pagina = pagina.replaceAll("[\\xC2\\x82\\x1D]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x99]", "").trim();
		pagina = pagina.replaceAll("[\\xC2\\x9A\\xC2\\x9A\\x0A]", "").trim();
		
		//guadalajara
		//pagina = pagina.replaceAll("[\\xC2\\x9A]", "").trim();

		
		//Quitando espacios duplicados
		//pagina = pagina.replaceAll("\\s{2,}", " ");
		pagina = pagina.replaceAll("  +", " ");
		
		//Quitando tabuladores (Albacete se indexaba con tab en lugar de espacios)
		pagina = pagina.replaceAll("\t+", " ");
		
		System.out.println(pagina);
		
	}
	
	
}
