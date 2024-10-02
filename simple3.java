// third type of class is anonymous class 

interface simple3 {

    void accept();

}

class mian {
    public static void main(String[] args) {
    simple3 obj= new simple3() {
       public void accept(){

            System.out.println("example of anonymous class..!");

        }
        
    };
       obj.accept();
    }
}