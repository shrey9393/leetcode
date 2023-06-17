import java.io.*;
import java.util.*;

class Result {

    public int poisonousPlants(List<Integer> p) {
        boolean b = true;
        int count = 0;
        while (b) {
            b = false;
            for (int i = 1; i < p.size(); i++) {
                if (p.get(i) > p.get(i - 1)) {
                    p.remove(i);
                    b = true;
                }
            }
            if (b) {
                count++;
            }
        }
        return count;

    }

}

public class poisonousPlant {
    public static void main(String[] args) {
        Result rs = new Result();
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(6);
        l1.add(5);
        l1.add(8);
        l1.add(4);
        l1.add(7);
        l1.add(10);
        l1.add(9);
        System.out.println(rs.poisonousPlants(l1));

    }
}
