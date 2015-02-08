package org.smlee;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matcher;
import org.hamcrest.core.StringContains;
import org.junit.Test;


public class TestFull {

	@Test
	public void test() {
		
		String s = "yes we have no bananas today";
		
		Matcher<String> containsBananas = new StringContains("bananas");
		Matcher<String> containsMangoes = new StringContains("mangoes");
		
		assertTrue( containsBananas.matches(s) );
		assertFalse( containsMangoes.matches(s) );
		
		assertThat(s, containsString("bananas"));
		assertThat(s, not( containsString("mangoes") ));
		
	}

	private Matcher<? super String> containsString(String str ) {
		return new StringContains( str );
	}

}
