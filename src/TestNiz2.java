import java.util.Scanner;

public class TestNiz2 {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Koliko clanova niz ima : ");
	//	System.out.println("n = ");
		n = in.nextInt();
		
		int a [] = new int [n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("a [ " + i + " ] = ");
		      a[i] = in.nextInt();

		}
		
		System.out.print("a = ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		// najveci element niza
		
		int max = a[0];
		
		for (int i = 0; i < n; i++)
			if (a[i] > max)
				max = a[i];
		System.out.println("Najveci clan niza je max = " + max);
//		System.out.println();
		
		// suma niza
		
		int sum = 0;
		
		for (int i = 0; i < n; i++)
			sum += a[i];
		System.out.println("Suma niza je " + sum);

		
		// suma elemenata na parnim mestima niza
		
		int sumP = 0;
		
		for (int i = 0; i < n; i+=2)
			sumP += a[i];
		System.out.println("Suma na parnim mestima je " + sumP);
		
		// da li neki element postoji u nizu
		
		int y = 5;
		boolean nema_gi = true;
		
		for (int i = 0; i < n && nema_gi == true; i++)
			if (a[i] == y)
				nema_gi = false;
		if (nema_gi == false)
			System.out.println("Clan postoji u nizu.");
		else
			System.out.println("Clana nema u nizu.");
		
		
		// da se prebroje pozitivni elementi niza
		
		int b = 0;
//		for(int i = 0; i < n; i ++)
//			if (a[i] > 0)
//				b++;
		
		for (int d : a) // prolazi kroz ceo niz
			if (d > 0)
				b++;
		
		System.out.println("b = " + b);
					
		
	}
	
	

}
