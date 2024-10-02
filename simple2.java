//second type of class is local innner class

class simple2 {

    void display() {

        class simp {
            void display1() {
                int a = -10;
                if (a >= 0)
                    System.out.println("the number is positive :");
                else
                    System.out.println("the number is negitive:");
            }

        }
        class simp1 {
            void display2() {
                int n = 0;
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        }

        simp obj1 = new simp(); // creating a object of inner class
        simp1 obj2 = new simp1();
        obj1.display1();
        obj2.display2();
    }

}

class main {
    public static void main(String[] args) {
        simple2 obj1 = new simple2(); // creating a object of outer class or main class
        obj1.display();
    }

}
