package postoff.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String newMessage = "Morning";
		
		String newAnswer = "Good";
		
		
		int j = 7;
		
		int i = 62;
		
		float answer = (float) i / (float) j;
		
		boolean isMoreThanOne;
		
		if(answer > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		
		String message = "Hello World!";
		
		System.out.println(message);
		
		System.out.println(answer + " " + isMoreThanOne);
		
		String myResult = newAnswer + " " + newMessage;
		System.out.println(myResult );

	}

}
