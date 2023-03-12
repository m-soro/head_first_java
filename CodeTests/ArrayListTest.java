import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);


        class Friends {
            public String FriendsName;
        }
        
        ArrayList<Friends> myFriends = new ArrayList<Friends>();
        Friends Friend1 = new Friends();
        Friend1.FriendsName = "Rachel";
        Friends Friend2 = new Friends();
        Friend2.FriendsName = "Joey";
        Friends Friend3 = new Friends();
        Friend3.FriendsName = "Ross";
        Friends Friend4 = new Friends();
        Friend4.FriendsName = "Phoebe";

        myFriends.add(Friend1);
        myFriends.add(Friend2);
        myFriends.add(Friend3);
        myFriends.add(Friend4);

        // System.out.println(Friend1.FriendsName); 
        // System.out.println(myFriends.size()); 


        
        for (int i  = 0; i < myFriends.size(); i++) {
            System.out.println(myFriends.get(i).FriendsName);   
        }

        for (String car : cars) {
            System.out.println(car);
        }

        String[] myCars = {"Volvo", "BMW", "Ford", "Mazda"};
     
        System.out.println(" ");
        System.out.println(myCars.length);
        System.out.println(myCars[0]);
     
    
        for (String car: myCars){
            if (car == "Mazda") {
                System.out.println("True");
            }
        }
    }
}    

