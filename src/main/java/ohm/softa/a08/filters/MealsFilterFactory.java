package ohm.softa.a08.filters;

public class MealsFilterFactory {

	public static MealsFilter getStrategy(String strat) {
		switch(strat) {
			case "Vegetarian":
				return new CategoryFilter("Vegetarisch", false);
			default: return new NoFilter(false);

		}
	}
}
