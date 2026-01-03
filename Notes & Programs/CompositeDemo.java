
// Component interface
interface FileSystemComponent {
    void showDetails();
}

// Leaf node
class File implements FileSystemComponent {
	private String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public void showDetails() {
		System.out.println("File: " + name);
	}
}

// Composite node
import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemComponent {
	private String name;
	private List<FileSystemComponent> children = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	public void add(FileSystemComponent component) {
		children.add(component);
	}

	@Override
	public void showDetails() {
		System.out.println("Folder: " + name);
		for (FileSystemComponent child : children) {
			child.showDetails();
		}
	}
}

// Usage
public class CompositeDemo {
	public static void main(String[] args) {
		File file1 = new File("Resume.docx");
		File file2 = new File("Photo.jpg");

		Folder folder = new Folder("My Documents");
		folder.add(file1);
		folder.add(file2);

		folder.showDetails();
	}
}
