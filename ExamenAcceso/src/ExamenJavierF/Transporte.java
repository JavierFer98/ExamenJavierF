package ExamenJavierF;

public class Transporte {
	private String  label, nameA, nameB;

	public Transporte(String label, String nameA, String nameB) {
		super();
		this.label = label;
		this.nameA = nameA;
		this.nameB = nameB;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getNameA() {
		return nameA;
	}

	public void setNameA(String nameA) {
		this.nameA = nameA;
	}

	public String getNameB() {
		return nameB;
	}

	public void setNameB(String nameB) {
		this.nameB = nameB;
	}
		
}
