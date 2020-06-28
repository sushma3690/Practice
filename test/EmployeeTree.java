import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTree {
public static void main(String[] args) {
	TreeSet tr = new TreeSet();
	tr.add(new Employee1(1,"a"));
	tr.add(new Employee1(2,"b"));
	Iterator<Employee1> itr = tr.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next().getId());
	}
	
	Comparator nameComp = new Comparator() {

		@Override
		public int compare(Object arg0, Object arg1) {
			Employee1 e1 = (Employee1)arg0;
			Employee1 e2 = (Employee1)arg1;
			if(e1.getName().compareTo(e2.getName()) > 0) {
				return 1;
			}else {
				return -1;
			}
		}
		
	};
	
	TreeSet tr1 = new TreeSet(nameComp);
	tr1.add(new Employee1(1,"a"));
	tr1.add(new Employee1(2,"b"));
	Iterator<Employee1> itr1 = tr1.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next().getName());
	}
	
	HashSet hs = new HashSet();
	hs.add(1);
	hs.add("String");
	System.out.println(hs);
	

}
}
