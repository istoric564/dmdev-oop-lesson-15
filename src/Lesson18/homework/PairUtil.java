package Lesson18.homework;

public final class PairUtil {
    private PairUtil(){

    }
//    Что-то понял. Но много не понял. ¯\_(ツ)_/¯¯\_(ツ)_/¯¯\_(ツ)_/¯¯\_(ツ)_/¯¯\_(ツ)_/¯¯\_(ツ)_/¯
    private static <K,V> Pair<V, K> swap (Pair<K, V> source){
        V second = source.getSecond();
        K first = source.getFirst();
        return new Pair<>(second,first);

    }
}
