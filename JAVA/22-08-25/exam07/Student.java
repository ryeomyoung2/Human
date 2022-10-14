package exam07;

public class Student {
	public int id;
	public String name;
	
	public Student (int id, String name) {
		this.id= id;
		this.name = name;
	}
	public int hashCode() {
		return id + name.hashCode();
		// String의 경우 hashCode를 붙여야함.
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return (this.id==s.id 
					&& this.name.equals(s.name));
		}
		else {
			return false;
		}
	}
	

}
