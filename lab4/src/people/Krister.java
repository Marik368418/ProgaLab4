package people;

public class Krister extends Person{
    public Krister(String name){
        super(name);
    }
    public void lock(Baby obj, Effa obj2){
        System.out.print(name + " запер " + obj2.name + "в комнате " + obj.name);
    }
    public void regret(){
        System.out.println(" и теперь " + name + " очень пожалел об этом" );
    }

    @Override
    public void see() {
    }
    public void scared(){
        System.out.print(name + " и ") ;
    }
}
