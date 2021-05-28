import java.util.Locale;
import java.util.Scanner;

public class TrueFalse extends Question {

    public TrueFalse(String aQuestion, String aCorrectAnswer){
        super(aQuestion, aCorrectAnswer);
    }

    public void askQuestion(){

        String stuff = "";

        Scanner input;
        input = new Scanner(System.in);
        System.out.println(this.getQuestion() + "\n Type True or False");
        stuff = input.next();
        stuff = stuff.toLowerCase();

        setAnswer(stuff);

    }
}

