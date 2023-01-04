public class Book {
    private String title;
    private String author;
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
}