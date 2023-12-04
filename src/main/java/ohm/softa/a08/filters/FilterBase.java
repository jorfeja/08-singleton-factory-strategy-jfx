package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

import java.util.LinkedList;
import java.util.List;

public abstract class FilterBase implements MealsFilter {

	private boolean invert = false;

	public FilterBase(boolean invert) {
		this.invert = invert;
	}

	public List<Meal> filter(List<Meal> in) {
		LinkedList<Meal> newList = new LinkedList<>();
		for (Meal m : in) {
			if (!invert && include(m)) {
				newList.add(m);
			} else if (invert && !include(m)) {
				newList.add(m);
			}
		}
		return newList;
	}

	public abstract boolean include(Meal m);
}
