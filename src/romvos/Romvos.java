package romvos;

public class Romvos {

    public static void main(String[] args) {
        
        int numberOfRows = 7;
        char character = '*';
        char space = ' ';

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(space);
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(character);
            }
            System.out.println();

        }
        for (int i = numberOfRows - 1; i > 0; i--) {
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(space);
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
