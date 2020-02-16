package ImprovedRandom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImprovedRandomTest {

	@Test
	void testImprovedBoundedRNG() {
		ImprovedRandom r = new ImprovedRandom();
		int a = 50;
		int b = 75;
		boolean working;
		for(int i = 0; i < 20; i++) {
			working = true;
			int rand = r.nextInt(a, b);
			if(rand < a || rand > b) {
				working = false;
			}
			assertEquals(true, working);
		}
	}

}
