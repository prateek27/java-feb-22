class Main {
    public static void main(String args[]) {
        String s = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");

        if (s2.equals(s3)) {
            System.out.println("Over here");
        }

    }
}