package items;

public class Affair extends Thing{
    public Affair(String name){
        super(name);
    }
    public void happen(){
        System.out.print(this.toString() + " было лишь за тем");
    }
    public void toFind(){
        System.out.println(", чтобы найти кого пугать");
    }
}
