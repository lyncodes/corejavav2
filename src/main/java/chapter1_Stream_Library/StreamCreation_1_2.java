package chapter1_Stream_Library;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreation_1_2 {
    public static void main(String[] args) {
        Stream<String> words = Stream.of("word1", "word2", "word3");
        System.out.println(words.count());
        int[] data = new int[3];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        System.out.println(Arrays.stream(data).count());

        // empty to generate an empty stream
        System.out.println(Stream.empty().count());

        Stream<String> echos = Stream.generate(()-> "echos____");

        System.out.println(echos.findAny());

        Stream<Double> randoms = Stream.generate(Math::random);
        System.out.println(randoms.findAny());
    }
}
