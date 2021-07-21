package SpringSet;
import java.util.Set;

public class Question {
    int questionId;
    String question;
    Set<String> answers;

    public int getQuestionId() { return questionId; }
    public void setQuestionId(int questionId) { this.questionId = questionId; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public Set<String> getAnswers() { return answers; }
    public void setAnswers(Set<String> answers) { this.answers = answers; }

    public void print() {
        System.out.println("using Sets");
        System.out.println("Question ID is :"+this.getQuestionId());
        System.out.println("Question is :"+this.getQuestion());
        System.out.println("Answers are :");
        System.out.println(answers);
    }

}
