package mytest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import myproj.gittrail.trail1;
public class trailTest extends TestCase {
	public trail1 t;
@Before
public void befo() {
	 t=new trail1();
}
@Test
public void mytest() {
	int m=t.happy();
	System.out.println(m);
	Assert.assertEquals(1,m);
}
}
