package puntoCinco;

public class Student {

	public String name = "Lisa Palomo";
	public int Documento = 123456789;
	public String status = "Active";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Documento;
	}

	public void setId(int id) {
		Documento = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}