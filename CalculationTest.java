import static org.junit.Assert.*;
import org.junit.Test;

public class CalculationTest {
	@Test
	public void testFindMax1() {
		Calculation calculation = new Calculation();
		assertEquals(3,calculation.findMax(new int[]{1,3,4,2}));
	}

	 @Test
   public void testFindMax2() {
      Calculation calculation = new Calculation();
      assertEquals(30,calculation.findMax(new int[]{10,0,30,25}));
   }

	 @Test
   public void testFindMax3() {
      assertTrue(true);
      Calculation calculation = new Calculation();
      assertEquals(25,calculation.findMax(new int[]{21,25,22,23}));
   }
}
