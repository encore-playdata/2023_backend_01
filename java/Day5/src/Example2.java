import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		Map<String, List<Person>> map = new HashMap<>();
//		¼­¿ï null -> [¹Ú¾¾] -> [¹Ú¾¾, ±è¾¾]
//		ºÎ»ê [ÀÌ¾¾] 
//		´ëÀü [µµ¾¾] 
//		Á¦ÁÖ [·ù¾¾] 
//		¾Èµ¿ []
//		Æò¾ç
//		List<Person> persons = new ArrayList<Person>();
//		persons.add(new Person("¹Ú¾¾",20));
//		// [¹Ú¾¾]
//		map.put("¼­¿ï", persons);
//		List<Person> persons1 = map.get("¼­¿ï");
//		// [¹Ú¾¾]
//		persons1.add(new Person("±è¾¾",20));
//		// [¹Ú¾¾, ±è¾¾]
//		System.out.println(map);
		
		
		List<Person> getList = map.getOrDefault("¼­¿ï", new ArrayList<Person>());
//		{} [] [¹Ú¾¾] 
		getList.add(new Person("±è¾¾",20));
//		// [¹Ú¾¾ , ±è¾¾]
		map.put("¼­¿ï", getList);
//		{¼­¿ï:[¹Ú¾¾], Æò¾ç: [±è]} {¼­¿ï : [¹Ú¾¾ , ±è¾¾]}
//		System.out.println(map);
//		find , insert 
		
		
	}
	
	
	
}
