import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Author { 
    private String name; 
    private String bio; 
    
    public Author(String name, String bio) { 
        this.name = name; 
        this.bio = bio; 
    } 
    
    public String getName() { 
        return name; 
    } 
    
    public String getBio() { 
        return bio; 
    } 
    
    public void setBio(String bio) { 
        this.bio = bio; 
    } 
} 