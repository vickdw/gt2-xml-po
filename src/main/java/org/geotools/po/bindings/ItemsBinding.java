package org.geotools.po.bindings;


import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;
import org.geotools.po.Items;
import org.geotools.po.ObjectFactory;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.geotools.org/po:Items.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xsd:complexType name="Items" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *      &lt;xsd:sequence&gt;
 *        &lt;xsd:element maxOccurs="unbounded" minOccurs="0" name="item"&gt;
 *          &lt;xsd:complexType name="Items_item"&gt;
 *            &lt;xsd:sequence&gt;
 *              &lt;xsd:element name="productName" type="xsd:string"/&gt;
 *              &lt;xsd:element name="quantity"&gt;
 *                &lt;xsd:simpleType&gt;
 *                  &lt;xsd:restriction base="xsd:positiveInteger"&gt;
 *                    &lt;xsd:maxExclusive value="100"/&gt;
 *                  &lt;/xsd:restriction&gt;
 *                &lt;/xsd:simpleType&gt;
 *              &lt;/xsd:element&gt;
 *              &lt;xsd:element name="USPrice" type="xsd:decimal"/&gt;
 *              &lt;xsd:element minOccurs="0" ref="comment"/&gt;
 *              &lt;xsd:element minOccurs="0" name="shipDate" type="xsd:date"/&gt;
 *            &lt;/xsd:sequence&gt;
 *            &lt;xsd:attribute name="partNum" type="SKU" use="required"/&gt;
 *          &lt;/xsd:complexType&gt;
 *        &lt;/xsd:element&gt;
 *      &lt;/xsd:sequence&gt;
 *    &lt;/xsd:complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class ItemsBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public ItemsBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return PO.Items;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return Items.class;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(ElementInstance instance, Node node, Object value) 
		throws Exception {
		Items items = factory.createItems();
		
		items.getItem().addAll(node.getChildValues("item"));
				
		return items;
		//TODO: implement and remove call to super
		//return super.parse(instance,node,value);
	}

}