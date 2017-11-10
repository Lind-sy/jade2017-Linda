package m00;

import static org.junit.Assert.*;

import org.junit.Test;
import m00.Search;

public class SearchTest {

	Search testclass = new Search();
	
	@Test
	public void testFindCase1() {
		int[] a = new int[]{1,2,3,4};
		int x = 2;
		assertEquals(testclass.find(x, a),1);
	}
	
	@Test
	public void testFindCase2() {
		int[] a = new int[]{1,2,3,4,7};
		int x = 3;
		assertEquals(testclass.find(x, a),2);
	}

	@Test
	public void testFindCase3() {
		int[] a = new int[]{1,2,3,4,7};
		int x = 7;
		assertEquals(testclass.find(x, a),4);
	}
	
	@Test
	public void testFindCase4() {
		int[] a = new int[]{1,2,3,4};
		int x = 8;
		assertEquals(testclass.find(x, a),-1);
	}
}
