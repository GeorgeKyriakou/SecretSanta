
/**
 * 1.Lana Teider
 * 2.Aylin Weber
 * 3.Christine Banken
 * 4.Miguel Marley
 * 5.Chanu Autar
 * 6.Stavros Makris
 * 7.Michael Planck
 * 8.James Morrison-Knight
 * 9.Gerard Rodan
 * 10.Johannes Härri
 * 11.Linnea Hay
 * 12.Avigail Lowes
 * 13.George Kyriakou
 * 14.Karl Bergström
 */

import java.util.Arrays;
import java.util.Collections;

public class AssignTo {

	public static void main(String[] args) {
		{
			// int[] af ={0,1,2,3,4,5,6,7,8,9,10,11,12,13};

			// Random rgen = new Random(); // Random number generator
			/* String[] ray1 = { "Lana Teider", "Aylin Weber", "Christine Banken", "Miguel Marley", "Chanu Autar",
					"Stavros Makris", "Michael Planck", "James Morrison-Knight", "Gerard Rodan", "Johannes Härri",
					"Linnea Hay", "Avigail Lowes", "George Kyriakou", "Karl Bergström" };

			String[] ray = { "Lana Teider", "Aylin Weber", "Christine Banken", "Miguel Marley", "Chanu Autar",
					"Stavros Makris", "Michael Planck", "James Morrison-Knight", "Gerard Rodan", "Johannes Härri",
					"Linnea Hay", "Avigail Lowes", "George Kyriakou", "Karl Bergström" }; */
			String[] ray1 = {"Edward Sekayanira","María Fernanda","Israel Israel Allan","Manoaj"};
			String[] ray = {"Edward Sekayanira","María Fernanda","Israel Israel Allan","Manoaj"};
			
			Collections.shuffle(Arrays.asList(ray));
			int x = 0;
			while (true) {
				x=0;
				for (int i = 0; i < 4; i++) {
					if (ray1[i] == ray[i])
						x = 1;
				}
				if (x == 1)
					Collections.shuffle(Arrays.asList(ray));
				if (x == 0)
					break;
			}

			for (int i = 0; i < 4; i++)

				System.out.println(i + 1 + ") " + ray1[i] + "-- is secret santa of-- " + ray[i]);

		}
	}
}