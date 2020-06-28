package DesignPat.Behave.Iter;

public class EmployeeRepo implements Sector{
    String[] empNames = new String[] {"Susu","Puppy","Annaya","Golu"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new EmployeeIterator();
	}
	
	private class EmployeeIterator implements Iterator{
        int index;
		@Override
		public boolean hasNext() {
			if(index < empNames.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			String name="";
			if(hasNext()) {
				name = empNames[index++];
			}
			return name;
			
		}
		
	}

}
