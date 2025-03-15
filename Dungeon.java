import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public String toString() {
        return "Dungeon: " + name + "\nRooms: " + rooms + "\nNPCs: " + npcs;
    }
}