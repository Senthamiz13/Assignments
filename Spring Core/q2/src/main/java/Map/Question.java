package Map;
import java.util.Map;


public class Question {
    int questionId;
    String question;
    Map<Integer,String> answers;

    public int getQuestionId() { return questionId; }
    public void setQuestionId(int questionId) { this.questionId = questionId; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public Map<Integer,String> getAnswers() { return answers; }
    public void setAnswers(Map<Integer,String> answers) { this.answers = answers; }


    public void print() {
        System.out.println("using Maps");
        System.out.println("Question ID is :"+this.getQuestionId());
        System.out.println("Question is :"+this.getQuestion());
        System.out.println("Answers are :");
        System.out.println(answers);
    }

}
