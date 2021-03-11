package Componenets.Rooms;

import Componenets.FloorType.FloorCeramicType;

public class Bedroom extends Room {
    private FloorCeramicType floorCeramicType;
    public Bedroom(int length, int width) {
        super(length, width);
    }
    public Bedroom(int length, int width, FloorCeramicType floorCeramicType) {
        super(length, width);
        this.floorCeramicType = floorCeramicType;
    }
}
