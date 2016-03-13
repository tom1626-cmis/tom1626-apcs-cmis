public abstract class Vehicle
   {
   private int numPassengers;
   
   public Vehicle()
      {
      this.numPassengers = 0;           
      } // end zero-arg constructor
   
   public Vehicle( int passengers )
      {
      this.numPassengers = passengers;   
      } // end one-argument constructor
      
   public String toString()
      {
      return "Number of passengers is: " + numPassengers;
      } // end method toString
   } // end class Vehicle