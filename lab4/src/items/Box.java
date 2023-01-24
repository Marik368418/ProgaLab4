package items;

public class Box extends Thing {


    public Box(String name, String description){
        super(name, description);
    }

    // внутренний класс
    public class Hole{
        private String name = "щель";

        @Override
        public String toString() {
            return name;
        }
    }
}

