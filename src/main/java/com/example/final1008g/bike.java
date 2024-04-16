public class vehicle extends bike {
    // declare private boolean variables for the class
    private boolean hasBell, hasLights, hasBrakes;

    //constructor method for the bike class
    public vehicle(boolean hasBell, boolean hasLights, boolean hasBrakes) {
        this.hasBell = hasBell;
        this.hasLights = hasLights;
        this.hasBrakes = hasBrakes;
    }
    // get set methods for the varaibles
    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public boolean isHasLights() {
        return hasLights;
    }

    public void setHasLights(boolean hasLights) {
        this.hasLights = hasLights;
    }

    public boolean isHasBrakes() {
        return hasBrakes;
    }

    public void setHasBrakes(boolean hasBrakes) {
        this.hasBrakes = hasBrakes;
    }
    //check if the bike has fulfilled every road legal requirement
    public boolean isRoadLegal(){
        if(hasLights==false){
            return false;
        }
        else if (hasBell==false){
            return false;
        }
        else if (hasBrakes==false){
            return false;
        }
        else
            return true;
    }
    // implement methods from the main class
    public double calculateAnnualTax(){
        double tax = 0;
        System.out.println("There are no tax for bike");
        return tax;
    }

    public double calculateMaintenanaceCost(){
        double maintenanaceCost, chain, brakes, lubricate;
        chain = 50;
        brakes = 40;
        lubricate = 20;
        maintenanaceCost = chain + brakes + lubricate;
        System.out.println("The maintenanace cost is " + maintenanaceCost);
        return maintenanaceCost;
    }

    public double calculateFuelEfficiency(){
        double fuelEfficiency = 0;
        System.out.println("There are no fuel consumption on a bike");
        return fuelEfficiency;
    }


}