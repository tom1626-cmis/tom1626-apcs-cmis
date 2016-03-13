public class MyPhone extends MyDevice
   {
   private String carrier;    // cell phone service provider
   
   public MyPhone()
      {
      super();   // calls the constructor from the class
                 // above it "MyDevice"
      this.carrier = new String( "none" );
      } // end zero argument constructor         

   public MyPhone( int memory, String color, String carrier)
      {
      super();   // calls the constructor from the class
                 // above it "MyDevice"
      this.carrier = new String( carrier );
      } // end zero argument constructor

   public void connectToBluetooth()
      {
      System.out.println( "Connecting to bluetooth for a MyPhone" );   
         
      } // end method connectToBlueTooth

   public String toString()
      {
      String output = new String( "" );
      output = super.toString() + "\n" +
               "Carrier is: " + carrier;
      return output;
      } // end method toString()
   } // end class MyPhone