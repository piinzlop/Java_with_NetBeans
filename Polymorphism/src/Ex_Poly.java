// Class Mom = super
class Person {
    String name, bornplace; // Attribute
    int year;
    public Person(String name, String bornplace, int year){
        this.name = name;
        this.bornplace = bornplace;
        this.year = year;
    }
    // method
    public void Introduce() {
      System.out.println("My name is : "+name);
      System.out.println("Bornplace : "+bornplace);
      System.out.println("Year : "+year);
    }
}

// class Son
class Manager extends Person{
    String workDepart;  // Attribute
    public Manager(String name, String bornplace, int year, String workDepart){
        super(name, bornplace, year); //**
        this.workDepart = workDepart;
    }
    // Method
    @Override // **
    public void Introduce() {
        super.Introduce(); //**
        System.out.println("I am Manager work depart : "+workDepart);
    }
}

// class Son
class Employee extends Person{
    String Depart;  // Attribute
    public Employee(String name, String bornplace, int year, String Depart){
        super(name, bornplace, year);
        this.Depart = Depart;
    }
    // Method
    @Override // **
    public void Introduce() {
        super.Introduce(); //**
        System.out.println("I am Employee : "+Depart);
    }
}

public class Ex_Poly {
    public static void main(String[] args) {
        Person per1, per2, per3;
        per1 = new Person("Tustab","Sun",1001);
        per2 = new Manager("OngG","Mors",2007,"James Bond");
        per3 = new Employee("ManuS","Puto",2077,"Dragon Slayer");
        
    // Call use polymorphism
    per1.Introduce();
    per2.Introduce();
    per3.Introduce();
    }
}
