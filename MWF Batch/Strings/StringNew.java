class Main {
    public static void main(String args[]) {
        String s = "abc";
        String s2 = new String("abc");


        if (s == s2) {
            System.out.println("This will not work");
        }
        else {
            System.out.println("Here");
        }

        // if (s2.equals(s)) {
        if (s.equals(s2)) {
            System.out.println("This will work");
        }

    }
}