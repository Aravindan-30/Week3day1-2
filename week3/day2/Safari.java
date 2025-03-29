package week3.day2;

public class Safari extends Browser {
    public void readerMode() {
    	System.out.println("readermode is enabled");
    }
    public void fullScreenMode() {
    	System.out.println("full screen mode is enabled");
    }
	public static void main(String[] args) {
		Safari s=new Safari();
        s.navigateBack();
        s.readerMode();
	}

}
