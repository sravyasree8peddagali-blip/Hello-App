public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, Guest!");
            return;
        }
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        String finalGreeting = "Hello, " + nameBuilder.toString() + "!";
        System.out.println(finalGreeting);
    }
}