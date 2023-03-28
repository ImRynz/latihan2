package semester_4.Latihan_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("sapi");
        hewan.add("kelinci");
        hewan.add("kambing");
        hewan.add("unta");
        hewan.add("domba");

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("kelinci");
        deleteHewan.add("kambing");
        deleteHewan.add("unta");

        for (String h : deleteHewan) {
            if (hewan.contains(h)) {
                hewan.remove(h);
            }
        }

        System.out.println("Output Hewan:");
        for (String h : hewan) {
            System.out.println(h);
        }
    }
}

