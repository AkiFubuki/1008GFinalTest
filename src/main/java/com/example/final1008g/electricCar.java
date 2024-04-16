public class electricCar extends Car {
    // declare private double varaibles for the class
    private double batteryCompacity;
    //delcare a constructor fot the class
    public electricCar(double batteryCompacity) {
        this.batteryCompacity = batteryCompacity;
    }
    // get set methods fo the varaibles
    public double getBatteryCompacity() {
        return batteryCompacity;
    }

    public void setBatteryCompacity(double batteryCompacity) {
        if (batteryCompacity>50 || batteryCompacity<100){
            this.batteryCompacity = batteryCompacity;
        }
        else
            throw new IllegalArgumentException("The battery compacity should be between 50 and 100 kwh");
    }

    // a modified method for claculate the efficiency of electric cars
    public double calculateFuelEfficiency(){
        // the consumption is 5kwh
        double fuelEfficiency = 5;
        System.out.println("The consumption in kwh is " + fuelEfficiency);
        return (fuelEfficiency+"kwh");
    }

    // implement methods from the car class
    public double calculateChargingCost()(double electricityRate){
        electricityRate = 10;
        double chargingCost= electricityRate*batteryCompacity;
        System.out.println("The charging cost is " + chargingCost);
        return chargingCost;
    }

    public double calculateAnnualTax(){
        private double annualTaxCost;
        baseTaxRate:200;
        discountRate: 0.5;
        annualTaxCost= (baseTaxRate * discountRate);
        System.out.println("The annual tax rate is " + annualTaxCost);
        return annualTaxCost;
    }

    public abstract double calculateMaintenanaceCost() {
        double brakeWork, batteryMaintenance, maintenanceCost;
        brakeWork= 100;
        batteryMaintenance=100;
        maintenanceCost= brakeWork+batteryMaintenance;
        Systme.out.println("The maintenance cost is " + maintenanceCost);
        return maintenanceCost;

    }
}