
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpModule {
	
	// ��û�� url �� GET ��� ��û�Ͽ� xml �����͸� �޴� ���
	public static Document requestXmlGet(String url) {
		// XML �� ��� ���� Ŭ���� �ʱ�ȭ
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(url);
			
			// root tag ����
			doc.getDocumentElement().normalize();
			
			// Document ���·� �����Ͽ� �޴� �ʿ��� ���� ��°Ŵ� ������ �ϵ��� �Ѵ�.
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ������ �߻��� ��� null �� ���ϵ�.
		return null;
	}
}

