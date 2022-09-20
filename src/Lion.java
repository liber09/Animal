import java.util.Random;
import java.util.ArrayList;
public class Lion extends Animal{
    ArrayList<String> animalsFood;
    Random rnd;
    public Lion(String name) {
        super(name);
        rnd = new Random();
        animalsFood = new ArrayList<>();
        animalsFood.add("hyenas");
        animalsFood.add("zeebras");
        animalsFood.add("antelopes");
        animalsFood.add("buffalos");
    }
    public void roar(){
        System.out.println(this.name + " rooar");
        eatingFood(animalsFood.get(rnd.nextInt(3)));
    }
    public String toString(){
        return "Fun facts about lions \n A lions roar can be heard up to 8 km away! \n female lions are the main hunters. \n lions are the only cats that lives in groups.";
    }
    @Override
    public String getFood(){
        String food = animalsFood.get(rnd.nextInt(3));
        return this.name + " eats "+ food;
    }
}
