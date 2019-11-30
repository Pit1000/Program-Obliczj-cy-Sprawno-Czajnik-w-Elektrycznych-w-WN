import java.util.Scanner;
	public class SPRAWNOŒÆGRZA£EK {
		public static void main(String[] args) {
			Scanner ln = new Scanner (System.in);
			//ln.nextLine();
			System.out.println("PITER FOLTEST COMPANY");
			System.out.println("PROGRAM OBLICZAJ¥CY SPRAWNOŒÆ CZAJNIKÓW ELEKTRYCZNYCH W WARUNKACH NORMALNYCH");
			System.out.println(" ");
			boolean zapytanie = true;
			Scanner s = new Scanner (System.in);
			
			ln.nextLine();
			while(zapytanie){
				System.out.println("Podaj moc (wartoœæ mocy czynnej) grza³ki czajnika elektrycznego w watach [W]");
				System.out.print("->");
				double p = s.nextDouble();
				if (p<=0){
				 System.out.println("B³¹d Moc<=0, podaj ponownie wartoœæ mocy czynnej!");
				}
				
				
				
				
				System.out.println("Podaj temperaturê pocz¹tkow¹ wody w stopniach celcjusza [°C]");
				System.out.print("->");
				double temp0 = s.nextDouble();
				
				System.out.println("Podaj objêtoœæ wody jak¹ chcesz zagotowaæ w litrach [L]");
				System.out.print("->");
				double m = s.nextDouble();     
				System.out.println("Podaj czas w jakim zagotowa³a siê woda w sekundach [s]");  
				System.out.print("->"); 
				double tz = s.nextDouble();       
				
				                   
				
				System.out.println("Wartoœæ mocy wydzielanej na grza³ce "+ p +" W");
				System.out.println("Temperatura pocz¹tkowa wody " + temp0 + " °C");
				System.out.println("Objêtoœæ gotowanej wody " + m + " L");
				System.out.println("Czas zagotowania wody " + tz + " s");
				System.out.println("Czy wporwadzone dane siê zgadzaj¹ [Y/N]");
				
				String h = s.nextLine();
				h = s.nextLine();
			
				if((h.equals("Y"))||(h.equals("y"))){
					System.out.println("Przchodzê do obliczeñ");
					double n;
					double deltaT;
					deltaT = 100 - temp0;
					if(p*tz<=0)
						System.out.println("Wprowadzono nie prawid³owe dane");
					else if(p*tz>0){
					n = (m*deltaT*4187)/(p*tz);
					System.out.println("Sprawnoœæ wynosi "+n*100+" %" );
					zapytanie = false; 
					}
				if ((h.equals("n"))||(h.equals("N")))
					zapytanie = true;
							
					
				}	
		        }                  
		}
	}