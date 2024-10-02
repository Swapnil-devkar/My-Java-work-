// hierarchical Inheriatance
interface a {

    void input();// public +abstract

    default void output() {

        System.out.println("hello");

    }

}

class b implements a {

    int rollno = 1;

    String name = "madhuri";

    public void input() // method overriding

    {

        System.out.println("rollno" + rollno);

        System.out.println("name" + name);

    }
}

class demo9 {

    public static void main(String[] args) {

        a r = new b();

        r.input();

        r.output();

    }

}

