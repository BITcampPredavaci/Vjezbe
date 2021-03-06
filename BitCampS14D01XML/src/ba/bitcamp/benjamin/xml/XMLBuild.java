package ba.bitcamp.benjamin.xml;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLBuild {

	public static void main(String[] args) {

		try {
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document xmlDoc = docBuilder.newDocument();

			Element root = xmlDoc.createElement("users");

			Element user = xmlDoc.createElement("user");
			user.setAttribute("username", "john");
			user.setAttribute("password", "1234");

			root.appendChild(user);

			user = xmlDoc.createElement("user");
			user.setAttribute("username", "doe");
			user.setAttribute("password", "4321");

			root.appendChild(user);

			xmlDoc.appendChild(root);

			Transformer t;
			try {
				t = TransformerFactory.newInstance().newTransformer();
				t.setOutputProperty(
						"{http://xml.apache.org/xslt}indent-amount", "2");
				try {
					
					  Result r = new StreamResult(new FileOutputStream(
					  "./xml/users.xml"));
					 
					/*Result r = new StreamResult(
							new DataOutputStream(System.out));*/
					t.transform(new DOMSource(xmlDoc), r);
				} catch (TransformerException | FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /*
				 * catch (FileNotFoundException e) { // TODO Auto-generated
				 * catch block e.printStackTrace(); }
				 */
			} catch (TransformerConfigurationException
					| TransformerFactoryConfigurationError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
