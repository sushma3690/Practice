package DesignPat.Behave.Iter;

public class Driver {
	
	public static void main(String[] args) {
		EmployeeRepo empRepo = new EmployeeRepo();
		Iterator itr= empRepo.getIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
