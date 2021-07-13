import java.util.function.Function;

public class News {
    private int newsId;
    private String postedByUser;
    private String commenByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commenByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commenByUser = commenByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommenByUser() {
        return commenByUser;
    }

    public void setCommenByUser(String commenByUser) {
        this.commenByUser = commenByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
