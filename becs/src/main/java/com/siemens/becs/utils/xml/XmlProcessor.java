package com.siemens.becs.utils.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlProcessor {

	private DocumentBuilderFactory factory;
	private DocumentBuilder builder;
	private Document document;

	public XmlProcessor(String path) throws ParserConfigurationException, IOException, SAXException {
		this.factory = DocumentBuilderFactory.newInstance();
		builder = this.factory.newDocumentBuilder();
		loadXmlDocument(path);
	}

	public Document loadXmlDocument(String path) throws IOException, SAXException {
		Resource resource = new FileSystemResource(new File(path));
		InputStream inputStream = resource.getInputStream();
		document = builder.parse(inputStream);
		return document;
	}

	public Element getRootElement() {
		Objects.nonNull(document);
		document.getDocumentElement().normalize();
		return document.getDocumentElement();
	}

	public String getAttribute(String attributeName) {
		return getRootElement().getAttribute(attributeName);
	}

	public NamedNodeMap getAttributes() {
		return getRootElement().getAttributes();
	}

	public NodeList getElementsByTagName(String name) {
		return getRootElement().getElementsByTagName(name);
	}

	public void getTagValue(String tagName) {
		getRootElement().getChildNodes();
	}
	
	public Document getDocument() {
		return document;
	}


	/**
	public List<WeBFSDataTable> getDataTables(String searchObjectName) {
		
		XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
		XPathExpression expr;
		try {
			expr = xpath.compile("//*[@Name='"+searchObjectName+"']");
			NodeList nl = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
			for (int i = 0; i < nl.getLength(); i++) {
				
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
		List<WeBFSDataTable> tables = new ArrayList<>();
		NodeList items = document.getElementsByTagName("DataTable");
		WeBFSDataTable tab = null;
		for (int i = 0; i < items.getLength(); i++) {
			Element eElement = (Element) items.item(i);
			String tableName = eElement.getAttribute("Name");
			tab = new WeBFSDataTable(tableName);
			NodeList tabCols = eElement.getElementsByTagName("Columns");
			for (int k = 0; k < tabCols.getLength(); k++) {
				eElement = (Element) tabCols.item(k);
				NodeList columns = eElement.getElementsByTagName("ColumnName");
				for (int l = 0; l < columns.getLength(); l++) {
					tab.addColumn(columns.item(l).getTextContent());
				}
			}
			tables.add(tab);
		}
		return tables;
	}
**/
}
