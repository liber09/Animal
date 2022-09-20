import java.util.Random;
import java.util.ArrayList;
public class Hyena extends Animal {
    ArrayList<String> animalsFood;
    Random rnd;
    public Hyena(String name) {
        super(name);
        rnd = new Random();
        animalsFood = new ArrayList<>();
        animalsFood.add("termites");
        animalsFood.add("carcase");
        animalsFood.add("antelopes");
        animalsFood.add("wildebeests");
    }

    public void laugh() {
        System.out.println(this.name + " hahahaha!");
    }

    public String toString() {
        return "Fun facts to know about Hyenas. \n Hyenas live in Asia and Africa. \n Usually Hyenas become 10-20 years old. \n Some Hyeans that eats termites can eat up to 200 000 in one night!";
    }

    @Override
    public String getFood() {
        String food = animalsFood.get(rnd.nextInt(3));
        return this.name + " eats "+ food;
    }
}