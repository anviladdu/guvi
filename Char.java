import java.util.Scanner;
 class Char {
    
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String test=sc.nextLine();
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
		}
		System.out.println(letter);
			}
}
