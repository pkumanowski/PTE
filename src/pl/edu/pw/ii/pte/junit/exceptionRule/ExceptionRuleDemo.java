package pl.edu.pw.ii.pte.junit.exceptionRule;

import java.util.*;
//import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionRuleDemo {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {

		List<Object> list = new ArrayList<Object>();

		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");

		list.get(0); // wykonanie nie przekroczy tej linii
	}

}
