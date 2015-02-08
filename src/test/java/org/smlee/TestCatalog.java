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
	public void ��Ʈ��_���翩��Ȯ��() {
		assertTrue( catalog.contains(entry) );
	}

	@Test
	public void fish��key����_�̹������ϸ�_missingName_�����Ͽ�_null�ΰ���Ȯ����() {
		assertEquals( entry, catalog.entryFor("fish" ));
		assertNull( catalog.entryFor("missing name"));
	}
	
	@Test( expected=IllegalArgumentException.class )
	public void ������key�����Ͽ����ܹ߻�() {
		catalog.add( new Entry("fish", "chips"));
		catalog.add( new Entry("fish", "peas"));
	}
	
}
