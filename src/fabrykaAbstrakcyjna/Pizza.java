package fabrykaAbstrakcyjna;

public class Pizza {

	protected String nazwa;
	protected Ciasto ciasto;
	protected Sos sos;
	protected Warzywa dodatki;
	protected Ser ser;
	
	
	
	public void przygotowanie() {
		System.out.println("Przygotowanie pizzy " + nazwa);
	}
	public void pieczenie() {
		System.out.println("Pieczenie pizzy");
	}
	public void krojenie() {
		System.out.println("Krojenie pizzy");
	}
	public void pakowanie() {
		System.out.println("Pakowanie pizzy");
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public Ciasto getCiasto() {
		return ciasto;
	}
	public void setCiasto(Ciasto ciasto) {
		this.ciasto = ciasto;
	}
	public Sos getSos() {
		return sos;
	}
	public void setSos(Sos sos) {
		this.sos = sos;
	}
	public Warzywa getDodatki() {
		return dodatki;
	}
	public void setDodatki(Warzywa dodatki) {
		this.dodatki = dodatki;
	}
	@Override
	public String toString() {
		return "Pizza [nazwa=" + nazwa + ", ciasto=" + ciasto + ", sos=" + sos + ", dodatki=" + dodatki + "]";
	}
	
	
	
}
