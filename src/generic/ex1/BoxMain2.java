package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

        Integer integer = (Integer) integerBox.get(); // Object -> Integer
        System.out.println("integer = " + integer);

        ObjectBox stringBOx = new ObjectBox();
        stringBOx.set("Hello");
        String str = (String) stringBOx.get(); // Object -> String

        integerBox.set("abc");
        Integer result = (Integer) integerBox.get(); // Object -> Integer
        System.out.println("result = " + result);


    }


}
