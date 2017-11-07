package projekti.harkkakalenteri.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rehearsal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String date;
	private String time;
	private String place;
	private String notes;


	public Rehearsal() {}

	public Rehearsal(String name, String date, String time, String place, String notes) {
		super();
		this.name = name;
		this.date = date;
		this.time = time;
		this.place = place;
		this.notes = notes;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Rehearsal [id=" + id + ", name=" + name + ", date=" + date
				+ ", time=" + time + ", place=" + place + ", notes=" + notes
				+ "]";
	}

	

}
