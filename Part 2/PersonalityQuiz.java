import java.util.Scanner;

public class PersonalityQuiz {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int score = 0;
       
       System.out.println("Welcome to the 'Which Programming Language Are You?' Quiz!");
       System.out.println("Answer the following questions to discover your coding personality match!");
       
       // Question 1 with input validation loop
       int answer1 = 0;
       while (true) {
           System.out.println("\n1. When working on a project, you prefer to:");
           System.out.println("   1) Build something structured and organized");
           System.out.println("   2) Experiment with creative solutions");
           System.out.println("   3) Focus on efficiency and performance");
           System.out.println("   4) Use the most modern tools available");
           
           try {
               answer1 = Integer.parseInt(scanner.nextLine());
               if (answer1 >= 1 && answer1 <= 4) {
                   break;
               } else {
                   System.out.println("Please enter a number between 1 and 4.");
               }
           } catch (NumberFormatException e) {
               System.out.println("That's not a valid number. Please try again.");
           }
       }
       
       // Question 2 with branching based on previous answer
       int answer2 = 0;
       System.out.println("\n2. Your ideal work environment is:");
       
       if (answer1 == 1) {
           System.out.println("   1) A large corporation with established processes");
           System.out.println("   2) A startup with flexible rules");
       } else if (answer1 == 2) {
           System.out.println("   1) A design agency with creative freedom");
           System.out.println("   2) A research lab exploring new ideas");
       } else if (answer1 == 3) {
           System.out.println("   1) A tech company working on high-performance systems");
           System.out.println("   2) An open-source project optimizing existing code");
       } else {
           System.out.println("   1) A cutting-edge tech startup");
           System.out.println("   2) A company focused on the latest web technologies");
       }
       
       // Input validation for question 2
       while (true) {
           try {
               answer2 = Integer.parseInt(scanner.nextLine());
               if (answer2 == 1 || answer2 == 2) {
                   break;
               } else {
                   System.out.println("Please enter either 1 or 2.");
               }
           } catch (NumberFormatException e) {
               System.out.println("That's not a valid number. Please try again.");
           }
       }
       
       // Calculate results based on answers
       String result;
       if (answer1 == 1 && answer2 == 1) {
           result = "Java - Reliable, structured, and enterprise-ready!";
       } else if (answer1 == 1 && answer2 == 2) {
           result = "C# - Versatile and balanced between structure and flexibility!";
       } else if (answer1 == 2 && answer2 == 1) {
           result = "JavaScript - Creative and adaptable to any environment!";
       } else if (answer1 == 2 && answer2 == 2) {
           result = "Python - Innovative and great for exploring new ideas!";
       } else if (answer1 == 3 && answer2 == 1) {
           result = "C++ - Powerful and performance-oriented!";
       } else if (answer1 == 3 && answer2 == 2) {
           result = "Rust - Modern and focused on safety and performance!";
       } else if (answer1 == 4 && answer2 == 1) {
           result = "Go - Simple, efficient, and perfect for modern systems!";
       } else {
           result = "TypeScript - Cutting-edge with strong type safety for web development!";
       }
       
       System.out.println("\nYour result:");
       System.out.println("You are most like: " + result);
       
       // Additional personality description
       System.out.println("\nPersonality analysis:");
       if (result.contains("Java")) {
           System.out.println("You value stability and well-established systems. You're probably the most organized person in your friend group!");
       } else if (result.contains("JavaScript")) {
           System.out.println("You're adaptable and creative, able to work in any environment. You probably have 10 side projects going at once!");
       } else if (result.contains("Python")) {
           System.out.println("You love exploring new ideas and making complex things simple. You're the friend who always has a clever solution!");
       } else if (result.contains("C++") || result.contains("Rust")) {
           System.out.println("Performance matters to you, and you pay attention to details. You're the one who optimizes everything in life!");
       } else {
           System.out.println("You're always looking toward the future and adopting new technologies early. You probably knew about AI before it was cool!");
       }
       
       scanner.close();
   }
} 
