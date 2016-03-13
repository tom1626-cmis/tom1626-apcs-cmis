public abstract class MyDevice implements Connectable
   {
   private int memory;
   private String color;
   
   public MyDevice()
      {
      this.memory = 8; // in GB
      this.color = new String( "Black" );
      }

   public MyDevice( int memory, String color )
      {
      this.memory = memory;   // in GB
      this.color = color;   
      } // end two argument constructor
      
   public abstract void connectToBluetooth();
   
   public String toString()
      {
      String output = new String();
      output = "Memory capacity is: " + memory + "GB\n" + 
               "Color is: " + color;
      return output;
      } // end method toString()

   } // end class MyDevice