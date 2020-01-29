
public class Lesson2Dz {
	
	public static void main(String[] args){
		
		String str1 = "Jon";
		String str2 = "Robert";
		String str3 = "Alex";
		String str5 = "-Concat";
		String str6 = "Hello World!";
		String str7 = " Help me, please!";
		
		
		int met1 = str1.length();
		
		char[] met2 = str2.toCharArray();
		
		String met3 = str3.concat(str5); 
		
		Integer met4 = Integer.valueOf(9); //!
		
		int met5 = str1.compareTo(str2);
		
		char met6 = str2.charAt(0);
		
		System.out.println("(1).Длина слова:");
		System.out.println(met1); // .lenght
		
		System.out.println("(2).Переделываем в массив:");
		System.out.println("Char array:");
	     for (int i = 0; i < met2.length; i++)
	     	System.out.println("Element [" + i + "]: " + met2[i]); //.toCharArray
	     
	    System.out.println("(3).Соединяем:");
	    System.out.println(met3); //.concat - соединяем 
	    
	    System.out.println("(4).Переделываем объект в строку:");
		System.out.println(met4); //.valueOf
		
		System.out.println("(6).Сравниваем 2 строки:");
		System.out.println(met5); //.compareTo
		
		System.out.println("(7).Возращаем символ строки с индексом:");
		System.out.println(met6); //.charAt
		
		System.out.println("(8).Возращаем группу символов:");
		String Str1 = new String("Добро пожаловать");
	      char[] Str2 = new char[7];

	      try {
	         Str1.getChars(2, 9, Str2, 0);
	         System.out.print("Скопированное значение: " );
	         System.out.println(Str2);

	      } catch (Exception ex) {
	         System.out.println("Возникает исключение...");
	      }
	   
       System.out.println("(9).Сравниваем строки на равность с учитыванием регистра:");
	   boolean met7 = str1.equals(str2); //.equals
	   
	   System.out.println(met7);
	   
	   System.out.println("(10).Сравниваем строки на равность без учитывания регистра:");
	   boolean met8 = str1.equalsIgnoreCase(str2);
	   
	   System.out.println(met8); //.equalsIgnoreCase()
	   
	   System.out.println("(11).Сравниваем подстроки в строках: ");
       System.out.println(str1.regionMatches(20, str2, 0, 8));
       
       System.out.println("(12).Ищем индекс первого вхождения в подстроку строки: ");
       String hello = "Hello";
       
       int index1 = hello.indexOf('H');
       int index2 = hello.indexOf('o');
       int index3 = hello.indexOf('W');
       System.out.println("Мы ищем букву 'H' в строке "+hello+". Индекс данной буквы "+index1 );
       System.out.println("Мы ищем букву 'o' в строке "+hello+". Индекс данной буквы "+index2 );
       System.out.println("Мы ищем букву 'W' в строке "+hello+". Индекс данной буквы "+index3 );
       
       System.out.println("(13).Ищем индекс последнего вхождения в подстроку строки: ");
       
       String Str = new String("Добро пожаловать");
       String SubStr1 = new String("Добро");
       String SubStr2 = new String("Srog");

       System.out.print("Найденный последний индекс:");
       System.out.println(Str.lastIndexOf('о'));
       System.out.print("Найденный последний индекс: ");
       System.out.println(Str.lastIndexOf('о', 5));
       System.out.print("Найденный последний индекс: ");
       System.out.println(Str.lastIndexOf(SubStr1));
       System.out.print("Найденный последний индекс: ");
       System.out.println(Str.lastIndexOf(SubStr1, 'о'));
       System.out.print("Найденный последний индекс: " );
       System.out.println(Str.lastIndexOf(SubStr2));
       
       System.out.println("(14).Начинается ли строка из подстроки: ");
       System.out.println(str6.startsWith("Hello"));
       
       System.out.println("(15).Заканчивается ли строка из подстроки: ");
       System.out.println(str6.endsWith("!"));
       
       System.out.println("(16).Заменяем в слова 'Jon' na 'Oon': ");
       System.out.println(str1.replace('J', 'O'));
       
       System.out.println("(17).Заменяем в слова 'Jon' na 'Oon': ");
       System.out.println(str1.replace('J', 'O'));
       
       System.out.println("(18).Удаляем пробелы в 'str7': ");
       System.out.println(str7.trim());
       
       System.out.println("(19).Начинаем строку с индекса [5]: ");
       System.out.println(str7.substring(5));
       
       System.out.println("(20).Всё в нижний регистр: ");
       System.out.println(str7.toLowerCase());
       
       System.out.println("(21).Всё в верхний регистр: ");
       System.out.println(str7.toUpperCase());
	}
}