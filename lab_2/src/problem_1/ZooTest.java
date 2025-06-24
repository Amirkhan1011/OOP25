package problem_1;

import java.util.HashSet;

public class ZooTest {

	public static void main(String[] args) {
		HashSet<Zoo> zooSet = new HashSet<>();
		Zoo zoo1 = new Zoo("Safari Park");
        Zoo zoo2 = new Zoo("Safari Park"); //duplicate

        Animal animal1 = new Animal("Safari Park", "A001");
        Animal animal2 = new Animal("Safari Park", "A001"); // duplicate
        Animal animal3 = new Animal("Safari Park", "A002"); // diff ID

        zooSet.add(zoo1);
        zooSet.add(zoo2);      
        zooSet.add(animal1);
        zooSet.add(animal2);  
        zooSet.add(animal3);   
        
        System.out.println("Set contains:");
        for (Zoo z : zooSet) {
            System.out.println(z);
        }
	} 

}
