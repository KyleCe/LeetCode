package test.draft;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ForEach {
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
}
