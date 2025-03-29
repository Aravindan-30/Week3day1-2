package week3.day2;

public class Elements {

	public static void main(String[] args) {
		//creating objects
		Button b = new Button();
		TextField t = new TextField();
		CheckBoxButton c = new CheckBoxButton();
		RadioButton r = new RadioButton();
        //calling methods
		b.click();
		b.submit();
		t.click();
		System.out.println(t.getText());
		c.click();
		c.clickCheckButton();
		r.click();
		r.selectRadioButton();
	}

}
