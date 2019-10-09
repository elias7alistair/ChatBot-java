import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            reply(scanner.nextLine());
        }


    }

    public static void reply(String query){
        String reply="my programmer was too. lazy to code that!";
        switch (query){
            case "hi":
                reply = "Hi there";
                break;
            case "what is your name":
                reply ="My name is ali";

        }
        System.out.println(reply);

    }

}
