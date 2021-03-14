package test.draft;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import algorithm.base.Base;

public class ForEach extends Base {
    enum Face {_1, _2, _3, _4, _5, _6}

    @Test
    public void face() {

        Collection<Face> faces = Arrays.asList(Face.values());

        for (Iterator<Face> i = faces.iterator(); i.hasNext(); )
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); )
                System.out.println("First:" + i.next() + " " + j.next());


        for (Face face : faces)
            for (Face face2 : faces)
                System.out.println("Second:" + face + " " + face2);

    }

    @Test
    public void name() throws Exception {
        long start = System.currentTimeMillis();
        System.out.println(String.format("Kyle-%s--%4s--%s", System.currentTimeMillis(), (System.currentTimeMillis() - start), "1"));
    }

    @Test
    public void tryCatch() throws Exception {
        work(true);
        work(false);
    }

    private void work(boolean typeTry) {
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            if (typeTry) tryFun();
            else fun();
        }
        System.out.println("TYPE try:: " + (typeTry ? "TRY" : "NOT") + "----" + (System.nanoTime() - start));
    }

    private float fun() throws NullPointerException {
        int x = 10;
        int y = 5;
        return (float) x / y;
    }

    private void tryFun() {
        try {
            fun();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void date() {
        boolean after = new Date(System.currentTimeMillis()).after(new Date(117, 10, 23));
        System.out.println(after);


        after = new Date(System.currentTimeMillis()).after(new Date(117, 9, 23));
        System.out.println(after);
    }

    @Test
    public void divide() throws Exception {
        String pref_device_id = "8ccabd79618c4188991e81cc0d7bb6ee";
        boolean re = pref_device_id.charAt(pref_device_id.length() - 1) % 2 == 0;
        re = 'b' % 2 == 0;
        log(re);
    }

    @Test
    public void pattern() throws Exception {
        Pattern pattern = Pattern.compile("^(\\d+)\\s+(0x)?([a-f0-9]+)\\s+(.*)$", 2);
        String line = "11kikakeyboard";
        Matcher matcher = pattern.matcher(((CharSequence) line));
        boolean res = matcher.matches();
        log(res);
    }
}
