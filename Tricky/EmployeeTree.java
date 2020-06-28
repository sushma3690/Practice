package Tricky;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeTree {
	
	
	public static Map<Employee,Integer> sortedByValues(Map<Employee, Integer> mp){
		
		Comparator<Employee> valueComparator = 
	             new Comparator<Employee>() {
	      
			public int compare(Employee k1, Employee k2) {
	        int compare = 
	              mp.get(k1).compareTo(mp.get(k2)); //1,5,6 //asc order
	        if (compare == 0) 
	          return 1;
	        else 
	          return compare;
	      }
	    };
		
		
		 
		
		TreeMap<Employee,Integer> tpbyVal = new TreeMap<Employee, Integer>(valueComparator);
		
		tpbyVal.putAll(mp);
		
		return tpbyVal;
		
	}
	public static void main(String[] args) {
		TreeMap<Employee, Integer> tp = new TreeMap<Employee,Integer>();
		Employee e1 = new Employee();
		e1.setAge(29);
		e1.setName("Susu");
		tp.put(e1, 1);
		
		Employee e2 = new Employee();
		e2.setAge(29);
		e2.setName("Puppy");
		tp.put(e2, 5);

		
		Employee e3 = new Employee();
		e3.setAge(33);
		e3.setName("Annaya");
		tp.put(e3, 6);
		System.out.println(tp.size());
		Set<Entry<Employee, Integer>>  set1 = tp.entrySet();
		System.out.println(set1);
		Map<Employee,Integer> sorted = sortedByValues(tp);
		System.out.println(sorted.size());
		Set<Entry<Employee, Integer>>  set = sorted.entrySet();
		System.out.println(set);
	}

}
