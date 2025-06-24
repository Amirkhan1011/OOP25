package problem_1;

import java.util.Objects;

public class Zoo {
	private String name;
	
	public Zoo(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		else if (obj instanceof Zoo) {
			Zoo animal = (Zoo) obj;
			return this.name.equals(animal.name);
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return Objects.hash(name);
	}
	
	public String toString() {
		return "Name of the zoo: " + name;
	}
}
