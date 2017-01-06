package org.geotools.po.bindings;


import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;
import org.geotools.po.Items;
import org.geotools.po.ObjectFactory;
import org.geotools.po.PurchaseOrderType;
import org.geotools.po.USAddress;

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.geotools.org/po:PurchaseOrderType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xsd:complexType name="PurchaseOrderType" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *      &lt;xsd:sequence&gt;
 *        &lt;xsd:element name="shipTo" type="USAddress"/&gt;
 *        &lt;xsd:element name="billTo" type="USAddress"/&gt;
 *        &lt;xsd:element minOccurs="0" ref="comment"/&gt;
 *        &lt;xsd:element name="items" type="Items"/&gt;
 *      &lt;/xsd:sequence&gt;
 *      &lt;xsd:attribute name="orderDate" type="xsd:date"/&gt;
 *    &lt;/xsd:complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class PurchaseOrderTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public PurchaseOrderTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return PO.PurchaseOrderType;
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
		PurchaseOrderType purchaseOrder = factory.createPurchaseOrderType();

		purchaseOrder.setShipTo( (USAddress) node.getChildValue( "shipTo" ) );
		purchaseOrder.setBillTo( (USAddress) node.getChildValue( "billTo" ) );
		purchaseOrder.setComment( (String) node.getChildValue( "comment" ) );
     	purchaseOrder.setItems( (Items) node.getChildValue( "items") );

     	return purchaseOrder;
		//TODO: implement and remove call to super
		//return super.parse(instance,node,value);
	}

}