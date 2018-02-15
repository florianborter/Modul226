import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AB04MainF {
    public static void main(String[] args) {
        int[] liste = new int[100000];
        int[] klon1 = new int[100000];
        int[] klon2 = new int[100000];
        for(int i = 0; i < liste.length; i++) {
            liste[i] = (int) (100*Math.random());
        }

        Long start = System.currentTimeMillis();
        for(int i = 0; i < liste.length; i++) {
            klon1[i] = liste[i];
        }
        Long end = System.currentTimeMillis();
        Long difference = end-start;
        System.out.println("Element für Element: " + difference + "ms");

        Long start2 = System.currentTimeMillis();
        klon2 = liste.clone();
        Long end2 = System.currentTimeMillis();
        Long difference2 = end2-start2;
        System.out.println("Mit clone(): " + difference2 + "ms");

       /* List<Integer> asdf = new ArrayList<>();
        for(int i = 0; i < liste.length; i++) {
            asdf.add(liste[i]);
        }

        asdf.forEach(System.out::println);*/
    }

}
