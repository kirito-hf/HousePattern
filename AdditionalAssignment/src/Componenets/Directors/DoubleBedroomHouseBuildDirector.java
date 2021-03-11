package Componenets.Directors;


import Componenets.Builder.HouseBuilder;

public class DoubleBedroomHouseBuildDirector {
    private final HouseBuilder houseBuilder;
    public DoubleBedroomHouseBuildDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public void constructHouse() {
        houseBuilder.addBedroom(100, 100);
        houseBuilder.addBedroom(120, 120);
        houseBuilder.addBathroom(40, 50);
        houseBuilder.kitchen(120, 80);
        houseBuilder.garage(60, 60);
    }
}
