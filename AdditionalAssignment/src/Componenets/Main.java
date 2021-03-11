package Componenets;

import Componenets.Builder.StandardHouseBuilder;
import Componenets.Directors.*;
import Componenets.Rooms.House;

public class Main {
    public static void main(String[] args) {

        StandardHouseBuilder standardHouseBuilder = new StandardHouseBuilder();
        DoubleBedroomHouseBuildDirector twoBedroomHouseBuildDirector = new DoubleBedroomHouseBuildDirector(standardHouseBuilder); //new director
        twoBedroomHouseBuildDirector.constructHouse();
        House house = standardHouseBuilder.getHouse();

        ManualHouseBuilder countingHouseBuilder = new ManualHouseBuilder();

        SingleBedroomHouseBuildDirector singleBedroomHouseBuildDirector = new SingleBedroomHouseBuildDirector(countingHouseBuilder);
        SingleBedroomHouseBuildDirector.constructHouse();

        System.out.println("Number of bedrooms = " + countingHouseBuilder.getNumBedrooms());
        System.out.println("Number of bathrooms = " + countingHouseBuilder.getNumBathrooms());
        System.out.println("Is Kitchen present: " + countingHouseBuilder.isKitchenPresent());
        System.out.println("Is Garage present: " + countingHouseBuilder.isGaragePresent());
    }
}
