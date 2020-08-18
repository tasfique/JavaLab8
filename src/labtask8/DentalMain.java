
package labtask8;

import java.util.Scanner;

public class DentalMain {
    public static void main (String[]args){
        DentalAppointment dapp = new DentalAppointment(); //object
        Scanner read = new Scanner(System.in);
        
        double time, duration; //variables
        String f_name, l_name; 
        int age, d, m, y;
        
        System.out.println("Enter F.name ");
        f_name = read.next();
        System.out.println("Enter L.name ");
        l_name = read.next();
        System.out.println("Enter age ");
        age = read.nextInt();
        System.out.println("Enter time ");
        time = read.nextDouble();
        System.out.println("Enter duration ");
        duration = read.nextDouble();
        System.out.println("Enter Day ");
        d = read.nextInt();
        System.out.println("Enter Month ");
        m = read.nextInt();
        System.out.println("Enter Year ");
        y = read.nextInt();
        
        dapp = new DentalAppointment(time, duration, f_name, l_name, age, d, m, y); //passing variables to dental appointment class
        dapp.DisplayAppointment();
        
    }
}
