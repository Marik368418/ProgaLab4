package people;

import enums.Moment;
import exceptions.NotEvenScaredException;

import java.util.Objects;

public class Baby extends Person {

    public void decide(){
        System.out.print(" но " + name + " решил ");
    }

    public Baby(String name) {
        super(name);
    }

    public void scared(){
        System.out.print(name + " страшно испугался, когда ");
    }
    @Override
    public void think(){
        System.out.print(name + " подумал");
    }
    @Override
    public void see(){
        System.out.print(Moment.suddenly +  " " + name + " увидел ");
    }

    public void understand(Karlson obj) throws NotEvenScaredException {
        System.out.println(name + Moment.immediately + " понял, что происходит");
        throw new NotEvenScaredException("Один только " + obj.toString() + " ничуть не успугался");
    }
    @Override
    public void remember(){
        System.out.print(name + " вспомнил");
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
        Baby baby = (Baby) o;
        return Objects.equals(name, baby.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
