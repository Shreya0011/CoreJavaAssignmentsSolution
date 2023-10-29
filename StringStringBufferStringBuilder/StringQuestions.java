package StringStringBufferStringBuilder;

public class StringQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(str.length());
		
		String str1 = "Hello, ";
		String str2 = "How are you?";
		System.out.println(str1.concat(str2));
		
		String str3 = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3.replace('a', '$'));
		System.out.println(str3.contains("collection"));
		System.out.println(str3.matches("java string pool refers to collection of strings which are stored in heap memory"));
		System.out.println(str3.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
	
	
		
	
	}

}
