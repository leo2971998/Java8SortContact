import Classes.*;

import java.sql.Array;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contact details: ");
        int num = sc.nextInt();
        sc.nextLine();
        List<Contact> C = new ArrayList<Contact>();
        for (int i = 0; i < num; i++) {
            C.add(Contact.CreateContact(sc.nextLine()));
        }
        System.out.println("Enter a sort type: ");
        System.out.println("1. Sort by name");
        System.out.println("2. Sort by email domain");
        System.out.println("3. Sort by date created");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                C.stream().sorted((Comparator.comparing(Contact::getName))).forEach(T-> System.out.println(T.Display()));
                break;
            case 2:
                C.stream().sorted((Comparator.comparing(Contact::getDomain))).forEach(T-> System.out.println(T.Display()));
                break;
            case 3:
                C.stream().sorted((Comparator.comparing(Contact::getDateCreated))).forEach(T-> System.out.println(T.Display()));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}