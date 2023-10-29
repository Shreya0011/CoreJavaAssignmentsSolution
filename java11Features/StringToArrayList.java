package java11Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "A quick brown fox jumps over the lazy dog";
		List<String> newList = str.lines().collect(Collectors.toList());
		System.out.println(newList);
		String strArr[] = newList.toArray(String[]::new);
		System.out.println(Arrays.toString(strArr));
		
	}

}
