import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BookReport { 
    public static void main(String[] args) { 
        HashMap<String, Book> booksMap = new HashMap<>(); 
        BookDA bookDA = new BookDA(); 
        
        // Read data from Book.csv 
        try (BufferedReader reader = new BufferedReader(new FileReader("Book.csv"))) { 
            String line; 
            while ((line = reader.readLine()) != null) { 
                String[] data = line.split(","); 
                String isbn = data[0].trim(); 
                String title = data[1].trim(); 
                String authorName = data[2].trim(); 
                
                // Create book object 
                Book book = new Book(isbn, title); 
                book.setAuthor(authorName); // Set author and bio 
                
                bookDA.create(book); 
                booksMap.put(isbn, book); 
            } 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
        
        // Display the report 
        for (String isbn : booksMap.keySet()) { 
            Book book = booksMap.get(isbn); 
            System.out.println(book.getIsbn() + " " + book.getTitle()); 
            System.out.println("\t" + book.getAuthor().getName() + " - " + book.getAuthor().getBio()); 
        } 
    } 
} 