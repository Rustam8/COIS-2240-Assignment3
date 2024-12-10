public class Book {
    private int id;
    private String title;
    private boolean available;

    public Book(int id, String title) throws Exception {
    	isValidId(id);
        this.id = id;
        this.title = title;
        this.available = true;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (available) {
            available = false;
        }
    }

    // Method to return the book
    public boolean returnBook() {
        available = true;
        return available;
    }

    // Method to check if a book id is valid
    public boolean isValidId(int id) {
        return id >= 100 && id <= 999;
    }
}