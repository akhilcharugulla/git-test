package myproj.today;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class helloTest {
public static hello h;
	@Test
		public void testcase() {
			h=new hello();
			int y=h.myfunc();
			Assert.assertEquals(1,y);
	}

}
