package Test;

import java.util.ArrayList;

public class Showpiece implements Comparable<Showpiece> {
	private ArrayList<String> showpiece = new ArrayList<>();
	private int Id;
	private String name;
	private String description;

	/**
	 * Create constructor
	 * 
	 * @param Id
	 * @param name
	 * @param showpiece
	 * @param description
	 */
	public Showpiece(int Id, String name, String description) {
		super();
		this.Id = Id;
		this.name = name;
		this.description = description;
	}

	/**
	 * Equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Showpiece other = (Showpiece) obj;
		if (Id != other.Id) {
			return false;
		}
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (showpiece == null) {
			if (other.showpiece != null)
				return false;
		} else if (!showpiece.equals(other.showpiece))
			return false;
		return true;
	}

	/**
	 * To string method.
	 */
	@Override
	public String toString() {
		return "Showpiece:" + showpiece + "ID,:" + Id + ", Name:" + name
				+ ", Description:" + description;
	}

	/**
	 * Sort by name, use compareTo.
	 */
	@Override
	public int compareTo(Showpiece showpiece) {
		return showpiece.compareTo(showpiece);
	}

}
