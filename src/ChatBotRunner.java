public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 7);

        debbie.greeting("Samira and Raida");
        debbie.weather();
        debbie.favoriteNumber(23);

        System.out.println("There are " + debbie.convertFeetToMeters(16) + " in 16 feet");
        System.out.println("The sum of the numbers is " + debbie.addNumbers(5,14,25));
        System.out.println(debbie.goodbye());
    }
}