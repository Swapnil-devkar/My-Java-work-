// overloading = same method name and diffrence perameters
// overriding = same method name and same perameters
// final keyworld = we can't take similer method in another class

class simple5{
    void sim(){

        System.out.println("final keyword");

    }

}

class swapp extends simple5 {

    void sim() {

        System.out.println("value of a:"  );
        System.out.println("value of b:"  );
       

    }

}

class man {
    public static void main(String[] args) {
        swapp obj = new swapp();
        obj.sim();
        obj.sim();

    }
}
