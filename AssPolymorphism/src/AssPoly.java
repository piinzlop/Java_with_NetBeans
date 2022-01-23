// Class Mom = super
class Human {
    String name, bornplace; // Attribute
    int age;
    public Human(String name, String bornplace, int age){
        this.name = name;
        this.bornplace = bornplace;
        this.age = age;
    }
    // method
    public void Introduce() {
      System.out.println("My name is : "+name);
      System.out.println("I was born in : "+bornplace);
      System.out.println("I am : "+age+" years old");
    }
}

// class Son
class Teacher extends Human {
    String workDepart;  // Attribute
    public Teacher(String name, String bornplace, int year, String workDepart){
        super(name, bornplace, year); //**
        this.workDepart = workDepart;
    }
    // Method
    @Override // **
    public void Introduce() {
        super.Introduce(); //**
        System.out.println("Teach at : "+workDepart);
    }
}

// class Son
class Student extends Human{
    String Depart;  // Attribute
    public Student(String name, String bornplace, int year, String Depart){
        super(name, bornplace, year);
        this.Depart = Depart;
    }
    // Method
    @Override // **
    public void Introduce() {
        super.Introduce(); //**
        System.out.println("I study at : "+Depart);
    }
}

public class AssPoly {
    public static void main(String[] args) {
        Human per1, per2, per3;
        per1 = new Human("Tustab","Songkhla",89);
        per2 = new Teacher("OngG","Narathiwat",29,"Engineering");
        per3 = new Student("ManuS","Pattaya",21,"Medicine");
        
    // Call use polymorphism
    per1.Introduce();
    per2.Introduce();
    per3.Introduce();
    }
}
