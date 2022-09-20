public class Monkey extends Animal{
    public Monkey(String name) {
        super(name);
    }
    public void code(){
        System.out.println(this.name + " is sitting by the computer and coding!");
        eatingFood("bananas");
    }
}
