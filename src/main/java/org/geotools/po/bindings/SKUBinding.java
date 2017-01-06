package org.geotools.po.bindings;


import org.geotools.xml.*;
import org.geotools.xml.AbstractSimpleBinding;

import org.geotools.po.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.geotools.org/po:SKU.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xsd:simpleType name="SKU" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *      &lt;xsd:restriction base="xsd:string"&gt;
 *        &lt;xsd:pattern value="\d{3}-[A-Z]{2}"/&gt;
 *      &lt;/xsd:restriction&gt;
 *    &lt;/xsd:simpleType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class SKUBinding extends AbstractSimpleBinding {

	ObjectFactory factory;		
	public SKUBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return PO.SKU;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return String.class;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(InstanceComponent instance, Object value) 
		throws Exception {		
		String sku = (String) value;
		
		if ( !sku.matches( "\\d{3}-[A-Z]{2}" ) ) {
	        throw new IllegalArgumentException( "Illegal sku format: " + sku );
	   }
		
		return sku;
	}

}