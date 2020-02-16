package ImprovedStringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImprovedStringTokenizerTest {

	@Test
	void test_toStringArray() {
		ImprovedStringTokenizer ist = new ImprovedStringTokenizer("This class is easy");
		String[] array = ist.toStringArray();
		String[] ar = {"This", "class", "is", "easy"};
		boolean equal = true;
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(ar[i]) == false) {
				equal = false;
				break;
			}
		}
		assertEquals(true, equal);
	}

}
