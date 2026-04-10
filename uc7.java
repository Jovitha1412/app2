public class HelloApp {
    public static void main(String[] args) {
        
        // Default value
        String names = "World";

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all elements of the args array separated by a comma and a space
            names = String.join(", ", args);
        }

        // Print the final greeting
        System.out.println("Hello, " + names + "!");
    }
}