package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

import java.util.List;

public class NotesFilter extends FilterBase {

	private String needle;

	public NotesFilter(String needle, boolean invert) {
		super(invert);
		this.needle = needle;
	}

	@Override
	public boolean include(Meal m) {
		for (String s : m.getNotes())
			if (s.toLowerCase().contains(needle.toLowerCase()))
				return true;
		return false;
	}
}
