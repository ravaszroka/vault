package ss.vault.model;

public class FieldDefinition {
	private String name;
	private IFieldValidator validator;
	
	FieldDefinition(String name, IFieldValidator validator) {
		this.name = name;
		this.validator = validator;
	}
}
