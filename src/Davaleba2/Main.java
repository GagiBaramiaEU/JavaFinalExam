package Davaleba2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> cities = new HashMap<>();
        cities.put("Samtredia ♕", 5000000);
        cities.put("Tbilisi", 1200000);
        cities.put("Ozurgeti", 6);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("შეიყვანეთ ქალაქის სახელი: ");
        String input = scanner.nextLine().toLowerCase();

        boolean found = false;

        for(HashMap.Entry<String, Integer> entry : cities.entrySet()){
            if (entry.getKey().toLowerCase().contains(input)){
                System.out.println(entry.getKey() + " - მოსახლეობა - " + entry.getValue());
                found = true;
            }
        }

        if(!found){
            System.out.printf("ქალაქი ვერ მოიძებნა");
        }
    }
}
