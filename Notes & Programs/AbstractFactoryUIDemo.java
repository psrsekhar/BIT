interface Button {
	void render();
}

interface Checkbox {
	void render();
}

// Windows family
class WindowsButton implements Button {
	public void render() {
		System.out.println("Rendering Windows Button");
	}
}

class WindowsCheckbox implements Checkbox {
	public void render() {
		System.out.println("Rendering Windows Checkbox");
	}
}

// Mac family
class MacButton implements Button {
	public void render() {
		System.out.println("Rendering Mac Button");
	}
}

class MacCheckbox implements Checkbox {
	public void render() {
		System.out.println("Rendering Mac Checkbox");
	}
}

interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}

class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}

	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}

class MacFactory implements GUIFactory {
	public Button createButton() {
		return new MacButton();
	}

	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}

public class AbstractFactoryUIDemo {
	public static void main(String[] args) {
		GUIFactory factory = new MacFactory();
		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();

		button.render();
		checkbox.render();
	}
}
