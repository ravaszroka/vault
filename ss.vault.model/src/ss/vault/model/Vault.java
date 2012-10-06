package ss.vault.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Vault implements Iterable<Chest> {
	private static final Vault instance = new Vault();
	
	private Map<String, Template> templates;
	private List<Chest> chests;
	
	public static Vault getVault() {
		return new Vault();
	}
	
	Vault() {
		templates = new HashMap<String, Template>();
		chests = new ArrayList<>();
	}
	
	Template createTemplate(String name) throws VaultException {
		if (templates.containsKey(name)) {
			throw new VaultException("Template " + name + " exists already");
		}
		Template template = new Template(name);
		templates.put(name, template);
		return template;
	}

	@Override
	public Iterator<Chest> iterator() {
		return chests.iterator();
	}
	
//	Chest addChest(String name, String password) {
//		
//	}
}
