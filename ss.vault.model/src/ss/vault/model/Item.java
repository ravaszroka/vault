package ss.vault.model;

public abstract class Item implements Comparable<Item> {
	private String name;
	private Template template;
	
	Item(String name, Template template) {
		this.name = name;
		this.template = template;
	}
	
	final String getName() {
		return name;
	}
	
	final Template getTemplate() {
		return template;
	}
	
	@Override
	public int compareTo(Item o) {
		return name.compareTo(o.getName());
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
