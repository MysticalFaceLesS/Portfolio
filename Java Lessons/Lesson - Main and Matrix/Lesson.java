
public class Lesson {

	public static void Main(String[] args){ 
		
		String str1 = "Java";
	    String str2 = new String(); // пуста строка
	    String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
	    String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 - початковий індекс, 4 - кількість символів
	         
	    System.out.println(str1); // Java
	    System.out.println(str2); //
	    System.out.println(str3); // hello
	    System.out.println(str4); // come
	}

 }