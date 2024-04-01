import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Book { 
    private String isbn; 
    private String title; 
    private Author author; 
    
    public Book(String isbn, String title) { 
        this.isbn = isbn; 
        this.title = title; 
    } 
    
    public String getIsbn() { 
        return isbn; 
    } 
    
    public String getTitle() { 
        return title; 
    } 
    
    public Author getAuthor() { 
        return author; 
    } 
    
    public void setAuthor(String authorName) { 
        AuthorDA authorDA = new AuthorDA(); 
        
        // Create author object with bio 
        Author author = authorDA.create(authorName); 
        this.author = author; 
    } 
    
    // Method to set author's bio 
    public void setAuthorBio(String bio) { 
        this.author.setBio(bio); 
    } 
} 