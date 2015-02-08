package org.smlee;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Catalog {

	List<Entry> listEntry = null;
	
	public Catalog() {
		listEntry = new LinkedList<Entry>();
	}
	
	public void add(Entry entry) {
		
		Entry tray = entryFor( entry.getKey() );
		if( null == tray ) {
			listEntry.add( entry );
		}else {
			throw new IllegalArgumentException("Already Exists !!");
		}
	}

	public boolean contains(Entry entry) {
		return listEntry.contains(entry);
	}

	public Entry entryFor(String str1) {
		Iterator<Entry> iter = listEntry.iterator();
		while( iter.hasNext() ) {
			Entry e = iter.next();
			
			if( e.getKey().equals( str1 ) ) {
				return e;
			}
		}
		
		return null;
	}

}
