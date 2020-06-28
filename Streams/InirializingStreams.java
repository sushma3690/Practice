package Streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InirializingStreams {

	public static void main(String[] args) throws IOException {

		Employee[] empArray = new Employee[3];
		empArray[0] = new Employee(1,"A",100);
		empArray[1] = new Employee(2,"cbc",110);
		empArray[2] = new Employee(3,"bca",120);
		List<Employee> empList = Arrays.asList(empArray);
		

		Stream<Employee> empStream = Stream.of(empArray); //one way. passing emp Array
		Stream<Employee> empStreamFromList = Arrays.asList(empArray).stream();//from emp list
		// individual collection element, individual elements
		Stream<Employee> empStreamEach = Stream.of(empArray[0],empArray[1],empArray[2]); 
		//using stream builder
		Stream.Builder<Employee> employeeStreamBuilder = Stream.builder();
		employeeStreamBuilder.accept(empArray[0]);
		employeeStreamBuilder.accept(empArray[1]);
		employeeStreamBuilder.accept(empArray[2]);
		
		// send objects each to stream builder. and then call build to builds it

		Stream<Employee> empStreamFromBuildr = employeeStreamBuilder.build();

		// all above to build streams
		// now lets work on this stream using functions

		//for each to iterate and make changes to each employee
		empStreamFromBuildr.forEach(e->e.salaryIncr(10));
		System.out.println(" ===== incremented in above for each but below it will not reflect"
				+ "because Streams dont change orig data source, thhis change"
				+ "shuld e assigned to a list to see the change");
		empStreamEach.forEach(e->System.out.println(e.getSalary()));// cant resue empStreamFromBuildr

		// because its already used, so use a stream supplier

		Supplier<Stream<Employee>> employeeStreamSupply = ()-> empList.stream();
		System.out.println(" =======================");
		employeeStreamSupply.get().forEach(e->System.out.println(e.getSalary()));

		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);

		///map can be used to do some op from list of one type to convert to other type
		List<Employee> collect1 = l.stream().map(e -> new Employee(e,"trial",100)).collect(Collectors.toList());

		System.out.println(" ======================= took integer converted to Employee");
		System.out.println(collect1.get(0).getId());

		System.out.println(" ======== collect to collect a list");

		List<Employee> employees = empList.stream().collect(Collectors.toList());

		System.out.println(employees.get(0) == empList.get(0));

		//collect employyees id greater than1

		List<Employee> employeesIdGreater1 = empList.stream().filter(e->e.getId() >1).collect(Collectors.toList());
		System.out.println(employeesIdGreater1.size()==2);

		//find first employee whose salary is greater than 100
		Employee emp = empList.stream().filter(e->e.getId() >1).findFirst().orElse(null);
		System.out.println(" ======== used filter to et employees with id >2 and checking first"
				+ "employee d is 2, filer is terminal operation");
		System.out.println(emp.getId()==2);


		//find first employee whose salary is greater than 1000
		Employee emp1 = empList.stream().filter(e->e.getId() >5).findFirst().orElse(null);
		System.out.println(" ======== used filter to get first employees with id >5"
				+ "if not preset null"); 
		System.out.println(emp1 == null);

		//array ti list Arrays.adList, list to arrays - we can use streams
		Employee[] e = empList.stream().toArray(Employee[]::new);

		System.out.println(" created employees array from emp list using toArray(Employee[]::new)");
		System.out.println(e.length==empList.size());
		System.out.println("converted array ::"+(e[0].getId()==empList.get(0).getId()));

		
		//Streams accept any data type but cant work on nested types, so needs to flatten out
		//using flatmap
		List<List<String>> namesNested = Arrays.asList( 
				Arrays.asList("Jeff", "Bezos"), 
				Arrays.asList("Bill", "Gates"), 
				Arrays.asList("Mark", "Zuckerberg"));

		//flatmap 
		Stream<String> str = namesNested.stream()
				.flatMap(Collection::stream);
		//  System.out.println(str.count()); -> 6//has stream for List<String>

		List<String> strList = str.collect(Collectors.toList());
		
		System.out.println("Flattened out List of List and checking size is double "+(strList.size() == namesNested.size()*2));

		//forEach and count -? terminal operation //stream is closed
		//peek, filer - intermediate operation // creates new stream

		//using peek to increment salary istead of filter to have access to stream
		List<Employee> empList2 = empList.stream().peek(e1 -> e1.salaryIncr(5)).peek(System.out::println).collect(Collectors.toList());

		System.out.println(" used peek , could do one mor operation afrer firt peek"+(empList2.get(0).getSalary() == 115));

		//revesit forEach
		employeeStreamSupply.get().forEach(e2->e2.salaryIncr(10));//cliking on . doesnt give further method suggestions, for each ends and closes the stream
		// so better to keep it for non changing ops like print out sys logs
		
		/*****
		 * Intermediate operations such as filter() return a new stream 
		 * on which further processing can be done. Terminal operations, 
		 * such as forEach(), mark the stream as consumed, 
		 * after which point it can no longer be used further
		 */
		
		//get employees whose salary is > 1
		//here filter is intermediate operation which returns new stream and 
		// and count is terminal
		Long empCount = empList.stream()
			      .filter(e5 -> e5.getSalary() > 100)
			      .count();
		System.out.println("emp coutnt is 3 "+(empCount == 3));
		
		System.out.println("Circuit Breaking Ops start-----");
		//short-circuiting operations -> skip and collect from infinite streams
		Stream<Integer> infiniteStream =  Stream.iterate(2, i->i*5);
		//above wil keep on creating integers
		
		//below will skip 2, and print 2*5-10,10*50=50 and then 250
		infiniteStream.skip(1).limit(3).forEach(System.out::println);
		System.out.println("Circuit Breaking Ops  end-----");
		/******
		 * Computation on the source data is only performed when the 
		 * terminal operation is initiated, and source elements are consumed only as needed.
          All intermediate operations are lazy, 
          so they’re not executed until a result of a processing is actually needed.
          two emps 100,200,300 filetring  out >100, only after 200 is procseeed by terminal
          operatr 300 tsarts getting processed
		 */
		//Comparision stream ops
		
         //Sort employees list by name
		List<Employee> empListSortedByNameDec =  employeeStreamSupply.get().sorted((e7,e8 )-> e8.getName().compareTo(e7.getName()))
				.collect(Collectors.toList());
		Iterator<Employee> itr = empListSortedByNameDec.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next().getName()+" ");
		}
		
		  System.out.println("------------ max sal");
		//getMaxSalaried Employee, if no orelse then Optional list gets returned
	System.out.println("NOWWWWWWWWWWWWWWWWWWWWWWWW "+empList.stream().filter(f->f.getId()>1).mapToDouble(Employee::getSalary).sum());
	System.out.println("NOWWWWWWWWWWWWWWWWWWWWWWWW1 "+empList.stream().filter(f->f.getId()>1).mapToDouble(Employee::getSalary).reduce(Double::sum).getAsDouble());

		

		
	 Employee maxSalEmpl =  employeeStreamSupply.get().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
      System.out.println(" max sal "+maxSalEmpl.getSalary()); //145
      
      System.out.println("------------ min sal");
		//getMaxSalaried Employee, if no orelse then Optional list gets returned
		
	 Employee minSalEmpl =  employeeStreamSupply.get().min(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
    System.out.println(" min sal "+minSalEmpl.getSalary()); //125
    
    List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
    boolean alleven = intList.stream().allMatch(i -> i%2==0);
    System.out.println(" false ? "+alleven);
    boolean anyeven = intList.stream().anyMatch(i -> i%2==0);
    System.out.println(" true ? "+anyeven);
    List<Integer> distinctList = intList.stream().distinct().collect(Collectors.toList());
    System.out.println("size sould be 4  " + distinctList.size());
    
    //Specialized Streams - IntStream, LongStream, and DoubleStream – which are primitive 
    //specializations for int, long and double respectively extend BaseSteam class on which Stream
    //is also built
    
    //here mapToInt creates a stream for integer list of ids of employees
    int maxId = empList.stream().mapToInt(Employee::getId).max().orElseThrow(NoSuchElementException::new);
   System.out.println(maxId);
   
   IntStream.of(1, 2, 3);//int stream
   Stream.of(1, 2, 3);//String stream 
   
   empList.stream().map(Employee::getId);//Stream<Integer>
   empList.stream().mapToInt(Employee::getId);//Int Stream
   
   IntStream.range(10, 20);//creates instsream for 10,11...19
    
   //Specialized streams like IntSteam, DoubleStream provide sum(), avg() etc.,
   
   //to get abg employee salary from double stream
   Double avgSal = empList.stream().mapToDouble(Employee::getSalary).average().orElseThrow(NoSuchElementException::new);
   System.out.println(" double salary "+avgSal);
   
   //reduce is used to repeatedly perform somthing on a list.
   //T reduce(T identity, BinaryOperator<T> accumulator)
   //sum sal using reduce
   Double sumSal = empList.stream().mapToDouble(Employee::getSalary).reduce(0.0,Double::sum);
   Double sumSal1 = empList.stream().mapToDouble(Employee::getSalary).sum();
   System.out.println("used reduce and sum both " +(sumSal.doubleValue() == sumSal1.doubleValue()));
	
   //more collector options than toList, joining(,), set, toCollection
   String empNames = empList.stream().map(Employee::getName).collect(Collectors.joining(",")).toString();
   System.out.println("empNames "+empNames);
   
   Set<String> empNames1 = empList.stream().map(Employee::getName).collect(Collectors.toSet());
   System.out.println(empNames1.size()==3);
   
   Collection<String> empNames2 = empList.stream().map(Employee::getName).collect(Collectors.toCollection(Vector::new));
   System.out.println(empNames2.size()==3);

   //to get Stats Summary of a list of say employees all employees salaries
   DoubleSummaryStatistics stats = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
   System.out.println(" Salary stats "+ stats.getAverage() +" "+stats.getMax()+" "+stats.getMin()+" "+stats.getSum()+""
   		+ " "+stats.getCount());
   
   DoubleSummaryStatistics stats1= empList.stream().mapToDouble(Employee::getSalary).summaryStatistics();
   System.out.println(" Salary stats "+ stats1.getAverage() +" "+stats1.getMax()+" "+stats1.getMin()+" "+stats1.getSum()+""
	   		+ " "+stats1.getCount());
   
   //Partition by and group by
   //partition by divides a list into two groups -//2 groups
   // grup by also divides but into multiple groups // > 2 groups
   List<Integer> al = 	Arrays.asList(1,2,3,4,5,6,7,8,9,10);
   
  Map<Boolean,List<Integer>> map= al.stream().collect(Collectors.partitioningBy(i->i%2==0));
  System.out.println(map.get(true)); //even list
  System.out.println(map.get(false)); //odd list
 
  List<String> al1 = 	Arrays.asList("a","abc","aa","b","bb","c","cc","d","dd","e","ee");
  Map<Character,List<String>> map1= al1.stream().sorted().collect(Collectors.groupingBy(a->new Character(a.charAt(0))));
  System.out.println("NNNNNNNNNNNNNNNNNN"+map1.get('a').get(0).equals("a") + " "+map1.get('a').get(1).equals("aa"));
  System.out.println("NNNNNNNNNNNNNNNNNN"+map1.get('b').get(0).equals("a") + " "+map1.get('a').get(1).equals("aa"));

  System.out.println(map1.get('a').size()==2);
  
  // you wnant to group by condition based on one field, but want the list to
  //to have differemy elements

  Map<Character, List<Integer>> idGroupedByAlphabet = empList.stream().collect(
	      Collectors.groupingBy(f -> new Character(f.getName().charAt(0)),
	        Collectors.mapping(Employee::getId, Collectors.toList())));
  
  System.out.println(idGroupedByAlphabet.get('b').get(0)==3);
  
	Employee[] empArray1 = new Employee[2];
	empArray1[0] = new Employee(1,"A",100);
	empArray1[1] = new Employee(2,"B",100);
	
	List<Employee> empList1 = Arrays.asList(empArray1);
	
  Double percentage = 10.0;
  Double salIncrOverhead = empList1.stream().collect(Collectors.reducing(
      0.0, aa -> aa.getSalary() * percentage / 100, (s1, s2) -> s1 + s2));
  System.out.println(salIncrOverhead);
  
  
  Comparator<Employee> nameLengthComp = Comparator.comparing(Employee::getName);
  Map<Character, Optional<Employee>> empMap = empList.stream().collect(
	      Collectors.groupingBy(f -> new Character(f.getName().charAt(0)),
	        Collectors.reducing(BinaryOperator.maxBy(nameLengthComp))));
  
  System.out.println(empMap.get('A').get().getName()); //only 1 name is there, it returs that
  
  //Parallel Streams
  Employee[] arrayOfEmps = {
	      new Employee(1, "Jeff Bezos", 100000.0), 
	      new Employee(2, "Bill Gates", 200000.0), 
	      new Employee(3, "Mark Zuckerberg", 300000.0)
	    };

  List<Employee> empList3 = Arrays.asList(arrayOfEmps);
  
  empList3.stream().parallel().forEach(g -> {g.salaryIncr(10); System.out.println(g.getName());});
  // can see that order is not maintained, u may not see emp 1 being processed forst in print out
  //1. Same level of code safety as multi threaded env is required
  //2. use only if order of output / ops doesnt matter
  //3. is it really needed to do in parallel?
  
  //Generating continuous stream of numbers - using generate, using iterate
  //iterate cant be sued for parallel streams as you have a first elem
  // and ten u get the next elem based on the first elem, so when parallel
  // threads r rxcuting you might see say a number 4 in both the threads
  
  System.out.println("====generate====");
  Stream.generate(Math::random)
  .limit(5)
  .forEach(System.out::println);
  
  System.out.println("====iterate====");

  Stream.iterate(2, i->i+2).skip(1).limit(10).forEach(System.out::println);
  
  //Files with Streams
  
  String[] words = {"Refer","Level","Amma","Mango","Pickle"};
  
 //write to file the above words using streams of the array
  try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get("C:/Users/karsushm/eclipse-workspace/Session1/src/Streams/Input")))){
	  Stream.of(words).forEach(pw::println);
  }
  
  //read from the same file and process the words to find palindrome
  
  List<String> str2 = getPalindrome(Files.lines(Paths.get("C:/Users/karsushm/eclipse-workspace/Session1/src/Streams/Input")), 5);
System.out.println(str2); //Refer,Level
	
	}
	
	private static List<String> getPalindrome(Stream<String> stream, int length) {
	    return stream.filter(s -> s.length() == length)
	      .filter(s -> s.compareToIgnoreCase(
	        new StringBuilder(s).reverse().toString()) == 0)
	      .collect(Collectors.toList());
	} 
	
	

}
