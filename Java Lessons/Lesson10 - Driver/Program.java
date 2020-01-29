import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

//		List<Man> list = new ArrayList<Man>();
//
//		list.add(new Man("Inna"));
//		list.add(new Man("Igor"));
//		list.add(new Man("Tanya"));
//
//		Iterator<Man> iter = list.iterator();
//
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//
//		for (String o : list) {
//			System.out.println(o);
//		}


//		HashMap<String, Man> map = new HashMap<String, Man>();
//
//		map.put("CY123123", new Man("Andrey"));
//		map.put("CY123124", new Man("Anna"));
//		map.put("CY123125", new Man("Olga"));
//
//		for (Map.Entry<String, Man> entry : map.entrySet()) {
//			String key = entry.getKey();
//			Man value = entry.getValue();
//			System.out.println("key = " + key + ", value = " + value);
//		}

		Set<Man> set = new HashSet<Man>();

		Man igor = new Man("Igor");
		Man tanya = new Man("Tanya");

		set.add(igor);
		set.add(tanya);
		set.add(tanya);

		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
