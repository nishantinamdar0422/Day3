package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book {
    private String BookTitle;
    private float BookPrice;

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookPrice(float bookPrice) {
        BookPrice = bookPrice;
    }

    public float getBookPrice() {
        return BookPrice;
    }
}
class MainClass
{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter no of books: ");
            int n = Integer.parseInt(br.readLine());
            Book books[] = createBook(n);
            displayBooks(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayBooks(Book[] books) {
       // System.out.println("-----------------------------------------------");
        System.out.println("Book Title\t\t\tBook Price");
        //System.out.println("-----------------------------------------------");

        for(Book b:books)
        {
            System.out.println(b.getBookTitle()+"\t\t\t"+b.getBookPrice());
        }
    }

    public static Book[] createBook(int n) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Book[] book = new Book[n];
        for(int i=0;i<n;i++)
        {
            Book b = new Book();
            try {
                System.out.println("Enter Book Name: ");
                String t = br.readLine();
                b.setBookTitle(t);
                System.out.println("Enter Book Price: ");
                float p = Float.parseFloat(br.readLine());
                b.setBookPrice(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
            book[i] = b;
        }
        return book;
    }
}
