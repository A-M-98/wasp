import java.util.*;

public class Game {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Wasp> hive = new ArrayList<>();
    public void populateHive(){
        int id=0;
        Wasp queen = new Wasp(80, 7, id);
        hive.add(queen);
        for (int i = 0; i < 5; i++) {
            id++;
            Wasp workerWasp = new Wasp(68, 10, id);
            hive.add(workerWasp);
        }
        for (int i = 0; i < 8; i++) {
            id++;
            Wasp droneWaspOne = new Wasp(60, 12, id);
            hive.add(droneWaspOne);
        }

    }

    public static ArrayList<Wasp> getHive() {
        Collections.shuffle(hive);
        return hive;
    }

    public void printHive(){
        for (Wasp wasp:hive) {
            System.out.println(wasp.getId());
        }
    }


    Random random = new Random();
    boolean hasStarted;
    public void startGame(){

        while (hasStarted = true){


        }
    }
}
