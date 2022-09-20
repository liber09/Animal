abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }
    public void eatingFood(String food){
        System.out.println(this.name+" eating "+food);
    }
    public String getFood(){
        return this.name + " eats food";
    }
}
