package Test;

import java.util.ArrayList;

public class Museum {
	private Showpiece showpiece;
	private Art art;
	private HistoricalArtifacts historicalArtifacts;
	private Employees employee;

	/**
	 * Create constructor.
	 * 
	 * @param showpiece
	 * @param art
	 * @param historicalArtifacts
	 */
	public Museum(Showpiece showpiece, Art art,
			HistoricalArtifacts historicalArtifacts, Employees employee) {
		super();
		this.showpiece = showpiece;
		this.art = art;
		this.historicalArtifacts = historicalArtifacts;

	}

	/**
	 * Equals method.
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
		Museum other = (Museum) obj;
		if (art == null) {
			if (other.art != null)
				return false;
		} else if (!art.equals(other.art))
			return false;
		if (historicalArtifacts == null) {
			if (other.historicalArtifacts != null)
				return false;
		} else if (!historicalArtifacts.equals(other.historicalArtifacts))
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
		return "Showpiece:" + showpiece + ", Art:" + art
				+ ", HistoricalArtifacts=" + historicalArtifacts;
	}

}
