//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.01 at 11:53:19 PM IST 
//


package bfs.soap.siemens.com.webbfs_soap_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOf_Links" type="{http://com.siemens.soap.bfs/webbfs-soap-server}ArrayOfLinks"/>
 *         &lt;element name="ListOf_SelectCol" type="{http://com.siemens.soap.bfs/webbfs-soap-server}ArrayOfSelectCols"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectList", propOrder = {
    "listOfLinks",
    "listOfSelectCol"
})
public class SelectList {

    @XmlElement(name = "ListOf_Links", required = true)
    protected ArrayOfLinks listOfLinks;
    @XmlElement(name = "ListOf_SelectCol", required = true)
    protected ArrayOfSelectCols listOfSelectCol;

    /**
     * Gets the value of the listOfLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinks }
     *     
     */
    public ArrayOfLinks getListOfLinks() {
        return listOfLinks;
    }

    /**
     * Sets the value of the listOfLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinks }
     *     
     */
    public void setListOfLinks(ArrayOfLinks value) {
        this.listOfLinks = value;
    }

    /**
     * Gets the value of the listOfSelectCol property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSelectCols }
     *     
     */
    public ArrayOfSelectCols getListOfSelectCol() {
        return listOfSelectCol;
    }

    /**
     * Sets the value of the listOfSelectCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSelectCols }
     *     
     */
    public void setListOfSelectCol(ArrayOfSelectCols value) {
        this.listOfSelectCol = value;
    }

}
