import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Constructor;

public class LibraryManagementTest {
	
	@Test
	public void testBookId() throws Exception {
		Book book1 = new Book(150, "BookOne");
		Book book2 = new Book(99, "BookTwo");
		Book book3 = new Book(1000, "BookThree");
		assertTrue(book1.isValidId(book1.getId()));
		assertFalse(book2.isValidId(book2.getId()));
		assertFalse(book3.isValidId(book3.getId()));
	}
	
	@Test
	public void testBorrowReturn() throws Exception {
		Book book = new Book(120, "Book");
		assertTrue(book.isAvailable());
		Member member = new Member(1, "Rustam");
		Transaction transaction = Transaction.getTransaction();
		
		book.borrowBook();
		member.borrowBook(book);
		assertFalse(book.isAvailable());
		
		book.borrowBook();
		member.borrowBook(book);
		assertFalse(book.isAvailable());
		
		book.returnBook();
		member.returnBook(book);
		assertTrue(book.isAvailable());
		
		book.returnBook();
		member.returnBook(book);
		assertTrue(book.isAvailable());
		
	}

	@Test
	public void testSingletonTransaction() throws Exception {
		Constructor<Transaction> constructor = Transaction.class.getDeclaredConstructor();
		int modifier = constructor.getModifiers();
		assertEquals(modifier, 2);
	}
}
