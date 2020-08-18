
package labtask8;

public class Date {
    int d,m,y;
    
    public Date(){ //default constructor
        d = 0;
        m = 0;
        y = 0;
    }
    
    public Date(int d, int m, int y){ //non default construcot
        this.d = d;
        this.m = m;
        this.y = y;
    }
    
    public void DisplayDate(){ //display method
        System.out.println("Day "+d);
        System.out.println("Month "+m);
        System.out.println("Year "+y);
        
    
}
}
