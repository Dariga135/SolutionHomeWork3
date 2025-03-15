public class MUDDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Dark Chamber", "A spooky dark room");
        Room clonedRoom1 = prototypeRoom.cloneEntity();
        Room clonedRoom2 = prototypeRoom.cloneEntity();

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Mystic Cave")
                .addRoom(prototypeRoom)
                .addRoom(clonedRoom1)
                .addRoom(clonedRoom2)
                .addNPC(new NPC("Guardian", "Boss Monster"))
                .build();

        System.out.println(dungeon);
    }
}