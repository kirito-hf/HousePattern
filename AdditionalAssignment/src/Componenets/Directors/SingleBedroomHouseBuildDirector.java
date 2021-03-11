package Componenets.Directors;


import Componenets.Builder.HouseBuilder;

public class SingleBedroomHouseBuildDirector {
    public static HouseBuilder houseBuilder;
    public SingleBedroomHouseBuildDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public static void constructHouse() {
        houseBuilder.addBedroom(100, 100);
        houseBuilder.addBathroom(40, 50);
        houseBuilder.kitchen(120, 80);
        houseBuilder.garage(60, 60);
    }
}
