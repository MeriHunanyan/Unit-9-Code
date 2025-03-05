package animal_demo;
class Animal{
    private String Name;
    private int Age;
    public void Animal(String Name, int Age){
        this.Name = Name;
    }
    public void eat(){}
}
class Mammal extends Animal{
    private String hairType;
    public void Mammal(){}

    public void move(){}
}