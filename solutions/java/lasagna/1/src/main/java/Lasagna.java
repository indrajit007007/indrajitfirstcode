public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
   public int expectedMinutesInOven(){
       
       return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

   public int remainingMinutesInOven(int actualmin){

        return (40-actualmin);

    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int layer){

        return 2*layer;
    
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer, int min){

       return (2*layer+min);
        
    }

    public static void main(String args[]){

        Lasagna la=new Lasagna();
        int total=la.totalTimeInMinutes(3,20);
        System.out.println(total);
        
    }

    
}
