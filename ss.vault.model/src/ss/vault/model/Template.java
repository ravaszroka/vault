package ss.vault.model;

import java.util.List;

public class Template {
	private String name;
	private List<FieldDefinition> fields;
	
	Template(String name) {
		this.name = name;
	}
	
	void addField(String name, IFieldValidator validator) {
		fields.add(new FieldDefinition(name, validator));
	}
}
