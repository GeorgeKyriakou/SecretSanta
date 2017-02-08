
/**
 * 1.Lana 
 * 2.Aylin 
 * 3.Christine 
 * 4.Miguel 
 * 5.Chanu 
 * 6.Stavros 
 * 7.Michael 
 * 8.James 
 * 9.Gerard 
 * 10.Johannes 
 * 11.Linnea 
 * 12.Avigail 
 * 13.George  
 * 14.Karl 
 */

import java.util.Arrays;
import java.util.Collections;

public class AssignTo {

	public static void main(String[] args) {
		{
			

			
			 String[] ray1 = { "Lana", "Aylin", "Christine", "Miguel", "Chanu",
					"Stavros", "Michael", "James", "Gerard", "Johannes",
					"Linnea", "Avigail", "George", "Karl" };

			String[] ray = { "Lana", "Aylin", "Christine", "Miguel", "Chanu",
					"Stavros", "Michael", "James", "Gerard", "Johannes",
					"Linnea", "Avigail", "George", "Karl" }; 
			
			
			Collections.shuffle(Arrays.asList(ray));
			int x = 0;
			while (true) {
				x=0;
				for (int i = 0; i < ray.length; i++) {
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
