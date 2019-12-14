package org.example.factory;

import org.example.model.Box;

public class BoxFactory {

    public final static int MIN_SPACE_IN_MILLIMETRES = 10;
    public final static int MIN_WALL_THICKNESS_IN_MILLIMETRES = 10;

    private BoxFactory() {
    }

    public static Box createInMillimetres(length) {
        return new Box()
    }
}
