//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.02 at 08:14:33 PM IST 
//


package bfs.soap.siemens.com.webbfs_soap_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchObjectsResult" type="{http://com.siemens.soap.bfs/webbfs-soap-server}SearchObjectsResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchObjectsResult"
})
@XmlRootElement(name = "SearchObjectsResponse")
public class SearchObjectsResponse {

    @XmlElement(name = "SearchObjectsResult", required = true)
    protected SearchObjectsResult searchObjectsResult;

    /**
     * Gets the value of the searchObjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchObjectsResult }
     *     
     */
    public SearchObjectsResult getSearchObjectsResult() {
        return searchObjectsResult;
    }

    /**
     * Sets the value of the searchObjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchObjectsResult }
     *     
     */
    public void setSearchObjectsResult(SearchObjectsResult value) {
        this.searchObjectsResult = value;
    }

}
