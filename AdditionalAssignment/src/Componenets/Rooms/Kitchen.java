package Componenets.Rooms;

import Componenets.FloorType.FloorCeramicType;

public class Kitchen extends Room {
    private FloorCeramicType floorCeramicType;
    public Kitchen(int length, int width) {
        super(length, width);
    }
    public Kitchen(int length, int width, FloorCeramicType floorCeramicType) {
        super(length, width);
        this.floorCeramicType = floorCeramicType;
    }
}
