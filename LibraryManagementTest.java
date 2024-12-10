import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryManagementTest {

	@Test
	public void testBookId() throws Exception {
		//fail("Not yet implemented");
		Book book1 = new Book(150, "BookOne");
		Book book2 = new Book(99, "BookTwo");
		Book book3 = new Book(1000, "BookThree");
		assertTrue(book1.isValidId(book1.getId()));
		assertFalse(book2.isValidId(book2.getId()));
		assertFalse(book3.isValidId(book3.getId()));
	}

}
