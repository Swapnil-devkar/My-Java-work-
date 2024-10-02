// example of mutilevel inheritage....
public class simple7 {
    
        int a;
        int b; 
        int c;
        
    
    
}
class tow extends simple7{ 
    void display1(){
        a=10;
        b=20;
        c=a+b;
    }
}
class three extends tow{
    void display2(){
        System.out.println("Addition of number:"+c);
    }
}
class four {
    public static void main(String[] args) {
        three obj= new three();
        obj.display1();
        obj.display2();
    }

}
