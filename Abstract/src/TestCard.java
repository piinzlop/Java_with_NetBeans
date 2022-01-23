import java.util.* ;  // เรียกใช้ library เข้ามา

// สร้าง abstract ชื่อคลาสว่า Card , เป็นคลาสแม่
abstract class Card {
    String name;
    
    // สร้าง abstract method 
    public abstract void greeting(); 
}

// คลาสลูกอันที่ 1 สืบทอดมาจากคลาส Card ชื่อคล้ายว่า Year 
class Year extends Card  {
    
    // สร้าง constructor ชื่อคล้ายกับคลาส Year
    public Year(String n) {
        name = n;
    }
    
    // เรียกใช้ method จากคลาสแม่
    public void greeting() {
        System.out.println("ถึง : " +name+ "\n");
        System.out.println("สวัสดีปีใหม่ \n\n");
    }   
}

// คลาสลูกอันที่ 2 สืบทอดมาจากคลาส Card ชื่อคล้ายว่า Birthday 
class Birthday extends Card {
    int age;
    
    // สร้าง constructor ชื่อคล้ายกับคลาส Birthday
    public Birthday (String n, int years)  {
        name = n;
        age = years;
    }
    
     // เรียกใช้ method จากคลาสแม่
    public void greeting() {
        System.out.println("ถึง : " +name+ "\n");
        System.out.println("สุขสันต์วันเกิด ปีที่" +age+ "\n\n");
    }
}

// คลาสลูกอันที่ 3 สืบทอดมาจากคลาส Card ชื่อคล้ายว่า Valentine 
class Valentine extends Card {
    
    // สร้าง constructor ชื่อคล้ายกับคลาส Valentine
    public Valentine (String n) {
        name = n;
    }
    
    // เรียกใช้ method จากคลาสแม่
    public void greeting() {
        System.out.println("ถึง : " +name+ "\n");
        System.out.println("สุขสันต์วันวาเลนไทน์ \n");
    }
}

public class TestCard {
    public static void main(String[]arge) {
        String me;
        
        // สร้าง Object รับค่ามาจากคีย์บอร์ด
        Scanner input = new Scanner(System.in);
        System.out.println("กรุณาระบุชื่อผู้รับ");
        
        // .next คือ อ่านค่าตัวแปรประเภท String
        me = input.next();
      
        Year yr = new Year(me);
        yr.greeting();
      
        Birthday bd = new Birthday(me,21);
        bd.greeting();
      
        Valentine Val = new Valentine(me);
        Val.greeting();
        
    }
}