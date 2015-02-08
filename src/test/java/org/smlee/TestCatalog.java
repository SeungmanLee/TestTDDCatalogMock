package org.smlee;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCatalog {

	private final Catalog catalog = new Catalog(); 
	private final Entry entry = new Entry("fish", "chips");
	
	@Before
	public void fillTheCatalog() {
		catalog.add(entry);
	}
	
	
	@Test
	public void 엔트리_존재여부확인() {
		assertTrue( catalog.contains(entry) );
	}

	@Test
	public void fish의key값이_이미존재하며_missingName_에대하여_null인것을확인함() {
		assertEquals( entry, catalog.entryFor("fish" ));
		assertNull( catalog.entryFor("missing name"));
	}
	
	@Test( expected=IllegalArgumentException.class )
	public void 동일한key에대하여예외발생() {
		catalog.add( new Entry("fish", "chips"));
		catalog.add( new Entry("fish", "peas"));
	}
	
}
