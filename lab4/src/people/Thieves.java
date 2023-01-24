package people;

import enums.Moment;
import enums.PlaceEnum;
import enums.SizeEnum;
import items.Box;
import items.Thing;
import people.Person;

import java.util.Objects;

public class Thieves extends Person {


    public Thieves(String name) {
        super(name);
    }

    public void pushThrough(Thing obj, Box obj2, Box.Hole obj3){
        System.out.println("как в " + obj3.toString()+ " " + obj2.getName() + " " + obj2.getDescription() + name + " просовывают " + obj.toString() );
    }
    public void climb(){
        System.out.println("Понял, что лезут " + name);

    }
    public void appearing(){
        System.out.println(" в " + PlaceEnum.City + " появилось " + SizeEnum.TOMUCH + " " + name);
    }
    @Override
    public void see(){
        System.out.println(name + "Увидел");
    }
    public void call(Thing obj) {
        System.out.println(name +" " + Moment.firstly + " звонят по " + obj.getName());
    }
    public void hacking(Thing obj){
        System.out.print(name + " взламывают" + obj.toString() );
    }
    public void endure(){
        System.out.println(" и выносят из " + PlaceEnum.Flat + " ценное");
    }
    public void beSure() {
        class NoOne {
            private String name = "никого";
            public void absent(){
                System.out.println(PlaceEnum.Home + " " + name + " нет");
            }
        }
        System.out.print("Убедившись что в ");
        NoOne noOne = new NoOne();
        noOne.absent();
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
        Thieves thieves = (Thieves) o;
        return Objects.equals(name, thieves.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
