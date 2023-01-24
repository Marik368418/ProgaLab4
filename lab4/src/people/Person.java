package people;

import interfaces.BrainActivity;

public abstract class Person implements BrainActivity {
    public String name;
    Person(String name) {
        this.name = name;
    }

    public abstract void see();
    @Override
    public void think(){
        System.out.println("Подумал");
    }
    @Override
    public void remember(){
        System.out.println("Вспмнил");
    }
    @Override
    public void understand(){
        System.out.println("Понял");
    }
}
