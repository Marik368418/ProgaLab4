package people;

import java.util.Objects;

public class Passer extends Person {

    public Passer(String name) {
        super(name);
    }

    @Override
    public void see(){
        System.out.println(name + "Увидел");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passer passer = (Passer) o;
        return Objects.equals(name, passer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}