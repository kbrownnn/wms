/*
 * Copyright (c) 2009-2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.service;

import javax.ejb.Stateless;

import org.mywms.service.BasicServiceBean;

import de.wms2.mywms.picking.Packet;

/**
 * @author krane
 *
 */
@Stateless
public class LOSPickingUnitLoadServiceBean extends BasicServiceBean<Packet> implements LOSPickingUnitLoadService{
}
