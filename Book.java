public class Book
{
    String name;
    String author;
    String isbn;

    public void setBook(String name,String author,String isbn ) 
    {
        this.name = name;
	this.author=author;
	this.isbn=isbn;
    }

    public String getName()
    {
        return name;
    }
  public String getAuthor()
    {
        return author;
}
  public String getIsbn()
    {
        return isbn;
}

    public static void main(String args[]) {
	Book b = new Book();

        b.setBook("Java","R Nageswara","123-456-789");


        System.out.println("Book Name:"+b.getName()+" Author:"+b.getAuthor() +"Isbn:" +b.getIsbn());
    }
}