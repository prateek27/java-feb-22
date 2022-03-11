package com.company;

class Main {
    public static void main(String[] args) {
//        Check Palindrome
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);

//        for (int i = 0; i < s.length(); i++) {
////            rev = s.charAt(i) + rev;
//            sb.insert(0, s.charAt(i));
//        }

//        for (int i = s.length() - 1; i >= 0; i--) {
//            sb.append(s.charAt(i));
//        }

        sb.reverse();

        String rev = sb.toString();

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}