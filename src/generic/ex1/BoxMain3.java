package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입이 결정된다.
        integerBox.set(10);
//        integerBox.set("abc"); // 컴파일 에러

        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14);
        Double d = doubleBox.get();
        System.out.println("d = " + d);

    }


}
