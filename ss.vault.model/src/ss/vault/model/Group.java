package ss.vault.model;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Group extends Item implements Iterable<Item> {
	private PriorityQueue<Item> items;
	
	Group(String name, Template template) {
		super(name, template);
	}
	
	public Group addGroup(String name) {
		return addGroup(name, getTemplate());
	}
	
	public Group addGroup(String name, Template template) {
		Group group = new Group(name, template);
		items.add(group);
		return group;
	}
	
	public Note addNote(String name) {
		return addNote(name, getTemplate());
	}
	
	public Note addNote(String name, Template template) {
		Note note = new Note(name, template);
		items.add(note);
		return note;
	}

	@Override
	public Iterator<Item> iterator() {
		return items.iterator();
	}
}
