










public class randomletter {
	public static void main(String[] args) {
		
		double letter = 0;
		while (letter < 1 ){
			int i = (int)(Math.random() * 100);
			if(i >= 65 && i <= 90){
			char myChar = (char) i;
			System.out.print("Your letter is " + myChar);
			letter++;
			}
		}
	}

}
