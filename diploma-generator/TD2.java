import java.util.Scanner;

public class TD2 {
	static Scanner sc = new Scanner(System.in);

	static void exo1() {
		System.out.println("entrez n :");
		int n = sc.nextInt();
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + i;
		}
		System.out.println("La somme = " + s);
	}

	static int fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

	static void exo2() {
		System.out.println("entrez n :");
		int n = sc.nextInt();

		System.out.println("Factorielle = " + fact(n));
	}

	static void exo3() {
		System.out.println("entrez a :");
		int a = sc.nextInt();
		System.out.println("entrez b :");
		int b = sc.nextInt();
		int m = 0;
		for (int i = 0; i < a; i++) {
			m = m + b;
		}
		System.out.println(a + "*" + b + "=" + m);
	}

	static void exo3Variante() {
		System.out.println("entrez a :");
		int a = sc.nextInt();
		System.out.println("entrez b :");
		int b = sc.nextInt();
		int m = 0;
		while (--b >= 0) {
			m = m + a;
		}
		System.out.println("=" + m);
	}

	static void exo4() {
		System.out.println("entrez a :");
		int a = sc.nextInt();
		System.out.println("entrez b :");
		int b = sc.nextInt();
		int q = 0;
		while (a >= b) {
			a = a - b;
			q++;
		}
		System.out.println("quotient = " + q + ", reste = " + a);
	}

	static int pgcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	static void exo5() {
		System.out.println("entrez a :");
		int a = sc.nextInt();
		System.out.println("entrez b :");
		int b = sc.nextInt();

		System.out.println("pgcd = " + pgcd(a, b));
	}

	static void exo5Variante() {
		System.out.println("entrez a :");
		int a = sc.nextInt();
		System.out.println("entrez b :");
		int b = sc.nextInt();
		int r;
		while ((r = a % b) != 0) {
			a = b;
			b = r;
		}
		System.out.println("pgcd = " + b);
	}

	static int fibo(int n) {
		int pre = 1;
		int pre2 = 1;
		int fibon = 1;
		for (int i = 2; i <= n; i++) {
			fibon = pre + pre2;
			pre2 = pre;
			pre = fibon;
		}
		return fibon;

	}

	static void exo6() {
		System.out.println("entrez n :");
		int n = sc.nextInt();

		System.out.println(fibo(n));
	}

	static double calculPi(int n) {
		double s = 0;
		double num = 1;
		double denom = 1;
		for (int i = 1; i <= n; i++) {
			s = s + (num / denom);
			num = -num;
			denom = denom + 2;
		}
		return s * 4;
	}

	static void exo7() {
		System.out.println("entrez n :");
		int n = sc.nextInt();

		System.out.printf("%.15f", calculPi(n));
		System.out.printf("%.15f", Math.PI);
	}

	static void exo8() {
		System.out.println("entrez x :");
		double x = sc.nextInt();
		System.out.println("entrez le nombre de termes :");
		double n = sc.nextInt();

		double s = 1;
		double num = x;
		double den = 1;
		for (int i = 1; i <= n; i++) {
			s = s + (num / den);
			num = num * x;
			den = den * (i + 1);
		}
		System.out.println(s);
	}

	static void exo9() {
		System.out.println("entrez x :");
		int x = sc.nextInt();
		System.out.println("entrez k :");
		int k = sc.nextInt();
		int nb = (int) (x / (Math.pow(10, k - 1)));
		if (nb >= 10) {
			System.out.println(nb % 10);
		} else {
			System.out.println(nb);
		}

	}

	static void exo10() {
		int max = 1000;
		int min = 1;
		int reponse;
		do{
			int nb = (max + min) / 2; 
			reponse = sc.nextInt();
			if (reponse == 1) {// c'est plus petit 
				min = nb; 
			} else if (reponse == 2) {// c'est plus grand 
				max = nb; 
		  }
		}while (reponse!=0); 
		System.out.println("c'est gagné");

	}
	final static double EPSILON = 1e-8;
	static void exo11() {
		long t0 = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			int sommeDiv = 1;
			int diviseur = 2;
			while (diviseur <= i / 2) {
				if (i % diviseur == 0) {
					sommeDiv = sommeDiv + diviseur;
				}
				diviseur++;
			}
			if (sommeDiv == i) {
				System.out.println(i);
			}
		}
		long t1 = System.currentTimeMillis();
		System.out.println("temps exec : "+(t1-t0)+" ms");
	}

	static void exo12() {
		for(int i=1; i<=999;i++) {
			int somme = 0; 
			int j = i;
			while(j!=0) {
				somme = somme + ((j%10)*(j%10)*(j%10));
				j=j/10;
			}
			if(somme == i) {
				System.out.println(i);
			}
		}
	}
	static int estCube(int x) {
		int u = x%10;
		int d = (x/10)%10;
		int c = x/100;
		return (c*c*c)+(d*d*d)+(u*u*u);
	}
	static void exo12bis() {
		for(int i=0; i<1000;i++) {
			if(estCube(i)==i) {
				System.out.println(i);
			}
		}
	}
	
	static void exo13() {
		System.out.println("entre le nombre de lignes");
		int n=sc.nextInt();
		for( int i = 1;i<=n; i++) {
			for (int j=1; j<=n*2;j++) {
				if(j<=i) {
					System.out.print("*");
				}
				else if(j>i && n*2-i>=j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	static void exo14(double a) {
		double xn = 1;
		int c = 0;
		while(Math.abs(xn*xn/a-1)>EPSILON) {
			xn = ((xn)+ (a/xn))/2;
			c++;
		}
		System.out.println(xn);
		System.out.println(c);
	}
	static void exo15(int x) {
		int compteur = 2;
		while (x != 1) {
			while(x%compteur == 0) {
				System.out.print(compteur + "*");
				x=x/compteur;
			}
			compteur++;
		}
	}
	static void exo15bis(int n) { // \b pour revenir d'un caractère + <espace> pour remplacer le dernier caractère
		int div = 2;
		String avant = " ";
		while(n>=div) {
			if(n%div==0) {
				System.out.print(avant+div);
				avant="x";
				n/=div;
			}
			else {
				div++;
			}
		}
		System.out.println();
	}
	static void exo16(int x, int n) {
		int puiss = 1;
		for (int i = 0; i<n; i++) {
			int prod = 0;
			for(int j=0;j<puiss;j++) {
				prod=prod+x;
			}
			puiss=prod;
		} 
		System.out.println(puiss);
	}

	public static void main(String[] args) {
		// exo1();
		// 1exo2();
		// exo3();
		// exo3Variante();
		// exo4();
		// exo5Variante();
		// exo6();
		// exo7();
		// exo8();
		// exo9();
		//exo10();
		//exo11();
		//exo12();
		//exo13();
		//exo14(100.7567);
		//exo15(99);
		//exo15bis(99);
		exo16(10,3);
	}

}
