import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface CloneableGameEntity {
    CloneableGameEntity cloneEntity();
}

class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }

    public String toString() {
        return "Room: " + name + " (" + description + ")";
    }
}