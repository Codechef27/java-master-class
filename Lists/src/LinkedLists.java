import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {


    public static void main(String[] args) {

   //     LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");

        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        gettingelements(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        printItinerary3(placesToVisit);
        testIterator(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Florida");

        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        list.push("Alice Springs");


    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Florida");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");


        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");


        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        String p1 = list.poll();
        System.out.println(p1 + " Was removed");


        String p2 = list.pollFirst();
        System.out.println(p2 + " Was removed");


        String p3 = list.pollLast();
        System.out.println(p3 + " Was removed");

        list.push("Sydney");
        list.push("Canberra");
        list.push("Brisbane");

        System.out.println(list);

        String p4 = list.pop();

        System.out.println(p4 + " was popped");
    }

    private static void gettingelements(LinkedList<String> list) {

        System.out.println("Retrieved element = " + list.get(4));

        System.out.println("Retrieved element = " + list.getFirst());
        System.out.println("Retrieved element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        System.out.println("Element from element() = " + list.element());
        System.out.println("element from peek() = " + list.peek());
        System.out.println("element from peekFirst() = " + list.peekFirst());
        System.out.println("element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip Starts at " + list.getFirst());

        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }


    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip Starts at " + list.getFirst());

//        for(int i = 1; i < list.size(); i++){
//            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
//        }

        String previousTown = list.getFirst();
        for(String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town );
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }


    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip Starts at " + list.getFirst());

        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town );
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")) {
                iterator.remove();
                iterator.add("Lake Wivenhoe");
            }
        }
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
     }




}
