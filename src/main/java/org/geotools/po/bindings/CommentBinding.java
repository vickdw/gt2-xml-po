package org.geotools.po.bindings;


import org.geotools.xml.*;
import org.geotools.xml.AbstractSimpleBinding;

import org.geotools.po.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the element http://www.geotools.org/po:comment.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xsd:element name="comment" type="xsd:string" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class CommentBinding extends AbstractSimpleBinding {

	ObjectFactory factory;		
	public CommentBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return PO.comment;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(InstanceComponent instance, Object value) 
		throws Exception {
		
		//TODO: implement and remove call to super
		return super.parse(instance,value);
	}

}