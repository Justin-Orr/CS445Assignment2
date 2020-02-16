package ImprovedStringTokenizer;

import java.util.StringTokenizer;
import java.util.ArrayList;

public class ImprovedStringTokenizer extends StringTokenizer{
	public ImprovedStringTokenizer(String str) {
		super(str);
	}
	
	public ImprovedStringTokenizer(String str, String delim) {
		super(str, delim);
	}
	
	public ImprovedStringTokenizer(String str, String delim, boolean returnDelims) {
		super(str, delim, returnDelims);
	}
	
	public String[] toStringArray() {
		String[] array;
		ArrayList<String> ar = new ArrayList<String>();
		while(this.hasMoreTokens()) {
			ar.add(this.nextToken());
		}
		array = new String[ar.size()];
		array = ar.toArray(array);
		return array;
	}
}
