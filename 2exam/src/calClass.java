class calculate {
    public int add(int x, int y){
       return x + y ;
    }
    
    public int add(int x, int y, int z){
       return x + y + z;
    }
    
    public int add(double x, int y){
       return (int)x + y ;
    }
    
    public int add(int x, float y){
       return x + (int)y ;
    }
}

public class calClass {
    public static void main(String[] args) {
        calculate cal = new calculate();
        System.out.println(cal.add(42,52));
        System.out.println(cal.add(123,113,312));
        System.out.println(cal.add(412.5,331));
        System.out.println(cal.add(32.2,89));
    }
}