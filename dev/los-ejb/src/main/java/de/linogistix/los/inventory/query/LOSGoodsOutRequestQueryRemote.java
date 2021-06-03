/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.query;

import javax.ejb.Remote;

import de.linogistix.los.query.BusinessObjectQueryRemote;
import de.wms2.mywms.shipping.ShippingOrder;

@Remote
public interface LOSGoodsOutRequestQueryRemote extends BusinessObjectQueryRemote<ShippingOrder>{
	

}
