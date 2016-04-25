package reviewproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReviewCalcTest {

	@Test
	public void testAdd() {
		CalcReview r = new CalcReview();
		r.add(10,  20);
		assertEquals(30, r.getResult());	
	}
	@Test
	public void testMinus(){
		CalcReview r = new CalcReview();
		r.minus(50,20);
		assertEquals(30, r.getResult());
	}
}
