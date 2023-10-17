/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.sponsored;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import common.ISolution;

public class TheGreatDispatchSolution implements ISolution{

	public static class Box {

		public float weight;
		public float volume;
		public Truck truck;

		public Box(float weight, float volume, Truck truck) {
			this.weight = weight;
			this.volume = volume;
			this.truck = truck;
		}
		
		public Box(float weight, float volume) {
			this.weight = weight;
			this.volume = volume; 
		}
		
		public void addTruck(Truck truck) {
			this.truck=truck;
		}

	}

	public static class Truck {

		public int number;
		public static final float MAX_VOLUME = 100;
		public float weight;
		public float volume;

		public Truck(int number) {
			this.number = number;
		}

		public float getWeight() {
			return this.weight;
		}
	}

	@Override
	public String solve(final Scanner in) {
		List<Box> boxes = new ArrayList<>();
		List<Truck> trucks = new ArrayList<>();

		final int boxCount = in.nextInt();
		in.nextLine();
		for (int i = 0; i < 100; i++) {
			String line = in.nextLine();
			String[] split = line.split(" ");
			float weight = Float.parseFloat(split[0]);
			float volume = Float.parseFloat(split[1]);
			Truck truck = new Truck(i);
			Box box = new Box(weight, volume, truck);
			truck.weight += weight;
			truck.volume += volume;
			trucks.add(truck);
			boxes.add(box);
		}

		for (int i = 0; i < boxCount - 100; i++) {
			String line = in.nextLine();
			String[] split = line.split(" ");
			float weight = Float.parseFloat(split[0]);
			float volume = Float.parseFloat(split[1]);

			List<Truck> localList = new ArrayList<>(trucks);
			Truck min = localList.stream().min(Comparator.comparing(v -> v.getWeight())).get();
			while (min.volume > Truck.MAX_VOLUME || min.volume + volume >= Truck.MAX_VOLUME) {
				localList.remove(min);
				min = localList.stream().min(Comparator.comparing(v -> v.getWeight())).get();
			}
			min.weight += weight;
			min.volume += volume;
			Box box = new Box(weight, volume, min);
			boxes.add(box);
		}

		StringBuilder builder = new StringBuilder();
		for (Box b : boxes) {
			builder.append(b.truck.number + " ");
		}
		String string = builder.toString();
		System.out.println(string);
		return string;

	}

}
