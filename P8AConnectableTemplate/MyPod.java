public class MyPod extends MyDevice
   {
   
   public MyPod()
      {
      super();   
      } // end zero argument constructor
      
   public MyPod( int memory, String color )
      {
      super( memory, color );   // "pass the buck" to the superclass MyDevice   
      } // end two argument constructor
     
   public void applyDiscount()
      {
      System.out.println( "Discount for MyPod is 50%" );    
      }
          
   public void connectToBluetooth()
      {
      System.out.println( "Connecting to bluetooth for a MyPod" );   
         
      } // end method connectToBlueTooth
      
   public String toString()
      {
      return super.toString();   // call the toString() method from MyDevice...
                                // no need to rewrite it again!
      } // end method toString()
      
   } // end class MyPad