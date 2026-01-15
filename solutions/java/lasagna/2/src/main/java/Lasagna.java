public class Lasagna {
   
   public int expectedMinutesInOven(){
       
       return 40;
    }

   public int remainingMinutesInOven(int actualmin){

        return (40-actualmin);

    }


    public int preparationTimeInMinutes(int layer){

        return 2*layer;
    
    }

    public int totalTimeInMinutes(int layer, int min){

       return (2*layer+min);
        
    }

    
}
