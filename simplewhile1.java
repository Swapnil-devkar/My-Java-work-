class simplewhile1 {
    public static void main(String[] args) {
        int n = 2343, temp, rem, rev = 0;
        temp = n;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (n==rev)
        {
            System.out.println("number is palindorne:");
        } else {
            System.out.println("number is not palindorome");
        }
    }

}
