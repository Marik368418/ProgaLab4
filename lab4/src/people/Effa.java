package people;

import items.Game;

public class Effa extends Person{

    public Effa(String name){
        super(name);
    }
    public void barking(){
        System.out.print(" чтобы " + name +"своим лаем ");
    }
    public void spoil(Game obj){
        System.out.print(" не испортил " + obj.toString());
    }
    @Override
    public void see(){}

}
