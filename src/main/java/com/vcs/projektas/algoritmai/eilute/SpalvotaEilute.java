package com.vcs.projektas.algoritmai.eilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpalvotaEilute {

	private List<Spalva> eilute = new ArrayList<>();

	public List<Spalva> getEilute() {
		return eilute;
	}

	public SpalvotaEilute(Spalva... spalvos) {
		eilute.addAll(Arrays.asList(spalvos));
	}

	public boolean isUsing(Spalva sp) {

		for (Spalva spalva : eilute) {
			if (spalva.equals(sp)) {
				return true;
			}
		}

		return false;

	}

	public boolean isNotUsing(Spalva sp) {
		return !isUsing(sp);
	}
}
