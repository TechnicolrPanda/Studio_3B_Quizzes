public class Quiz {

    public static void main(String[] args){

        Integer correct = 0;
        Integer total = 0;

        MultipleChoice color = new MultipleChoice("What color is the grass", "1");
        color.setOptions("0 - Blue", "1 - Green", "2 - Red", "3 - Purple");
        color.askQuestion();
        if(color.isCorrectAnswer()){
            correct++;
        }
        total++;


        MultipleChoice colorSky = new MultipleChoice("What color is the sky", "0");
        colorSky.setOptions("0 - Blue", "1 - Green", "2 - Red", "3 - Purple");
        colorSky.askQuestion();
        if(color.isCorrectAnswer()){
            correct++;
        }
        total++;

        TrueFalse colorDirt = new TrueFalse("Dirt is Purple", "false");
        colorDirt.askQuestion();
        if(colorDirt.isCorrectAnswer()){
            correct++;
        }
        total++;



    }
}
