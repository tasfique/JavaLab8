
package labtask8;
import java.util.Scanner;

public class DentalAppointment {
    
   private static double time;
   private static double duration;
   private static Person ppl;
   private static Date ddt;
   
   public DentalAppointment(){ //default constructor
       time = 0.0;
       duration = 0.0;
       ppl = new Person();
       ddt = new Date();
   }
   
   public DentalAppointment(double time, double duration, String f_name, String l_name, int age, int d, int m, int y){ //non default constructor
       this.time = time;
       this.duration = duration;
       ppl = new Person(f_name, l_name, age);
       ddt = new Date(d, m, y);
       
   }
   
   public void DisplayAppointment(){ //display method
       System.out.println("time "+time);
       System.out.println("duration "+duration);
       ppl.DisplayPerson();
       ddt.DisplayDate();
   }
}
