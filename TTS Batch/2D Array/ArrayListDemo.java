import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

                ArrayList<Integer> arr = new ArrayList<>(100);
                // array size wil be 0


                arr.add(5);
                arr.add(9);
                arr.add(0,4);
                arr.set(0,12); //arr[0] = 9;
                // add - insert
                // get - read
                // set - update


                // print all the elemnents
                for(int i=0; i< arr.size(); i++){
                    System.out.println(arr.get(i));
                }
    }
}
