
import static org.junit.Assert.*;

import org.junit.Test;

public class TestHw {

	
	@Test
	public void test() {
		kareemcart x = new kareemcart ();
		x.add(170, 1);
		x.add(100, 1);
	
		assertEquals( 270,x.resultt());
		
	}

}
