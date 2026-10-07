
abstract class EnergySource { 
    int sourceID; 
    String sourceName; 
    double energyGenerated; 

    public EnergySource(int sourceID, String sourceName, double energyGenerated) { 
        this.sourceID = sourceID; 
        this.sourceName = sourceName; 
        this.energyGenerated = energyGenerated; 
    } 

    abstract double calculateEfficiency(); 

    void display() { 
        System.out.println("SourceID: " + sourceID); 
        System.out.println("SourceName: " + sourceName); 
        System.out.println("EnergyGenerated: " + energyGenerated + " kWh"); 
        System.out.println("CalculateEfficiency: " + calculateEfficiency() + "%"); 
        System.out.println(); 
    } 
} 

class SolarEnergy extends EnergySource { 
 
    SolarEnergy(int sourceID, String sourceName, double energyGenerated) { 
        super(sourceID, sourceName, energyGenerated); 
    } 

    @Override 
    double calculateEfficiency() { 
        return (energyGenerated / 5000) * 100; 
    } 
} 

class WindEnergy extends EnergySource { 

    WindEnergy(int sourceID, String sourceName, double energyGenerated) { 
        super(sourceID, sourceName, energyGenerated); 
    } 

    @Override 
    double calculateEfficiency() { 
        return (energyGenerated / 8000) * 100; 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        EnergySource e; 

        e = new SolarEnergy(1, "Solar", 4000); 
        e.display(); 

        e = new WindEnergy(2, "Wind", 6000); 
        e.display(); 
    } 
}
