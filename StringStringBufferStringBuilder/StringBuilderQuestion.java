package StringStringBufferStringBuilder;

public class StringBuilderQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.append(" is a peer class of String");
		sb.append(" that provides much of");
		sb.append(" the functionality of strings");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("It is used to _ at the specified index position");
		sb2.deleteCharAt(14);
		sb2.insert(14, "insert text");
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(sb3.reverse());
		
	}

}
