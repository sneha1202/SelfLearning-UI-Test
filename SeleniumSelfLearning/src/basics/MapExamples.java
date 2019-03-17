package basics;

import java.util.HashMap;

public class MapExamples {
public static void main(String[] args) {
	//MapInterface
	//Map is type of collection allows key-value pair.
	//In Map, Key is Object type and it is unique.
	//In Map, Value is referenced using Key.
	//Map is not related to Collection Interface.(Map 
	//Collections have subinterfaces like link,set and queue.Map works with Key Value/Pairs.
	//While other collections just works with values for example add(my value) method.
	HashMap hMap=new HashMap();
	hMap.put(123,"name1");
	hMap.put("Key", 12.34);
	hMap.put(null, "123");
	System.out.println("Map Elements ::" + hMap);
	System.out.println("Value is     ::"+ hMap.get(null));
	System.out.println("Keys are     ::" +hMap.keySet());
	System.out.println("Values are   ::"+hMap.values());
}	

}
