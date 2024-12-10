import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Member> members = new ArrayList<Member>();
    private List<Book> books = new ArrayList<Book>();

    // Add a new member to the library
    public boolean addMember(Member member) {
    	for (Member m : members) {
            if (m.getId() == member.getId()) {
            	System.out.println("A member with that ID already exists in the library.");
                return false;
            }
        }
    	members.add(member);
    	return true;
    }
    
    // Add a new book to the library
    public boolean addBook(Book book) {
    	for (Book b : books) {
            if (b.getId() == book.getId()) {
            	System.out.println("A book with that ID already exists in the library.");
                return false;
            }
        }
    	books.add(book);
    	return true;
    }

    // Find a member by ID
    public Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    // Find a book by ID
    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // Get the list of members
    public List<Member> getMembers() {
        return members;
    }
    
    // Get the list of books
    public List<Book> getBooks() {
        return books;
    }
}
