class MyModel1 {
     //write your logic here
  	String model;
  	int camera;
  	int display;
  	MyModel1() {
      	model = "MyModel 1";
    	System.out.println("Features of " + model);
      	camera = 2;
      	display = 5;
      	System.out.println("Camera mega pixels: " + camera);
    }
}
class MyModel2 extends MyModel1 {
     //write your logic here
  	 String lock;
  	 MyModel2() {
        model = "MyModel 2";
       	System.out.println("Features of " + model);
      	lock = "Fingerprint";
       	camera = 5;
       	System.out.println("Camera mega pixels: " + camera);
       	System.out.println("Lock mechanism: " + lock); 
        System.out.println("Display size: " + display);
     }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  	MyModel2T() {
      	model = "MyModel 2T";
   		System.out.println("Features of " + model);
      	camera = 16;
      	display = 6;
       	System.out.println("Camera mega pixels: " + camera);
       	System.out.println("Lock mechanism: " + lock);
        System.out.println("Display size: " + display);
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      	 MyModel2T obj = new MyModel2T();
    }
}