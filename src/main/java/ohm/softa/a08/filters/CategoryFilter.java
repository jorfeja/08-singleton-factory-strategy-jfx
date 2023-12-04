package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

public class CategoryFilter extends FilterBase {

	private String name;

	public CategoryFilter(String name, boolean invert) {
		super(invert);
		this.name = name;
	}

	@Override
	public boolean include(Meal m) {
		return false;
	}
}
