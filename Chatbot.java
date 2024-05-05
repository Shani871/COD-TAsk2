import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! How can I assist you today?");

        while (true) {
            System.out.print("You: ");
            String userQuery = scanner.nextLine();

            // Process user query and generate response
            String response = getResponse(userQuery);

            // Display chatbot response
            System.out.println("Chatbot: " + response);

            // Check if the conversation should end
            if (shouldEndConversation(userQuery)) {
                System.out.println("Chatbot: Thank you for chatting. Goodbye!");
                break;
            }
        }

        scanner.close();
    }

    // Method to generate response based on user query
    private static String getResponse(String userQuery) {
        // Example responses based on user queries
        if (userQuery.contains("weather")) {
            return "The weather today is sunny.";
        } else if (userQuery.contains("time")) {
            return "The current time is 12:00 PM.";
        } else if (userQuery.contains("hello") || userQuery.contains("hi")) {
            return "Hello! How can I help you?";
        } else if (userQuery.contains("bye") || userQuery.contains("goodbye")) {
            return "Goodbye! Have a great day!";
        } else {
            return "I'm sorry, I didn't understand your query.";
        }
    }

    // Method to check if the conversation should end
    private static boolean shouldEndConversation(String userQuery) {
        // End conversation if the user says goodbye
        return userQuery.contains("bye") || userQuery.contains("goodbye");
    }
}
