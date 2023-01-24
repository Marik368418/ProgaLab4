import exceptions.NotAnsweringException;
import exceptions.NotEvenScaredException;
import interfaces.Ring;
import items.*;
import people.*;
public class Main {
    public static void main(String[] args) {

        Affair affair = new Affair("Дело");
        affair.happen();
        affair.toFind();
        Phone phone = new Phone("телефон");
        Baby baby = new Baby("Малыш");
        try {
            phone.ringing();
        }
        catch (NotAnsweringException e){
            baby.decide();
            System.out.println(e.getMessage());
        }
        Ring ring = new Ring() {
            @Override
            public void RingByHimself() {
                System.out.println("Пусть себе звонит!");
            }
        };
        ring.RingByHimself();
        Karlson karlson = new Karlson("Карлсон");
        karlson.breathe();
        Thing lad = new Thing("лад", "разные");
        karlson.scream(lad);
        Preparations preparations = new Preparations("приготовления", "все ");
        preparations.preparation();
        Time time = new Time("время");
        time.goingtime();
        Door door = new Door("дверь","входная");
        They they = new They("они");
        they.stay();
        door.open();
        they.goingOut();
        Passer passer = new Passer("прохожие");
        they.scare(passer);
        Sound sound = new Sound("царапанье", "слабое");
        sound.sound();
        baby.think();
        Father father = new Father(" Папа");
        Mother mother = new Mother(" Мама");
        mother.went();
        father.went();
        baby.see();
        Thing wire = new Thing("проволка","стальная");
        Thieves thieves = new Thieves(" Воры");
        Box box = new Box("ящик", "для писем");
        Box.Hole hole = box.new Hole();
        thieves.pushThrough(wire, box, hole);
        thieves.climb();
        baby.remember();
        Newspaper.Article article = new Newspaper.Article();
        Newspaper newspaper = new Newspaper("газета");
        father.read(mother, newspaper);
        newspaper.telling();
        thieves.appearing();
        thieves.call(phone);
        Thing lock = new Thing("замок");
        thieves.beSure();
        thieves.hacking(lock);
        thieves.endure();
        baby.scared();
        try{
            baby.understand(karlson);
        }
        catch (NotEvenScaredException e) {
            Krister krister = new Krister("Кристер");
            Gunilla gunilla = new Gunilla("Гунилла");
            krister.scared();
            gunilla.scared();
            Effa effa = new Effa("Еффа ");
            krister.lock(baby, effa);
            Game game = new Game("игра", " в привидения");
            effa.barking();
            effa.spoil(game);
            krister.regret();
            System.out.print(e.getMessage());
        }
    }
}