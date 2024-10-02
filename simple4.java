// used of this keyword

public class simple4 {
    int a ,b; // current variable
    simple4 (int a, int b)//local variable
    { 

 this.a=a;
 this.b=b;

    }
    void display(){
        System.out.println(a);
        System.out.println(b);

    }
    
    
    
}
class main1{
    public static void main(String[] args) {
        simple4 obj = new simple4(20, 90);
        obj.display();
        }
}
