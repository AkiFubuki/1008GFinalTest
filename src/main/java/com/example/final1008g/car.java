public class car extends vehicle {
    // declare private double variable for class car
    private double fuelTankCapacity, fuelEfficiency;
    // constructor methods for fuelTankCapacity and fuelEfficiency
    public car(double fuelTankCapacity, double fuelEfficiency) {
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }
    // get set methods for fuelTankCapacity
    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        if (fuelTankCapacity>40 || fuelTankCapacity<100) {
            this.fuelTankCapacity = fuelTankCapacity;
        }
        else
            throw new IllegalArgumentException("Fuel capacity should be between 40 and 100 L");
    }
    // get set methods for fuelEfficiency
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        if (fuelEfficiency>30){
            throw new IllegalArgumentException("fuel efficiency should not be more than 30 km/l");
        }
        else
        this.fuelEfficiency = fuelEfficiency;
    }
    //a public method for calculating the max distance
    public double maxDistance(){
        //delcare a private double variable to store the value of maxDistance
        private double maxDistance=0;
        maxDistance= fuelEfficiency * fuelTankCapacity;
        System.out.println("The max distance is " + maxDistance);
        return maxDistance;
    }

    // implement methods from the main class

    public double calculateFuelEfficiency() {
        fuelEfficiency = this.fuelEfficiency;
        System.out.println("The fuel efficiency in km/l is " + fuelEfficiency);
        return (fuelEfficiency+" km/l");
    }

    public double calculateMaintainanceCost(){
        private double maintainanceCost, oilChange, tireChange, alignments, generalService;
        oilChange = 70;
        tireChange = 80;
        alignments= 90;
        generalService = 100;
        maintainanceCost = oilChange + tireChange + alignments + generalService;
        System.out.println("The maintainance cost is " + maintainanceCost);
        return maintainanceCost

    }

    public double calculateAnnualTax(){
        private double annualTaxCost, engineDisplacement;
        engineDisplacement = 2.8;
        annualTaxCost=200;
        annualTaxCost= annualTaxCost * engineDisplacement;
        System.out.println("The annual tax cost is " + annualTaxCost);
        return annualTaxCost;


    }

}