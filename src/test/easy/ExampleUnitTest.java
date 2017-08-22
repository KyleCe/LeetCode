package test.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/**
 * Created by ChenGong on 22/08/2017
 */
public class ExampleUnitTest {
    static List<Integer> list;

    @Test
    public void name() throws Exception {
        list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        Runnable r = () -> {
            try{
                for(int i : list){
                    System.out.println(i);
                }
            }catch (ConcurrentModificationException cee){
                cee.printStackTrace();
            }
        };

        Runnable edit = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }

            for(int i : list){
                System.out.println(i);
            }
        };

        new Thread(r).start();
        new Thread(edit).start();

    }
}