class Main {
    public static void main(String args[]) {
        String s = "abc";
        String s2 = new String("abc");


        if (s == s2) {
            System.out.println("This will not work");
        }
        else {
            System.out.println("Over here");
        }

        if (s2.equals(s)) {
            System.out.println("This will work");
        }

    }
}