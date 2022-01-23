public class Car {
    // ส่วนของ attribute
    private String name ;
    private double topSpeed ;
    
    // ส่วนของ method
    public String get_name() {
        return name ;
    }
    
    public double get_topSpeedMPH() {
        return topSpeed ;
    }
    
    public double get_topSpeedKPH() {
        return topSpeed *1.609344 ;     // 1 ไมล์/ชม. = 1.609344 กิโลเมตร/ชม.
    }
    
    public void setname(String name) {
        this.name = name ;
    }
    
    public void settopSpeed(double speedMPH) {
        topSpeed = speedMPH ;
    }
}

public class test_encaps2 {
    public static void main(String[] args) {
        // ส่วนของ attribute
        Car c = new Car ();
        c.setname("Ducati 1098");
        c.settopSpeed(173.3);
        
        // ส่วนของ method
        System.out.println("รถที่ใช้  : "+c.get_name());
        System.out.println("ความเร็วสูงสุด  : "+c.get_topSpeedMPH()+" ไมล์/ชั่วโมง");
        System.out.println("ความเร็วสูงสุด  : "+c.get_topSpeedKPH()+" กิโลเมตร/ชั่วโมง");
        
    }
}