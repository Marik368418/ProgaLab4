package people;

public class Gunilla extends Person{
    public Gunilla(String name){
        super(name);
    }
    @Override
    public void see(){}

    public void scared(){
        System.out.println(name + " испугались не меньше") ;
    }

}
