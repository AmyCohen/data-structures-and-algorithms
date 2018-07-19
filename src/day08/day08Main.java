package day08;

public class day08Main {
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);

        list2.append(5);
        list2.append(6);
        list2.append(7);
        list2.append(8);

        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list3.toString());

        mergedList(list1, list2);

    }

    public static LinkedList mergedList(LinkedList list1, LinkedList list2) {

        LinkedList list3 = new LinkedList();

        if (list1.size() < list2.size()) {
            System.out.println("List 1 is bigger, start here.");
        } else if (list1.size() > list2.size()) {
            System.out.println("List 2 is bigger, start here.");
        } else if (list1.size() == list2.size()) {
            System.out.println("The Lists are equal");
        }

        for (int i = 0; i < list1.size(); i++) {
            list3.append(list1.get(i));
            list3.append((list2.get(i)));
            System.out.println(list3);
        }

        System.out.println(list3.toString());
        return list3;
    }
}
