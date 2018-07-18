package day07;

public class Iterator {
    public static void main(String[] args) {
     iterator();
    }

    public static void iterator () {
        LinkedLists ll = new LinkedLists();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        ll.printList();

        //Node Data should be 3
        ll.getValueFromEnd(1);

        //Node Data should be 1
//        ll.getValueFromEnd(3);

        System.out.println(ll.size());

    }
}
