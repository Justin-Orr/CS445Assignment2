package ImprovedRandom;

import java.util.Random;

@SuppressWarnings("serial")
public class ImprovedRandom extends Random{

	public ImprovedRandom() {
		super();
	}
	
	public ImprovedRandom(long seed) {
		super(seed);
	}
	
	public int nextInt(int lowerbound, int upperbound) {
		Random rand = new Random();
		return rand.nextInt((upperbound - lowerbound)+ 1) + lowerbound;
	}
	
}
