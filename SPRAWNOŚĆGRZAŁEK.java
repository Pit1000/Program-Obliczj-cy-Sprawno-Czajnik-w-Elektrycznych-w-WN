import java.util.Scanner;
	public class SPRAWNO��GRZA�EK {
		public static void main(String[] args) {
			Scanner ln = new Scanner (System.in);
			//ln.nextLine();
			System.out.println("PITER FOLTEST COMPANY");
			System.out.println("PROGRAM OBLICZAJ�CY SPRAWNO�� CZAJNIK�W ELEKTRYCZNYCH W WARUNKACH NORMALNYCH");
			System.out.println(" ");
			boolean zapytanie = true;
			Scanner s = new Scanner (System.in);
			
			ln.nextLine();
			while(zapytanie){
				System.out.println("Podaj moc (warto�� mocy czynnej) grza�ki czajnika elektrycznego w watach [W]");
				System.out.print("->");
				double p = s.nextDouble();
				if (p<=0){
				 System.out.println("B��d Moc<=0, podaj ponownie warto�� mocy czynnej!");
				}
				
				
				
				
				System.out.println("Podaj temperatur� pocz�tkow� wody w stopniach celcjusza [�C]");
				System.out.print("->");
				double temp0 = s.nextDouble();
				
				System.out.println("Podaj obj�to�� wody jak� chcesz zagotowa� w litrach [L]");
				System.out.print("->");
				double m = s.nextDouble();     
				System.out.println("Podaj czas w jakim zagotowa�a si� woda w sekundach [s]");  
				System.out.print("->"); 
				double tz = s.nextDouble();       
				
				                   
				
				System.out.println("Warto�� mocy wydzielanej na grza�ce "+ p +" W");
				System.out.println("Temperatura pocz�tkowa wody " + temp0 + " �C");
				System.out.println("Obj�to�� gotowanej wody " + m + " L");
				System.out.println("Czas zagotowania wody " + tz + " s");
				System.out.println("Czy wporwadzone dane si� zgadzaj� [Y/N]");
				
				String h = s.nextLine();
				h = s.nextLine();
			
				if((h.equals("Y"))||(h.equals("y"))){
					System.out.println("Przchodz� do oblicze�");
					double n;
					double deltaT;
					deltaT = 100 - temp0;
					if(p*tz<=0)
						System.out.println("Wprowadzono nie prawid�owe dane");
					else if(p*tz>0){
					n = (m*deltaT*4187)/(p*tz);
					System.out.println("Sprawno�� wynosi "+n*100+" %" );
					zapytanie = false; 
					}
				if ((h.equals("n"))||(h.equals("N")))
					zapytanie = true;
							
					
				}	
		        }                  
		}
	}