package practice.classicPuzzleEasy.thereIsTheSpoonEp1;

import java.util.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Solution {

    
	static int width;
	static int height;

	public static class Case {
		int x;
		int y;
		boolean isNode;

		public Case(int x, int y, boolean isNode) {
			this.x = x;
			this.y = y;
			this.isNode = isNode;
		}
	}

	public static void compute(Case c, Case[][] grille) {

        if(c.isNode) {
            StringBuilder b = new StringBuilder();
    		b.append(c.x + " " + c.y);
    
    		if (c.x + 1 >= width || width == 1) {
    			b.append(" -1 -1");
    		} else {
    			
    			int i = 1;
    			boolean voisin = false;
    			while(c.x+i < width) {
    			    Case voisinDroite = grille[c.y][c.x+i];
        			if (voisinDroite.isNode) {
        				b.append(" " + voisinDroite.x + " " + voisinDroite.y);
        				voisin = true;
        				break;
        			}
        			i++;
    			}
    			if(!voisin) {
    			    b.append(" -1 -1");
    			}
    		}
    
    		if (c.y + 1 >= height || height == 1) {
    			b.append(" -1 -1");
    		} else {
    		    int i = 1;
    			boolean voisin = false;
    			while(c.y+i < height) {
        			Case voisinDessous = grille[c.y+i][c.x];
        			if (voisinDessous.isNode) {
        				b.append(" " + voisinDessous.x + " " + voisinDessous.y);
        				voisin = true;
        				break;
        			}
        			i++;
    			}
    			if(!voisin) {
    			  b.append(" -1 -1");
    			}
    		}
    		System.out.println(b.toString());
        }
	
	}

	public static void solve(Scanner in) {
		width = in.nextInt(); // the number of cells on the X axis
		height = in.nextInt(); // the number of cells on the Y axis
		//System.out.println("width : " + width + " height : " + height);
		Case[][] grille = new Case[height][width];
		if (in.hasNextLine()) {
			in.nextLine();
		}
		String[] lines = new String[height];

		for (int i = 0; i < height; i++) {
			String line = in.nextLine(); // width characters, each either 0 or .
			lines[i] = line;

			Case[] ligne = new Case[width];
			int j = 0;
			for (char c : line.toCharArray()) {
				if (c == '0') {
					ligne[j] = new Case(j, i, true);
				} else {
					ligne[j] = new Case(j, i, false);
				}
				j++;
			}
			grille[i] = ligne;
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				compute(grille[i][j], grille);
			}
		}
	}


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        solve(in);       
    }
}