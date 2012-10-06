package ss.vault.gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

import ss.vault.model.Chest;
import ss.vault.model.Item;
import ss.vault.model.Vault;

public class VaultApp extends JFrame {
	
	private Vault vault;
	private JTree tree;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VaultApp().setVisible(true);
			}
		});
	}
	
	VaultApp() {
		vault = Vault.getVault();
		
		initUI();
	}

	private void initUI() {
		setTitle("Vault");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initTree();
		getContentPane().add(new JScrollPane(tree));
	}
	
	private void initTree() {
		tree = new JTree(addNodes());
		tree.setRootVisible(false);
	}
	
	private DefaultMutableTreeNode addNodes() {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(vault);
		for (Chest chest: vault) {
			DefaultMutableTreeNode chestNode = new DefaultMutableTreeNode(chest);
			root.add(chestNode);
			for (Item item: chest) {
				addNodes(chestNode, item);
			}
		}
		return root;
	}

	private void addNodes(DefaultMutableTreeNode root, Item item) {
		
	}
	
	
}
