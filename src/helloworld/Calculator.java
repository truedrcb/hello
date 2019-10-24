package helloworld;

public class Calculator {
	
	private String text = "";
	
	int a;
	int b;
	
	int sum() {
		return a + b;
	}

	int dif() {
		return a - b;
	}
	
	String getText() {
		return text;
	}
	
	void press(char number) {
		text = text + number;
	}
	
}
