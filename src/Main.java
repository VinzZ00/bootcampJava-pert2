import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {
		// TODO Auto-generated constructor stub
//		selection();
		mathMethod();
	}
	
	private void stringmethod() {
		String name = "Elvin Sestomi";
		String[] firstAndLastName = name.split(" ");
		String nama = ("" + firstAndLastName[1].charAt(0) + ", ").concat(firstAndLastName[0] + ".");
		System.out.println(name);
		System.out.println(nama);
	}
	
	private void mathMethod() {
		int y, z;
		System.out.println("masukin tinggi segitiga");
		y = sc.nextInt(); sc.nextLine();
		System.out.println("masukin panjang alas segitiga ");
		z = sc.nextInt(); sc.nextLine();
		
		double miring = Math.sqrt(Math.pow(y,2) + Math.pow(z, 2));
		System.out.println("sisi miring sepanjang " + miring);
	}
	private void selection() {
//		selection if else switch dan ternarry
		int a = 5;
//		chained if
//		if (a > 6) {
//			System.out.println("Ini lebih besar dari 6");
//		} else if(a < 6) {
//			System.out.println("Ini lebih kecil dari 6");
//		} else if(a == 5) {
//			System.out.println("Ini adalah 5");
//		} else {
//			System.out.println("ini di else");
//		}
//		System.out.println("Ini di tengah 2 if");
		
//		nested if
//		if(a < 6 && a != 5) {
//			if (a < 6) {
//				System.out.println("A lebih kecil dari 6 nilai a adalah " + a);
//			} else {
//				System.out.println("INi di else if ke 1");
//			}
//			if (a != 5) {
//				System.out.println("Nilai a adalah 5");
//			} else {
//				System.out.println("Ini di else if ke 2");
//			}
//		}
		
//		Switch
		
		System.out.println("Masukan satu angka");
		int z = sc.nextInt(); sc.nextLine();
		
//		switch (z) {
//		
//		case 1 : {
//			System.out.println("Ini adalah 1");
//			break;
//		}
//		 
//		case 2 : {
//			System.out.println("ini adalah 2");
//			break;
//		}
//		
//		default:
//			System.out.println("ini dari default");
//		}
//		setara dengan
//		if (z == 1) {
//			System.out.println("Ini adalah 1");
//		} else if(z == 2) {
//			System.out.println("ini adalah 2");
//		} else {
//			System.out.println("ini dari default");
//		}
		
//		library math dan string
		String stringA = "Test";
		
		
//		String tidak sepenuhnya object
		
//		int Number = new Integer(4);
//		int number = 4;
		
		// single if and else
//		if (6 == 6) {
//			System.out.println("Ini 6");
//		} else {
//			
//		}
//		} else {
//			System.out.println("Ini false");
//		}
	}
	
	private void looping() {
		// TODO Auto-generated method stub
//		boolean itu ada false dan true;
		//Looping post-test loop (Do while) pre-test loop (for dan while )
		
//		pre-test loop
//		for (int i = 0; i < 6; ++i) {
//			System.out.println("ini i ke "  + i);
//			if (i == 3) {
//				break;
//			}
//			
//		}
//				
//		int i = 0;
//		
//		while (i < 6) {
//			System.out.println("INI angka ke " + i);
//			i++;
//		}
		
//		post-test Loop
//		do {
//			System.out.print("masukan angka anda ");
//			i = sc.nextInt(); sc.nextLine();
//			System.out.println("INI angka ke " + i);
//			
//			if (i == -1) {
//				break;
//			}
//		} while (true);
//		char[] asciiArt = sc.nextLine().toCharArray();
//		System.out.println("please Input an char");
//		String ascii = sc.nextLine();
//		char asciiArt = ascii.charAt(0);
//		
//		System.out.println("Please Input panjangnya");
//		int panjang = sc.nextInt(); sc.nextLine();
//		System.out.println("Please Input tingginya");
//		int tinggi = sc.nextInt(); sc.nextLine();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int k = 5;
				System.out.println("Ini I ke " + i + " dan J ke " + j);
				break;
			}
			break;
		}
		
		
//		S, Elvin
//		for (int i = 0; i < tinggi; i++) {
//			for (int j = 0; j < panjang; j++) {
//				if (i !=0 && i != (tinggi-1)) {
//					if (j == 0 || j == (panjang-1)) {
//						System.out.print(asciiArt);
//					} else {
//						System.out.print(" ");
//					}
//				} else {
//					System.out.print(asciiArt);
//				}
//			}
//			System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
