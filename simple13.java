abstract class abst {
  
    abstract void accept();
    abstract void display();
    abst(){
      System.out.println("Secured code Hub....!");
  }
    
}
 class ram extends abst{
     void accept(){
        System.out.println(" hello Abhi ");
     }
   void display(){
    System.out.println(" hey......!");
   }
}

 class ram1 extends ram{
  
    void accept(){
        System.out.println(" hello.....! ");
     }
     void display(){
      System.out.println(" heyyyyy......!");
     }
     ram1(){ //constructor call
      super();
    }

}
class sai {
      public static void main(String[] args) {
        ram1 obj = new ram1();
         obj.accept();
         obj.display();
      }
}