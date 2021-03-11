package Componenets.Rooms;

import Componenets.Builder.HouseBuilder;
import Componenets.FloorType.FloorCeramicType;

import java.util.ArrayList;
import java.util.List;

public class House implements HouseBuilder {

    List<Bedroom> bdrooms = new ArrayList<>();
    List<Bathroom> bthrooms = new ArrayList<Bathroom>();
    Garage grg;
    Kitchen ktch;
    @Override
    public void addBedroom(int length, int width) {
        bdrooms.add(new Bedroom(length, width));
    }

    @Override
    public void addBedroom(int length, int width, FloorCeramicType floorCeramicType) {
        bdrooms.add(new Bedroom(length, width, floorCeramicType));
    }

    @Override
    public void garage(int length, int width) {
    }

    public void setGarage(Garage g){
        grg = g;
    }

    @Override
    public void kitchen(int length, int width) {
        ktch = (new Kitchen(length,width));
    }

    @Override
    public void kitchen(int length, int width, FloorCeramicType floorCeramicType) {
        ktch = (new Kitchen(length,width,floorCeramicType));
    }

    public void setKitchen(Kitchen kitchen) {
        ktch = kitchen;
    }

    public void addBathroom(int length, int width) {
        bthrooms.add(new Bathroom(length, width));
    }

    public void addBathroom(Bathroom bathroom) {
        bthrooms.add(bathroom);
    }

    public void addBedRoom(Bedroom bedroom) {
        bdrooms.add(bedroom);
    }

}
