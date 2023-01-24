package items;

public class Game extends Thing{
    public Game(String name, String description){
        super(name, description);

    }
    @Override
    public String toString(){
        return getName() + getDescription();
    }
}
