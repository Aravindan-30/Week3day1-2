package week3.day2;

public class Chrome extends Browser {
   public void openIncognito() {
	   System.out.println("Incognito window is opened");
   }
   public void clearCache() {
	   System.out.println("Cache cleared");
   }
   public static void main(String[] args) {
	   Chrome c = new Chrome();
	   c.openURL();
	   c.openIncognito();
	   c.closeBrowser();
   
   }
}
