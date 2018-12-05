	package main.java.edu.ucsb.cs56.pconrad.springboot.bean;

	import java.util.Objects;


	public class Event {
	private String name;
	private String location;
	private String date;

	public Event() {}

	public Event(String name, String location, String date) {
		this.name = name;
		this.location = location;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getDate() {
		return date;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash * Objects.hashCode(name);
		hash = 29 * hash * Objects.hashCode(location);
		hash = 29 * hash * Objects.hashCode(date);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}

		if(obj == null) {
			return false;
		}

		if(getClass() != obj.getClass()) {
			return false;
		}

		final Event other = (Event) obj;

		return (name == other.name && location == other.location && date == other.date);
	}

	@Override
	public String toString() {
		return "Name: " + name + " at " + location + " on " + date;
	}
}
