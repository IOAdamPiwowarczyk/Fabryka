package metodaFabrykujaca;

public class Pizza {

	protected String nazwa;
	protected String ciasto;
	protected String sos;
	protected String dodatki;
	
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
	public String getCiasto() {
		return ciasto;
	}
	public void setCiasto(String ciasto) {
		this.ciasto = ciasto;
	}
	public String getSos() {
		return sos;
	}
	public void setSos(String sos) {
		this.sos = sos;
	}
	public String getDodatki() {
		return dodatki;
	}
	public void setDodatki(String dodatki) {
		this.dodatki = dodatki;
	}
	@Override
	public String toString() {
		return "Pizza [nazwa=" + nazwa + ", ciasto=" + ciasto + ", sos=" + sos + ", dodatki=" + dodatki + "]";
	}
	
	
	
}
