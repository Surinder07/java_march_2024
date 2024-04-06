package april6;


public class Book {
    String nameOfBook;
    String authorName;
    int publicationYear;
    String genre;

    Book(){

    }

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public Book(String nameOfBook, String authorName) {
        this.nameOfBook = nameOfBook;
        this.authorName = "something";
    }

    public Book(String nameOfBook, String authorName, int publicationYear) {
        this.nameOfBook = nameOfBook;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public Book(String nameOfBook, String authorName, int publicationYear, String genre) {
        this.nameOfBook = nameOfBook;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    public void printBookDetails(){
        System.out.println("Welcome to My Lib.");
        System.out.println("Book             : " + nameOfBook);
        System.out.println("Author           : " + authorName);
        System.out.println("Genre            : " + genre);
        System.out.println("Publication year : " + publicationYear);

    }
}


/*

Create a Book class
1. author
2. Publication year
3. Genre
4. Name of book
5. price -- give a default price to the book
# create diff consts to pass
## create a method to print all the object values

Good to great
2023
Non fiction
Jim Collins
=================
Rich Dad poor Dad
Non fiction
Robert Kiyoski
2014

 */