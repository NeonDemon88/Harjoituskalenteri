package projekti.harkkakalenteri.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Harkka {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nimi;
	private String pvm;
	private String aika;
	private String paikka;
	private String nuotit;


	public Harkka() {}

	public Harkka(String nimi, String pvm, String aika, String paikka, String nuotit) {
		super();
		this.nimi = nimi;
		this.pvm = pvm;
		this.aika = aika;
		this.paikka = paikka;
		this.nuotit = nuotit;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getPvm() {
		return pvm;
	}

	public void setPvm(String pvm) {
		this.pvm = pvm;
	}

	public String getAika() {
		return aika;
	}

	public void setAika(String aika) {
		this.aika = aika;
	}

	public String getPaikka() {
		return paikka;
	}

	public void setPaikka(String paikka) {
		this.paikka = paikka;
	}

	public String getNuotit() {
		return nuotit;
	}

	public void setNuotit(String nuotit) {
		this.nuotit = nuotit;
	}

	@Override
	public String toString() {
		return "Harkka [id=" + id + ", nimi=" + nimi + ", pvm=" + pvm
				+ ", aika=" + aika + ", paikka=" + paikka + ", nuotit="
				+ nuotit + "]";
	}

}
