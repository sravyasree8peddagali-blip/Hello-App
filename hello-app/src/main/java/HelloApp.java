public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }
        String finalResult = "";
        if (nameBuilder.length() > 0) {
            finalResult = nameBuilder.substring(0, nameBuilder.length() - 2);
        }
        if (finalResult.isEmpty()) {
            System.out.println("Hello, Guest!");
        } else {
            System.out.println("Hello, " + finalResult + "!");
        }
    }
}