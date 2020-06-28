
final public class Employee1 implements Comparable {

	final private int id;
	final private String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	Employee1(int id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Object arg0) {
		Employee1 e = (Employee1)arg0;
		if(e.getId() < this.getId()) {
			return -1; //descending order of ids.
		}
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
