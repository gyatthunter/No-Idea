import java.util.Scanner;
public class StudentDetails {
     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();

        System.out.println("Enter Your Roll Number: ");
        int roll = input.nextInt();

        System.out.println("Enter Your Age: ");
        int age = input.nextInt();

        System.out.println("Enter Your Marks: ");
        double marks = input.nextDouble();
        
        System.out.println("\n\nj"); // /n is for twogit  space. /n/n is for 3

        System.out.println("Name - " +name);
        System.out.println("Roll - " +roll);
        System.out.println("Age - " +age);
        System.out.println("Marks - " +marks);
        
     }
}
