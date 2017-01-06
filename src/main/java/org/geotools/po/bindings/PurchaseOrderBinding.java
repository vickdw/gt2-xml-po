package org.geotools.po.bindings;


import org.geotools.xml.*;
import org.geotools.xml.AbstractSimpleBinding;

import org.geotools.po.ObjectFactory;
import org.geotools.po.PurchaseOrderType;
import org.geotools.po.USAddress;

import javax.xml.namespace.QName;

/**
 * Binding object for the element http://www.geotools.org/po:purchaseOrder.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xsd:element name="purchaseOrder" type="PurchaseOrderType" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class PurchaseOrderBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public PurchaseOrderBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return PO.purchaseOrder;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return PurchaseOrderType.class;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(ElementInstance instance, Node node, Object value) 
		throws Exception {
		PurchaseOrderType po = new PurchaseOrderType();
		
		po.setBillTo((USAddress) node.getChildValue("USAddress"));
		po.setComment((String) node.getChildValue("comment"));
		
		return po;
		//TODO: implement and remove call to super
		//return super.parse(instance,node,value);
	}

}