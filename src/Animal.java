public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }
    public void eatingFood(String food){
        System.out.println(this.name+" eating "+food);
    }
}
