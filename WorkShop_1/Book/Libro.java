package Book;
import java.util.Date;

public class Libro{
    private String title;
    private String autor;
    private boolean isBorrowed; 
    private Date publication;

    public Libro(String title, String autor, boolean isBorrowed, Date publication){
        this.title = title;
        this.autor = autor;
        this.isBorrowed = isBorrowed;
        this.publication = publication;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public Date getPublication(){
        return publication;
    }

    public void setPublication(Date publication){
        this.publication = publication;
    }

    public boolean getIsBorrowed(){
        return this.isBorrowed;
    }

    public void borrowed(){
        this.isBorrowed = !this.isBorrowed;
    }

}