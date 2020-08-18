
package labtask8;

import java.util.Scanner;

public class AddressMain {
    public static void main(String[]args){
        HouseOwner houseowner; //objects
        Scanner read = new Scanner (System.in);
       
        
        String h_number, street, city, state, name, id, postal; //variables
       
        
        System.out.println("Enter house number ");
        h_number = read.next();
        System.out.println("Enter Street ");
        street = read.next();
        System.out.println("Enter City ");
        city = read.next();
        System.out.println("Enter State ");
        state = read.next();
        System.out.println("Enter name ");
        name = read.next();
        System.out.println("Enter ID ");
        id = read.next();
        System.out.println("Enter postal ");
        postal = read.next();
        
        houseowner = new HouseOwner(name, id, h_number, street, city, state, postal);
        houseowner.DisplayOwner();
        
    }
    
}
