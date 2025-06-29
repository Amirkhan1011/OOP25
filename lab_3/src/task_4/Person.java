package task_4;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Person's: " + name;
	}
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return name != null && name.equals(other.name);
    }
}
