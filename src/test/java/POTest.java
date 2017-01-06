import java.io.FileInputStream;
import java.io.InputStream;

import org.geotools.po.PurchaseOrderType;
import org.geotools.po.bindings.POConfiguration;
import org.geotools.xml.Parser;

import junit.framework.TestCase;

public class POTest extends TestCase {
	
	public void test() throws Exception{
		//InputStream input = getClass().getResourceAsStream( "/po.xml" );
		InputStream input = new FileInputStream("/Users/vickdw/git/gt2-xml-po/src/test/resources/org/geotools/po/po.xml");
		POConfiguration configuration = new POConfiguration();

		Parser parser = new Parser( configuration );
		PurchaseOrderType po = (PurchaseOrderType) parser.parse( input );

		assertNotNull( po );
	}
}
