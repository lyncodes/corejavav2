package chapter1_Stream_Library;

import java.util.ArrayList;

public class IteratingToStream_1_1 {
    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<>();
        as.add("1");
        as.add("12");
        as.add("123");
        as.add("1234");
        as.add("12345");
        as.add("123456");
        for (int i = 0; i < 100000000; i++) {
            as.add("1234");
        }

        // using stream
        long t1 = System.currentTimeMillis();
        Long count = as.stream().filter(w -> w.length() > 3).count();
        long t2 = System.currentTimeMillis();

        System.out.println(count + " in " + (t2 - t1)+"ms");

        // using parallelStream
        long t3 = System.currentTimeMillis();
        // faster in parallel computing
        Long countPara = as.parallelStream().filter(w -> w.length() > 3).count();
        long t4 = System.currentTimeMillis();

        System.out.println(countPara + " parallel in " + (t4 - t3)+"ms");


        int count2 = 0;
        for (String s : as) {
            if (s.length() > 3) {
                count2++;
            }
        }
        System.out.println(count2);

    }
}
