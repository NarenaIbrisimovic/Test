package Test;

public class HistoricalArtifacts {
	private String historicalArtifacts;
	private String origin;
	private static final int PERIOD_OF_ORIGIN_RENAISSANCE_NEOCLASSIC = 1;
	private static final int PERIOD_OF_ORIGIN_MIDDLE_AGES = 2;
	private static final int PERIOD_OF_ORIGIN_MODERN_AGES = 3;

	public HistoricalArtifacts(String historicalArtifacts, String origin) {
		super();
		this.historicalArtifacts = historicalArtifacts;
		this.origin = origin;
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
		HistoricalArtifacts other = (HistoricalArtifacts) obj;
		if (historicalArtifacts == null) {
			if (other.historicalArtifacts != null)
				return false;
		} else if (!historicalArtifacts.equals(other.historicalArtifacts))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

	/**
	 * To string method.
	 */
	@Override
	public String toString() {
		return "HistoricalArtifacts:" + historicalArtifacts + ", origin:"
				+ origin;
	}

}
