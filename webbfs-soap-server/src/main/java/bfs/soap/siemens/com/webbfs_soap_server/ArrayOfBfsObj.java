//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.25 at 01:36:04 PM IST 
//


package bfs.soap.siemens.com.webbfs_soap_server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBfsObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBfsObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BfsObj" type="{http://com.siemens.soap.bfs/webbfs-soap-server}BfsObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBfsObj", propOrder = {
    "bfsObj"
})
public class ArrayOfBfsObj {

    @XmlElement(name = "BfsObj")
    protected List<BfsObj> bfsObj;

    /**
     * Gets the value of the bfsObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bfsObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBfsObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BfsObj }
     * 
     * 
     */
    public List<BfsObj> getBfsObj() {
        if (bfsObj == null) {
            bfsObj = new ArrayList<BfsObj>();
        }
        return this.bfsObj;
    }

}
