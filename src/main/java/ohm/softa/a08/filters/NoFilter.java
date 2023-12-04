package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

public class NoFilter extends  FilterBase {
	public NoFilter(boolean invert) {
		super(invert);
	}

	@Override
	public boolean include(Meal m) {
		return false;
	}
}
