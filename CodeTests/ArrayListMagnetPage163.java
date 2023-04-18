import java.util.ArrayList;

public class ArrayListMagnetPage163 {
    public static void main (String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        
        // create a list then print it
        a.add(0, "zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        printList(a);

        // here we added four to end of the list
        if (a.contains("three")) {
            a.add("four");
        }

        // then removed the index two
        a.remove(2);
        //then print
        printList(a);

        // if what is on index 4 is not equal to 4 then add 4.2
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printList(a);
        
        // if the array list a contains two (it doesn't) add 2.2
        if (a.contains("two")) {
            a.add("2.2");
        }
        printList(a);


    }

    // this is a method to print the ArrayList
    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }   
}
