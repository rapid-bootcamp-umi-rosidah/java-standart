package stringClass;

public class MainString {
    public static void main(String[] args) {
        String name = "Umi Rosidah";
        System.out.println("To Lower case "+name.toLowerCase());
        System.out.println("To Upper case "+name.toUpperCase());
        System.out.println("Length: "+ name.length());
        System.out.println("Start with: "+ name.startsWith("U"));
        System.out.println("End with: "+ name.endsWith("U"));

        String[] names = name.split(" ");
        System.out.println("Jml Kata "+ names.length);
        System.out.println("Index ke 0 "+ names[0]);
        System.out.println("Index ke 1 "+ names[1]);
    }
}

