public class AlphabetClassifier {
    public static void main(String[] args) {
        // Generate a random alphabet (A-Z, a-z)
        char alphabet = (char) ('A' + Math.random() * ('z' - 'A' + 1));

        // Print the randomly generated alphabet
        System.out.println("The alphabet '" + alphabet + "' is");

        // Classify the alphabet using switch statements
        switch (alphabet) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("a vowel");
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
                System.out.println("in the first four letters");
            default:
                System.out.println(alphabet >= 'A' && alphabet <= 'z' ? "a consonant" : "not an alphabet character");
        }
    }
}
