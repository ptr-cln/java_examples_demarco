package org.protor.sandbox.celiento;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.protor.filesio.utils.XMLUtils;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test03 {

	public static void main(String[] args) {

		if (args.length != 0 ) {
			String filePath = args[0];
			File carsFile = new File(filePath);

			if (!carsFile.exists()) {
				System.err.println("File " + carsFile.getAbsolutePath() + "not found");
				System.exit(1);
			}

			System.out.println("Found file: " + carsFile.getAbsolutePath());
			System.out.println("---------- . . . Now reading XML content . . . ----------");

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			//			Document doc;

			try {
				dBuilder = dbFactory.newDocumentBuilder();
				org.w3c.dom.Document doc =  dBuilder.parse(carsFile);
				
				System.out.println("File XML parsed.");
				
				doc.getDocumentElement().normalize();
				System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
				NodeList nodeList = doc.getElementsByTagName("car");
				System.out.println("N. cars: " + nodeList.getLength());
				
				List<Car> cars = new ArrayList<Car>();
				
				for (int iNode = 0 ; iNode < nodeList.getLength() ; iNode++) {
					org.w3c.dom.Node node = nodeList.item(iNode);
					System.out.println("\n Current element: " + node.getNodeName());
					 
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						org.w3c.dom.Element elem = (org.w3c.dom.Element) node;
						NamedNodeMap attributesMap = elem.getAttributes();
						System.out.println("N. attributes: " + attributesMap.getLength());
						System.out.println("Car id: " + elem.getAttribute("id"));
						
//						String carName = XMLUtils.getXMLPropertyByPath(elem, "name");
//						System.out.println("Car name: " + carName );
						
						String passString = XMLUtils.getXMLAttributesByPath(node, "//passengers", "value");
						System.out.println("Passengers: " + passString);
						
					}
					
					
				}

			}
			catch (IOException e){
				System.err.println(" ");
			} catch (SAXException e) {

				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				
				e.printStackTrace();
			}
		}

		else {

			System.out.println("This program must be use arguments.");
			System.out.println("Terminating");
			System.exit(1);

		}

	}

}
