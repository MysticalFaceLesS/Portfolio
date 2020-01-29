import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Programm {
	public static void main(String[] args) {
//		MyClass myClass = new MyClass("Miranda");
//		int number = myClass.getNumber();

		try {
//			Field field = myClass.getClass().getDeclaredField("name");
//			field.setAccessible(true);
//		    field.set(myClass, "Oleg");
//
//			String name = (String)field.get(myClass);
//			System.out.println("Fields: name = " + name + ", number = " + number);
//
//			Method method = myClass.getClass().getDeclaredMethod("printData");
//			method.setAccessible(true);
//			method.invoke(myClass);

			Class clazz = Class.forName(MyClass.class.getName());
//			Class[] params = {String.class, int.class};
//			MyClass myClass = (MyClass) clazz.getConstructor(params).newInstance("Miranda", 32);
//			Field field = myClass.getClass().getDeclaredField("name");
//			field.setAccessible(true);
//		    System.out.println("NAME = " + ((String) field.get(myClass)));

		    Constructor[] consts = clazz.getConstructors();
		    for (Constructor constructor : consts) {
		    	Class[] types = constructor.getParameterTypes();
		    	for (Class type : types) {
		    		System.out.print(type.getName() + " ");
		    	}
		    	System.out.println();
		    }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
