package nuisance;

public class Insect {
	private String species;

	/**
	 * @param species
	 */
	public Insect(String species) {
		this.species = species;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": "+ species;
	}
	

}
