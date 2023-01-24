package items;

public class Newspaper extends Thing {

    public Newspaper(String name) {
        super(name);
    }

    //вложенный статический классы
    public static class Article {
        private String name = " статья";
    }


    public void telling() {
        System.out.print("В " + getName() + " говорилось что");}


}

