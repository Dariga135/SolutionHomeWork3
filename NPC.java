import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NPC {
    private String name;
    private String role;

    public NPC(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String toString() {
        return "NPC: " + name + " (" + role + ")";
    }
}