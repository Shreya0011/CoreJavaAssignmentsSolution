package Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashmapProblem<K, V> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Double> data = new HashMap<>();
		
		
		
		for(int i = 0; i < 10; i++) {
			Random random = new Random();
			double value = random.nextDouble();
			int key = random.nextInt();
			data.put(key, value);
		}
		
		for(int i : data.keySet()) {
			System.out.println(i + ":" + data.get(i));
		}

	}

}
