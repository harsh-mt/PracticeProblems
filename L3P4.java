import java.util.*;
class pp34
{
    static void main()
    {
        String name , fromCity,viaCity,toCity;
        double viaToFinalCity;
        double fromtoVia;
        int timeFromToVia,timeViaToFinalCity;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and the city details including time in minutes and distance in miles");
        name=sc.nextLine();
        fromCity=sc.nextLine();
        viaCity=sc.nextLine();
        toCity=sc.nextLine();
        timeFromToVia=sc.nextInt();
        timeViaToFinalCity=sc.nextInt();
        fromtoVia=sc.nextDouble();
        viaToFinalCity=sc.nextDouble();
      
        
        fromtoVia*=1.6;
        viaToFinalCity*=1.6;
        
        System.out.println("The Total Distance travelled by "+name+" from "+fromCity+" to "+toCity+" via "+viaCity+" is "+(fromtoVia+viaToFinalCity)+"km and the Total Time taken is "+(timeFromToVia+timeViaToFinalCity)+"mintues");
        
    }
}
        
        
        
        
    
