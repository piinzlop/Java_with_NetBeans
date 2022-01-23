class animal{
    private String name;
    private int no_of_legs;
    private int age ;

    public animal(String name ,int no_of_legs,int age){
    this.name = name;
    this.no_of_legs = no_of_legs;
    this.age = age ;
    }
    
    public void Sound(){
        System.out.println("sound");
    }
}

class Dog extends animal{
    
    public Dog(String name ,int no_of_legs,int age,String dog_breed){
        super(name,no_of_legs,age);
        System.out.println("DOG");
        System.out.println("Name : " + name);
        System.out.println("Leg : " + no_of_legs);
        System.out.println("Age : " + age );
    }
    
    @Override
    public void Sound(){
        System.out.println("Blow Blow");
        System.out.println("");
    }
}

class Cat extends animal{
    public Cat(String name ,int no_of_legs,int age,String Cat_breed){
        super(name,no_of_legs,age);
        System.out.println("CAT");
        System.out.println("Name : " + name);
        System.out.println("Leg : " + no_of_legs);
        System.out.println("Age : " + age );
    }
    
    @Override
    public void Sound(){
        System.out.println("Meow Meow");
        System.out.println("");
    }
}
class Duck extends animal{
    
    public Duck(String name ,int no_of_legs,int age,String Duck_breed){
        super(name,no_of_legs,age);
        System.out.println("DUCK");
        System.out.println("Name : " + name);
        System.out.println("Leg : " + no_of_legs);
        System.out.println("Age : " + age );
    }
    
    @Override
    public void Sound(){
        System.out.println("Quack Quack");        
        System.out.println("");
    }
}

public class anime {
    public static void main(String[] args){
        animal Dog, Cat, Duck ;
    Dog = new Dog ("Bob"  , 4 , 12 , "Blow Blow"); Dog.Sound();
    Cat = new Cat ("Tong" , 4 , 6 , "Meow Meow"); Cat.Sound();
    Duck = new Duck ("Dum", 2 , 5 , "Quack Quack"); Duck.Sound();
    }
}