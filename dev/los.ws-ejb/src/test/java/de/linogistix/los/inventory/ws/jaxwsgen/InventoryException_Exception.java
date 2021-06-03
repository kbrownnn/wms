/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */

package de.linogistix.los.inventory.ws.jaxwsgen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-hudson-48-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "InventoryException", targetNamespace = "http://ws.inventory.los.linogistix.de/")
public class InventoryException_Exception
    extends Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InventoryException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InventoryException_Exception(String message, InventoryException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InventoryException_Exception(String message, InventoryException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: de.linogistix.los.inventory.ws.jaxwsgen.InventoryException
     */
    public InventoryException getFaultInfo() {
        return faultInfo;
    }

}
