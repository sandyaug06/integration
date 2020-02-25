//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.25 at 01:36:04 PM IST 
//


package bfs.soap.siemens.com.webbfs_soap_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBServer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DBUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LinkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceClone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetClone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkInfo", propOrder = {
    "dbServer",
    "dbUser",
    "linkName",
    "sourceClone",
    "sourceColumn",
    "sourceTable",
    "targetClone",
    "targetColumn",
    "targetTable"
})
public class LinkInfo {

    @XmlElement(name = "DBServer", required = true)
    protected String dbServer;
    @XmlElement(name = "DBUser", required = true)
    protected String dbUser;
    @XmlElement(name = "LinkName", required = true)
    protected String linkName;
    @XmlElement(name = "SourceClone", required = true)
    protected String sourceClone;
    @XmlElement(name = "SourceColumn", required = true)
    protected String sourceColumn;
    @XmlElement(name = "SourceTable", required = true)
    protected String sourceTable;
    @XmlElement(name = "TargetClone", required = true)
    protected String targetClone;
    @XmlElement(name = "TargetColumn", required = true)
    protected String targetColumn;
    @XmlElement(name = "TargetTable", required = true)
    protected String targetTable;

    /**
     * Gets the value of the dbServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBServer() {
        return dbServer;
    }

    /**
     * Sets the value of the dbServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBServer(String value) {
        this.dbServer = value;
    }

    /**
     * Gets the value of the dbUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBUser() {
        return dbUser;
    }

    /**
     * Sets the value of the dbUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBUser(String value) {
        this.dbUser = value;
    }

    /**
     * Gets the value of the linkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * Sets the value of the linkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkName(String value) {
        this.linkName = value;
    }

    /**
     * Gets the value of the sourceClone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceClone() {
        return sourceClone;
    }

    /**
     * Sets the value of the sourceClone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClone(String value) {
        this.sourceClone = value;
    }

    /**
     * Gets the value of the sourceColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceColumn() {
        return sourceColumn;
    }

    /**
     * Sets the value of the sourceColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceColumn(String value) {
        this.sourceColumn = value;
    }

    /**
     * Gets the value of the sourceTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTable() {
        return sourceTable;
    }

    /**
     * Sets the value of the sourceTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTable(String value) {
        this.sourceTable = value;
    }

    /**
     * Gets the value of the targetClone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetClone() {
        return targetClone;
    }

    /**
     * Sets the value of the targetClone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetClone(String value) {
        this.targetClone = value;
    }

    /**
     * Gets the value of the targetColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetColumn() {
        return targetColumn;
    }

    /**
     * Sets the value of the targetColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetColumn(String value) {
        this.targetColumn = value;
    }

    /**
     * Gets the value of the targetTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetTable() {
        return targetTable;
    }

    /**
     * Sets the value of the targetTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetTable(String value) {
        this.targetTable = value;
    }

}
