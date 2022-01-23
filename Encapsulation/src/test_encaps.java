class EncapsDemo{
    // ส่วนของ attribute
    private int empAge;
    private String empId, empName;
    
    /* ถ้าต้องการเข้าถึง attribute ที่เป็น private ให้ใช้ 
        ตัวแปร getter ใช้สำหรับการอ่าน หรือ ดูข้อมูล
        setter ใช้สำหรับเปลี่ยนแปลง หรือ อัปเดตข้อมูล    */
    
    // ส่วนของ method
    public String get_empId(){     // ทำการอ่านค่า
        return empId;
    }
    
    public String get_empName(){    // ทำการอ่านค่า 
        return empName;
    }
    
    public int get_empAge(){    // ทำการอ่านค่า
        return empAge;
    }
    
    public void set_empId(String new_id){  // ทำการอัปเดตค่า
        empId = new_id;
    }
    
    public void set_empNaame(String new_name){ // ทำการอัปเดตค่า
        empName = new_name;
    }
    
    public void set_empAge(int new_age){  // ทำการอัปเดตค่า
        empAge = new_age;
    }
}

public class test_encaps {
    public static void main(String args[]) {
        EncapsDemo obj = new EncapsDemo();  // สร้าง Object ใหม่
        
        // รับค่าข้อมูล
        obj.set_empId("0023");
        obj.set_empNaame("Putthiphon");
        obj.set_empAge(20);
        
        // แสดงค่าที่รับมา
        System.out.println("รหัสลูกจ้าง : "+obj.get_empId());
        System.out.println("ชื่อลูกจ้าง : "+obj.get_empName());
        System.out.println("อายุลูกจ้าง : "+obj.get_empAge()+" ปี");
    }
}