// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Class aClass = new Class(15,"Baikal",new int[]{12,13,24,10,91,37,64});
        System.out.println("Number: "+aClass.getNumber());
        System.out.println("Word: "+aClass.getWord());
        System.out.print("Array: ");
        for (int i = 0; i < aClass.getArray().length; i++) {
            System.out.print(aClass.getArray()[i]+" ");
        }

    }
}