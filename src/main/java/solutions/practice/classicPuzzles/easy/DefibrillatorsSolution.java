/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import common.ISolution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DefibrillatorsSolution implements ISolution {

	public static class Defibrillator {
		private final String address;
		private final int identifier;
		private final String name;
		private final Point point;
		private final String phone;

		public Defibrillator(final int identifier, final String nom, final String adresse, final String telephone,
							 final Point point) {
			this.identifier = identifier;
			this.name = nom;
			this.address = adresse;
			this.phone = telephone;
			this.point = point;
		}

		public String getAddress() {
			return address;
		}

		public int getIdentifier() {
			return identifier;
		}

		public String getName() {
			return name;
		}

		public Point getPoint() {
			return point;
		}

		public String getPhone() {
			return phone;
		}
	}

	public static class Point {
		private final double latitude;
		private final double longitude;

		public Point(final String longitude, final String latitude) {
			this.longitude = Double.parseDouble(longitude.replace(",", "."));
			this.latitude = Double.parseDouble(latitude.replace(",", "."));
		}

		public double getLatitude() {
			return latitude;
		}

		public double getLongitude() {
			return longitude;
		}
	}

	/**
	 * 1;Maison de la Prevention Sante;6 rue Maguelone 340000
	 * Montpellier;;3,87952263361082;43,6071285339217
	 */
	public static Defibrillator buildDefFromString(final String str) {
		final String sep = ";";
		final String[] split = str.split(sep);
		final int identifier = Integer.parseInt(split[0]);
		final String nom = split[1];
		final String address = split[2];
		final String phone = split[3];
		final String longitude = split[4];
		final String latitude = split[5];
		return new Defibrillator(identifier, nom, address, phone, new Point(longitude, latitude));
	}

	public static double computeDistance(final Point a, final Point b) {
		final double x_1 = b.getLongitude() - a.getLongitude();
		final double x_2 = Math.cos((a.getLatitude() + b.getLatitude()) / 2);
		final double x = x_1 * x_2;

		final double y = b.getLatitude() - a.getLatitude();

		final double x_square = Math.pow(x, 2);
		final double y_square = Math.pow(y, 2);

		return Math.sqrt(x_square + y_square) * 6371;
	}

	@Override
	public String solve(final Scanner input) {
		final String LON = input.next();
		final String LAT = input.next();

		final Point user = new Point(LON, LAT);
		final int N = input.nextInt();

		final List<Defibrillator> defibrillateurs = new ArrayList<>();
		if (input.hasNextLine()) {
			input.nextLine();
		}
		for (int i = 0; i < N; i++) {
			final String DEFIB = input.nextLine();
			defibrillateurs.add(buildDefFromString(DEFIB));
		}

		final Map<Double, String> map = new HashMap<>();
		defibrillateurs.parallelStream().forEach(a -> map.put(computeDistance(user, a.getPoint()), a.getName()));
		final Comparator<? super Double> comparator = (a, b) -> a.compareTo(b);
		final List<Double> collect = map.keySet().parallelStream().sorted(comparator).collect(Collectors.toList());

		return map.get(collect.get(0));
	}

}
