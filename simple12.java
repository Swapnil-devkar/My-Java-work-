
 //example of  abstract 
public class simple12 {
    
    void sum(int a){
        int sum = 10;
        sum= sum + a;
       System.out.println("sum"+sum);
    }
     public static void main(String[] args) {
        simple12 obj= new simple12();
        obj.sum(20);
     }
}
