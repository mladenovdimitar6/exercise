package exer;

public class book {
	
   private String bookName;
   private String author;
   private String publisher;
   private long isbn;

   public book() {
	   
      this.bookName = "";
      this.author = "";
      this.publisher = "";
      this.isbn = 0L;
   }

   public book(String bookName, String author, String publisher, long isbn) {
	   
      this.bookName = bookName;
      this.author = author;
      this.publisher = publisher;
      this.isbn = isbn;
   }

   String getBookName() {
	   
      return this.bookName;
   }

   String getAuthor() {
	   
      return this.author;
   }

   String publisherHouse() {
	   
      return this.publisher;
   }

   Long isbn() {
	   
      return this.isbn;
   }

   public String toString() {
	   
      return String.format("Book Name:%s \nAuthor:%s \nPublisher:%s \nIsbn:%d", this.bookName, this.author, this.publisher, this.isbn);
   }
}