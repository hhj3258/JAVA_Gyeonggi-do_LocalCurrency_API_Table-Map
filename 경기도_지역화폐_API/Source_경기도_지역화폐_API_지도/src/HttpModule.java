
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpModule {
	
	// 요청한 url 로 GET 방식 요청하여 xml 데이터를 받는 방법
	public static Document requestXmlGet(String url) {
		// XML 을 얻기 위한 클래스 초기화
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(url);
			
			// root tag 설정
			doc.getDocumentElement().normalize();
			
			// Document 형태로 리턴하여 받는 쪽에서 값을 얻는거는 별도로 하도록 한다.
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 에러가 발생한 경우 null 이 리턴됨.
		return null;
	}
}

