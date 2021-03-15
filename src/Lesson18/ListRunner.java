package Lesson18;

public class ListRunner {
    public static void main(String[] args) {
        List list = new List(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String4");

        Object element = list.get(1);

    }
}
