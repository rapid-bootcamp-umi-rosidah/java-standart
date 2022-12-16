package genericMethod;

public class MainArrayHelper {
    public static void main(String[] args) {
        String[] names = { "Umi","Rosidah"};
        Integer[] values = {1,2,3,4,5};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(values));
    }
}
