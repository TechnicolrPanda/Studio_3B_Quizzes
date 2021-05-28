import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    public MultipleChoice(String aQuestion, String aCorrectAnswer){
        super(aQuestion, aCorrectAnswer);
    }

    private ArrayList<String> options = new ArrayList<>();

    public void setOptions(String optionA, String optionB, String optionC, String optionD ){
        this.options.add(optionA);
        this.options.add(optionB);
        this.options.add(optionC);
        this.options.add(optionD);
    }

    public String printOptions(){
        String a = "";
        for(String option : options) {
            a = a + "\n" + option;
        }
        return a;
    }

    public void askQuestion(){

        String stuff = "";

        Scanner input;
        input = new Scanner(System.in);
        System.out.println(this.getQuestion() + this.printOptions());
        stuff = input.next();

        setAnswer(stuff);

    }
}
