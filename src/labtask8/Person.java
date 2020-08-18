
package labtask8;

public class Person { 
    String f_name, l_name;
    int age;
    
    public Person(){ //default constructor
        f_name = "";
        l_name = "";
        age = 0;
    }
    
    public Person(String f_name, String l_name, int age){ //non default constructor
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
    }
    public void DisplayPerson(){ //display method
        System.out.println("F.Name "+f_name);
        System.out.println("L.Name "+l_name);
        System.out.println("Age "+age);
    }
    
}
