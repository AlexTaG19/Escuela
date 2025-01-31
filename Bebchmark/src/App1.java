
public class App1 {
   
    public static void main(String[] args)  {
        long instante1 = System.currentTimeMillis();
        double fin=100000000;
        int i;
        double test=0;

        System.out.println("Realizando test de rendimiento...");

     for (i = 2; i <= fin; i++) {
         if (primo(i)){
            test++;
         }
    
    
     }
     long instante2 = System.currentTimeMillis();
    double diferencia = (instante2 - instante1) / 1000.0;
    double minutos = diferencia / 60.0;
    double puntos = ( (1 / minutos) * 1000);

     System.out.println("time: " + minutos);
    System.out.println("Mark: " +puntos );

    }
    public static boolean primo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
            
}



}

        


    

    
    
    

        
        
        
        
        
        
        
        
        

        
        

        
        

    
    
    
        
        

    
            
                
                
                
                
                
            
                
                
                
                
                
            
                
                
                
                    
                
                
                
                
            
                
                
                
                
                
            
                
                
                
                
                
            
                
                
                
                
                

            
                
                
                
                
                