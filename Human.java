
package gyakorlas;


public class Human {
    
    private double height = 1.86;
    private double secondHeight = 1.85;
    
    
    /** Kiírja */
    public String getHeight () {
        String a = "Nagyobb";
        String b = "Kisebb";
        if (this.height > this.secondHeight) {
        return a;
        }else{
        return b;        
       }    
            
     
    }
       
    public void setHeight (double incoming) {
        this.height = incoming;
    }
            
    
   
    
    
    
                 
}