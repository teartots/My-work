package nuisance;
import java.util.List;;

public class ButterFly extends Insect {
	private List<String> colors;

	public ButterFly(String species, List<String> colors) {
		super(species);
		this.colors = colors;
		// TODO Auto-generated constructor stub
	}
	public ButterFly(ButterFly butterfly) {
		super(butterfly.getSpecies());
		this.colors = butterfly.colors;
	}
	/**
	 * @return the colors
	 */
	public List<String> getColors() {
		return colors;
	}
	@Override
	public String toString() {
	 if(colors.size() < 0) {
		 return super.getSpecies() + "[]";
	 }
	 else return super.getSpecies() + " " + colors;
	}
	

}
