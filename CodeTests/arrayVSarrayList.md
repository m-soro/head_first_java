```java
    
    // ArrayList                                                    //Regular Array
    ArrayList<String> myList = new ArrayList<String>();             String[] myList = new String[2];     

    String a = "whoohoo";                                           String a = "whoohoo";
    myList.add(a);                                                  myList[0] = a;

    String b = "Frog";                                              String b = "Frog";
    myList.add(b);                                                  myList[1] = b;

    int theSize = myList.size();                                    int theSize = myList.length;

    String str = myList.get(1);                                     String str = myList[1];

    myList.remove(1);                                               myList[1] = null;    

    boolean isIn = myList.contains(b);                              boolean isIn = false;
                                                                    for (String item: myList) {
                                                                        if (b.equals(item)) {
                                                                            isIn = true;
                                                                            break;
                                                                        }
                                                                    }

// Notice how with ArrayList, you're working with an object of type ArrayList, 
// so you're just invoking regular old methods on a
// regular old object, using the regular old dot operator

// With an array, you use special array syntax (like myList[0] = foo) 
// that you won't use anywhere else except with arrays. Even though an array is an object,
// it lives in its own special world, and you can't invoke any methods on it,
// although you can access its one and only instance variable, length.
```