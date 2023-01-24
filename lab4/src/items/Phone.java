package items;

import exceptions.NotAnsweringException;

public class Phone extends Thing{
    public Phone(String name){
        super(name);
    }
    public void ringing(){
        System.out.print(this.toString() + " звонит");
        throw new NotAnsweringException("не подходить");
    }
}
