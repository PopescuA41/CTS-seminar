package ase.acs.ro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ro.ase.acs.classes.Car;

public class Main {
	public static <T> boolean compara(T x, T y) {
		return x.equals(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compara(4, 5);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Integer i : list) {
			i = 7;
			System.out.println(i);
		}

		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		Car c1 = new Car("Dacia", "Logan", 50, 1200);
		Car c2 = new Car("Dacia", "Duster", 60, 1600);
		Car c3 = new Car("Ford", "Puma", 70, 900);
		
		Set<Car> set = new TreeSet<>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		for(Car c:set) {
			System.out.println(c);
		}
		Map<Car, Integer> map = new HashMap<>();
		for(Car c : set) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				Integer value = map.get(c);
				map.put(c,  ++value);
			}
		}
		for(Map.Entry<Car, Integer> e : map.entrySet()) {
			System.out.print(e.getKey());
			System.out.print(" : ");
			System.out.println(e.getValue());
		}
	
	}
	

}
