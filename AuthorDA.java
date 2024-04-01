import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AuthorDA {
    public Author create(String authorName) {
        // Logic to create author in database 
        // For simplicity, just returning a new Author object based on the given name 
        return new Author(authorName, "No bio available"); 
    } 
}