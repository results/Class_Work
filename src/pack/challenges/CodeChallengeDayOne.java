package pack.challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class CodeChallengeDayOne {

	/*
	 * 	Given an ArrayList of distinct integers lst, and target_sum t,
		create a method that returns the ArrayList of indexes for 
		the pairs of integers in the ArrayList whose sum is equal to t.
		Expected time complexity: O(n)
		Expected space complexity: O(n)
		
		example:
		input: [5, 8, 3, 9, 0], 8
		output: [0, 2, 1, 4]
		
		input: [1, 8, 33, 6], 7
		output: [0, 3]
	 */
	static int target_sum;
	
	static ArrayList<Integer> input = new ArrayList<>();
	
	public static void main(String[] args) {
		input.add(5);
		input.add(8);
		input.add(3);
		input.add(9);
		input.add(0);
		target_sum = 8;
		System.out.println(solution2());
	}
			
	static ArrayList<Integer> solution2() {
		ArrayList<Integer> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < input.size(); i++) {
			if (map.containsKey(target_sum - input.get(i))) {//contains sum - current value (match)
				result.add(map.get(target_sum - input.get(i)));
				result.add(i);		
			}
			map.put(input.get(i), i);//put value in map with position (key=value,value=index)
		}
		return result;
	}
	
	static List<Entry<Integer, Integer>> solution() {
		Map<Integer, Integer> results = new HashMap<Integer, Integer>();
		IntStream.range(0,  input.size())
	    .forEach(i -> IntStream.range(0,  input.size()).filter(j -> i != j && input.get(i) + input.get(j) == target_sum).forEach(j -> {
	    	results.put(input.get(i), input.get(j));
	    })
	);
		return new ArrayList<>(results.entrySet());
	}


}
