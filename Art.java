package Test;

public class Art {
	private String art;
	private String nameOfAuthor;
	private int year;
	private static final int PERIOD_OF_ART_RENAISSANCE = 1;
	private static final int PERIOD_OF_ART_RENAISSANCE_NEOCLASSIC = 2;
	private static final int PERIOD_OF_ART_MODERN_ART = 3;
	private static final int PERIOD_OF_ART_CONTEMPORARY_ART = 4;

	/**
	 * Create constructor
	 * 
	 * @param art
	 * @param nameOfAuthor
	 * @param year
	 */
	public Art(String art, String nameOfAuthor, int year) {
		super();
		this.art = art;
		this.nameOfAuthor = nameOfAuthor;
		this.year = year;
	}

	/**
	 * Equals methods.
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
		Art other = (Art) obj;
		if (art == null) {
			if (other.art != null)
				return false;
		} else if (!art.equals(other.art))
			return false;
		if (nameOfAuthor == null) {
			if (other.nameOfAuthor != null)
				return false;
		} else if (!nameOfAuthor.equals(other.nameOfAuthor))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	/**
	 * To string method.
	 */
	@Override
	public String toString() {
		return "Art" + art + ", Name of author:" + nameOfAuthor + ", year:"
				+ year;
	}

}
