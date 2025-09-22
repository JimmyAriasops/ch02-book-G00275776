/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Jimmy Arias
 * @version 9/22/25
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    private String getAuthor ()
    {
        return author;
    }
    
    private String getTitle()
    {
        return title;
    }
    
    private void printAuthor()
    {
        System.out.println(author);
        System.out.println();
    }
    
    private  void printTitle()
    {
        System.out.println(title);
    }
    
}
