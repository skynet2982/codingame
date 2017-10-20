package defibrillateurs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

	public static class Defibrillateur {
		private final int identifiant;
		private final String nom;
		private final String adresse;
		private final String telephone;
		private final Point point;

		public Defibrillateur(final int identifiant, final String nom, final String adresse, final String telephone,
				final Point point) {
			this.identifiant = identifiant;
			this.nom = nom;
			this.adresse = adresse;
			this.telephone = telephone;
			this.point = point;
		}

		public int getIdentifiant() {
			return identifiant;
		}

		public String getNom() {
			return nom;
		}

		public String getAdresse() {
			return adresse;
		}

		public String getTelephone() {
			return telephone;
		}

		public Point getPoint() {
			return point;
		}
	}

	public static class Point {
		private final double longitude;
		private final double latitude;

		public double getLongitude() {
			return longitude;
		}

		public double getLatitude() {
			return latitude;
		}

		public Point(final String longitude, final String latitude) {
			this.longitude = Double.parseDouble(longitude.replace(",", "."));
			this.latitude = Double.parseDouble(latitude.replace(",", "."));
		}
	}

	/**
	 * 1;Maison de la Prevention Sante;6 rue Maguelone 340000
	 * Montpellier;;3,87952263361082;43,6071285339217
	 */
	public static Defibrillateur buildDefFromString(final String str) {
		final String sep = ";";
		final String[] split = str.split(sep);
		int identifiant = Integer.parseInt(split[0]);
		String nom = split[1];
		String adresse = split[2];
		String telephone = split[3];
		String longitude = split[4];
		String latitude = split[5];
		return new Defibrillateur(identifiant, nom, adresse, telephone, new Point(longitude, latitude));
	}

	public static double computeDistance(final Point a, final Point b) {
		double x_1 = b.getLongitude() - a.getLongitude();
		double x_2 = Math.cos((a.getLatitude() + b.getLatitude()) / 2);
		double x = x_1 * x_2;

		double y = b.getLatitude() - a.getLatitude();

		double x_square = Math.pow(x, 2);
		double y_square = Math.pow(y, 2);

		return Math.sqrt(x_square + y_square) * 6371;
	}

	public static String sol(final Scanner input) {
		String LON = input.next();
		String LAT = input.next();

		final Point user = new Point(LON, LAT);
		int N = input.nextInt();

		List<Defibrillateur> defibrillateurs = new ArrayList<>();
		if (input.hasNextLine()) {
			input.nextLine();
		}
		for (int i = 0; i < N; i++) {
			String DEFIB = input.nextLine();
			defibrillateurs.add(buildDefFromString(DEFIB));
		}

		Map<Double, String> map = new HashMap<>();
		defibrillateurs.parallelStream().forEach(a -> map.put(computeDistance(user, a.getPoint()), a.getNom()));
		Comparator<? super Double> comparator = (a, b) -> a.compareTo(b);
		List<Double> collect = map.keySet().parallelStream().sorted(comparator).collect(Collectors.toList());

		return map.get(collect.get(0));
	}

}
