import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private static int userChoice;
    static Scanner input = new Scanner(System.in);
    static ArrayList<Animal> ourAnimals = new ArrayList<>();

    public static void main(String[] args) {
        Hyena h1 = new Hyena("Flin");
        Hyena h2 = new Hyena("Shenzi");
        Lion l1 = new Lion("Simba");
        Lion l2 = new Lion("Nala");
        Monkey m1 = new Monkey("Rafiki");
        Monkey m2 = new Monkey("King-Kong");
        ourAnimals.add(l1);
        ourAnimals.add(l2);
        ourAnimals.add(h1);
        ourAnimals.add(h2);
        ourAnimals.add(m1);
        ourAnimals.add(m2);
        System.out.println("Hi and welcome to our zoo!");
        do{
            System.out.println("Which animal do you want to know more about?");
            System.out.println("1.Lion\n 2.Hyena\n 3.Monkey\n 4.List all our animals\n 0.Leave zoo");
            userChoice = input.nextInt();
            input.nextLine();

            switch(userChoice){
                case 1:
                    l2.roar();
                    l1.roar();
                    System.out.println(l1);
                    break;
                case 2:
                    h1.laugh();
                    System.out.println(h1);
                    break;
                case 3:
                    m2.code();
                    System.out.println(m1);
                    break;
                case 4:
                    for(Animal a:ourAnimals){
                        System.out.println(a.getFood());
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while(userChoice != 0);
    }
}