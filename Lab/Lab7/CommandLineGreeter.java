package Lab.Lab7;

public class CommandLineGreeter {
    public static void main(String[] args) {

        // args = new String[] {"Amy", "Blue"};

        if (args.length < 2) {
            System.out.println("Usage: java CommandLineGreeter name favoriteColor");
        } else {
            String name = args[0];
            String favoriteColor = args[1];
            
            System.out.println("Hello, " + name + "! Your favorite color is " + favoriteColor + ".");
        }
    }
}