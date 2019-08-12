import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sonygangwar
 *
 */
public class Solution {
	
	static Map<Integer,BigInteger> map = new HashMap<>();

	public static void main(String args[]) {
		String data = "cat";
		subset(data, "", 0);
		
		}
	
	
	private static BigInteger fib(int n) {
		System.out.println("------"+ n);
		if(map.get(n) != null) return map.get(n);
		if(n <2) return new BigInteger(String.valueOf(n));
		else {
			BigInteger result = fib(n-1).add(fib(n-2));
			map.put(n, result);
			return result;
		}
	}
	
	private static void subset(String data, String substring, int i) {
		if(i == data.length()) System.out.println(substring);
		else {
			String s = String.valueOf(data.charAt(i));
			i++;
			subset(data, substring.concat(s), i);
			subset(data, substring, i);
		}
		
	}

}
