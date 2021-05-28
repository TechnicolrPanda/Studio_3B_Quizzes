public abstract class Question {

    private String question;

    private String answer;

    private String correctAnswer;

    public String getCorrectAnswer(){
        return correctAnswer;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question(String aQuestion, String aCorrectAnswer){
        question = aQuestion;
        correctAnswer = aCorrectAnswer;
    }

    public Boolean isCorrectAnswer(){
        Boolean right = answer.equals(correctAnswer);
        return right;
    }
}
