public class Puzzle4 {
  public static void main(String[] args) {
    Value[] values = new Value[6];
    int number = 1;
    int i = 0;
    while (i < 6) {
        values[i] = new Value();
        System.out.println("values[i] " + values[i]);
        values[i].intValue = number;
        System.out.println("values[i].intValue " + number);
        number = number * 10;
        System.out.println("number " + number);
        i = i + 1;
        System.out.println("i " + i);
    }
    int result = 0;
    i = 6;
    while (i > 0){
        i = i - 1;
        result = result + values[i].doStuff(i);
    }
    System.out.println("result " + result);
  }
}

class Value {
    int intValue;

    public int doStuff(int factor) {
        if (intValue > 100) {
            return intValue * factor;
        } else {
            return intValue * ( 5 - factor);
        }
    }
}
