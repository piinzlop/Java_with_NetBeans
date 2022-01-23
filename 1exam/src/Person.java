class Person {
    protected String name = "Puttthiphon";
    protected int age = 21;
    protected String workplace = "Songkhla";
    
    public void walk(){
        System.out.println("I can walk");
    }
    public void eat(){
        System.out.println("I can eat");
    }
}

class Programmer extends Person{
    private String teamName = "Coding 1";
    public void coding(){
        System.out.println("I can coding");
    }
    public static void main(String[] args) {
        Programmer P1 = new Programmer();
    System.out.println("Name : " + P1.name);
    System.out.println("Age : "+ P1.age);
    System.out.println("Work place : " + P1.workplace);
    System.out.println("Team name: " + P1.teamName);
    P1.walk();
    P1.eat();
    P1.coding();
    }
}

class Dancer extends Person{
    private String groupName = "Dancing 1 ";
    public void Dancing(){
        System.out.println("I can dancing");
    }
    public static void main(String[] args) {
        Dancer D1 = new Dancer();
    System.out.println("Name : " + D1.name);
    System.out.println("Age : "+ D1.age);
    System.out.println("Work place : " + D1.workplace);
    System.out.println("Group name: " + D1.groupName);
    D1.walk();
    D1.eat();
    D1.Dancing();
    }
}

class Singer extends Person{
    private String brandName = "Singer 1";
    public void Singer (){
        System.out.println("I can Singer");
    }
    public void playGuitar (){
        System.out.println("I can play guitar");
    }
    public static void main(String[] args) {
        Singer S1 = new Singer();
    System.out.println("Name : " + S1.name);
    System.out.println("Age : "+ S1.age);
    System.out.println("Work place : " + S1.workplace);
    System.out.println("Brand name: " + S1.brandName);
    S1.walk();
    S1.eat();
    S1.Singer();
    S1.playGuitar();
    }
}