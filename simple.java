// example of no static Nested class regularclass/innerclass/ memberclass
class simple {
    int a,b,c;
    void display(){
        a= 20;
        b= 30;
        c= a-b;
        System.out.println("substraction:"+ c);
        

    }
   
    
    class sim {
        int a,b,c;
        void display1() {
           a=10;
           b=30;
           c=a+b;
           System.out.println("value of c"+c);
            
        }
    }
   public static void main(String[] args) {
    simple obj = new simple(); // creating a object of outer class
    simple.sim obj1 =  obj.new sim(); // creating a object of innner class reference in outer class
    obj.display();
    obj1.display1();
   }

}
