interface Document {
	void open();
}

class WordDocument implements Document {
	public void open() {
		System.out.println("Opening Word Document...");
	}
}

class PdfDocument implements Document {
	public void open() {
		System.out.println("Opening PDF Document...");
	}
}

class ExcelDocument implements Document {
	public void open() {
		System.out.println("Opening Excel Document...");
	}
}

class DocumentFactory {
	public static Document getDocument(String type) {
		if (type.equalsIgnoreCase("word")) {
			return new WordDocument();
		} else if (type.equalsIgnoreCase("pdf")) {
			return new PdfDocument();
		} else if (type.equalsIgnoreCase("excel")) {
			return new ExcelDocument();
		}
		throw new IllegalArgumentException("Unknown document type: " + type);
	}
}

public class DocumentFactoryDemo {
	public static void main(String[] args) {
		Document doc1 = DocumentFactory.getDocument("word");
		doc1.open();

		Document doc2 = DocumentFactory.getDocument("pdf");
		doc2.open();

		Document doc3 = DocumentFactory.getDocument("excel");
		doc3.open();
	}
}
