package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main 
{

		

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				List<Laptop>laps=new ArrayList<Laptop>();
				laps.add(new Laptop("dell",15,170000));
				laps.add(new Laptop("asus",17,10000));
				laps.add(new Laptop("apple",25,250000));
				
				Collections.sort(laps);
				for(Laptop l:laps) {
					System.out.println(l);
				}



			}

		}

