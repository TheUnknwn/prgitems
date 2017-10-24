package eu.nsjg.programmingitems.simple;

import java.util.List;

public class Select implements SimpleProgrammingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		if(divider == 0) {
			throw new IllegalArgumentException("Szedd már össze magad PLS (0-val osztasz? biztos vagy benne?)");
		}
			int i = 0;
		while (numbers.get(i) % divider != 0)
			i++;
		return i;
	}

}
