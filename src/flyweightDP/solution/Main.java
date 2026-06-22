package flyweightDP.solution;

public class Main {


    public static void main(String[] args) {

        LetterFactory.createLetter('A').display(1,1);
        LetterFactory.createLetter('B').display(2,2);
        LetterFactory.createLetter('C').display(3,3);
        LetterFactory.createLetter('A').display(4,4);
    }
}
