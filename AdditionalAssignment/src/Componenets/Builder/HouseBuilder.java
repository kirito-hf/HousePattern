package Componenets.Builder;

import Componenets.FloorType.FloorCeramicType;

public interface HouseBuilder {
    void addBedroom(int length, int width);
    void addBedroom(int length, int width, FloorCeramicType floorCeramicType);
    void addBathroom(int length, int width);
    void garage(int length, int width);
    void kitchen(int length, int width);
    void kitchen(int length, int width, FloorCeramicType floorCeramicType);
}
