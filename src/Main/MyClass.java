package Main;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine().trim();
        String lastname = scanner.nextLine().trim();
        int pincode = scanner.nextInt();
        User user = new User(firstname,lastname,pincode);
        System.out.println("Email id is:\n"+ user.getEmailID());

















    }
}
