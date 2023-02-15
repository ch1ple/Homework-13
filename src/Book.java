import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationDate;

    public Book(String name, Author author, int publicationDate) {
        this.name = name;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }


    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        if (publicationDate < 0) {
            throw new IllegalArgumentException("Год публикации не может быть отрицательным");
        }
        this.publicationDate = publicationDate;
    }

    public String toString() {
        return "Название книги - " + name + ". Автор - " + author + ". Год публикации - " + publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationDate == book.publicationDate && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationDate);
    }
}