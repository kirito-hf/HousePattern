package Componenets.Builder;

import Componenets.FloorType.FloorCeramicType;
import Componenets.Rooms.*;

public class StandardHouseBuilder implements HouseBuilder {
    private House house = new House();
    @Override
    public void addBedroom(int length, int width) {
        Bedroom bedroom = new Bedroom(length, width);
        house.addBedRoom(bedroom);
    }
    @Override
    public void addBedroom(int length, int width, FloorCeramicType floorCeramicType) {
        Bedroom bedroom = new Bedroom(length, width, floorCeramicType);
        house.addBedRoom(bedroom);
    }
    @Override
    public void addBathroom(int length, int width) {
        Bathroom bathroom = new Bathroom(length, width);
        house.addBathroom(bathroom);
    }
    @Override
    public void garage(int length, int width) {
        Garage garage = new Garage(length, width);
        house.setGarage(garage);
    }
    @Override
    public void kitchen(int length, int width) {
        Kitchen kitchen = new Kitchen(length, width);
        house.setKitchen(kitchen);
    }
    @Override
    public void kitchen(int length, int width, FloorCeramicType floorCeramicType) {
        Kitchen kitchen = new Kitchen(length, width, floorCeramicType);
        house.setKitchen(kitchen);
    }
    public House getHouse() {
        return house;
    }
}