/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask8;

/**
 *
 * @author Tasfique
 */
public class Address {
    private String h_number, street, city, state, postal;
   
    
    //default constructor 
    public Address(){
        h_number = "";
        street = "";
        city = "";
        state = "";
        postal = "";
    }
    //non default constructor
    public Address(String postal, String owner, String street, String city, String state){ //give values to the object
        this.h_number = owner;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postal = postal;
    }
    
    public void DisplayAddress(){ //display
        System.out.println("Address \n" +"House "+ h_number + street + city + state + postal);
        
    }
    
    
}
