 class simple9 { 
    void display()
    {
        int a=10;
        System.out.println("number"+a);
    }
    
}
class sim extends simple9{

   void display() 
   {
    super.display();
    System.out.println("hey...!");
   }
}
 class main11 {
    public static void main(String[] args) {
        simple9 obj= new sim();
        obj.display();
       
        
    }
 }