import java.util.Random;
import java.util.ArrayList;
public class Monkey extends Animal{
    ArrayList<String> animalsFood;
    Random rnd;
    public Monkey(String name) {
        super(name);
        rnd = new Random();
        animalsFood = new ArrayList<>();
        animalsFood.add("fruits");
        animalsFood.add("nuts");
        animalsFood.add("spiders");
        animalsFood.add("seeds");
    }
    public void code(){
        System.out.println(this.name + " is sitting by the computer and coding!");
        eatingFood("bananas");
    }
    public String toString(){
        return "Fun facts about Monkeys \n Monkeys sleep whlie sitting in trees, often upright. \n A howler monkey can be heard about 3 miles away. \n There are over 264 different specis of monkeys around the world";
    }
    @Override
    public String getFood(){
        String food = animalsFood.get(rnd.nextInt(3));
        return this.name + " eats "+ food;
    }
}

