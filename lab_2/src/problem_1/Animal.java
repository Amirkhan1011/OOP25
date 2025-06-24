package problem_1;

import java.util.Objects;

public class Animal extends Zoo {
    private String animalId;

    public Animal(String name, String animalId) {
        super(name);
        this.animalId = animalId;
    }

    public String getAnimalId() {
        return animalId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Animal) {
            Animal other = (Animal) obj;
            return super.equals(other) && this.animalId.equals(other.animalId);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), animalId);
    }

    @Override
    public String toString() {
        return super.toString() + ", Animal ID: " + animalId;
    }
}
