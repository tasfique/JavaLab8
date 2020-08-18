
package labtask8;

//attributes
public class HouseOwner {
    private static Address addr; //address is a data type, 
    private static String name;
    private static String id;
    
    //default constructor
    public HouseOwner(){
        name = "";
        id = "";
        addr = new Address(); //
    }
    
    //non default constructor
    public HouseOwner(String name, String id, String h_number, String street, String city, String state, String postal){
        this.name = name;
        this.id = id;
        addr = new Address (h_number, street, city, state, postal);
    }
    public void DisplayOwner(){ //display
        System.out.println("Name " +name);
        System.out.println("ID " +id);
        addr.DisplayAddress();
    }

    
    
    
    
    
}
