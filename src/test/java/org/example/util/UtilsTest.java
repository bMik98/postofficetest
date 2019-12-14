package org.example.util;

import org.example.builder.BoxBuilder;
import org.example.builder.PackageBuilder;
import org.example.model.Box;
import org.junit.Test;
import org.example.model.Package;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class UtilsTest {

    private PackageBuilder packageBuilder = new PackageBuilder().height(100).length(100).width(100);
    private BoxBuilder boxBuilder = new BoxBuilder().height(100).length(100).width(100).wallThickness(5);

    @Test
    public void isPackageFitInBox() {
        Package parcel = packageBuilder.build();
        Box smallBox = boxBuilder.build();
        assertFalse(Utils.isPackageFitInBox(parcel, smallBox));
        smallBox = boxBuilder.height(110).build();
        assertFalse(Utils.isPackageFitInBox(parcel, smallBox));
        smallBox = boxBuilder.width(110).build();
        assertFalse(Utils.isPackageFitInBox(parcel, smallBox));
        Box fitBox = boxBuilder.length(110).build();
        assertTrue(Utils.isPackageFitInBox(parcel, fitBox));
    }

    @Test
    public void selectLeastSuitableBox() {
        List<Box> boxes = Arrays.asList(
                boxBuilder.height(300).width(300).length(300).build(),
                boxBuilder.height(200).build(),
                boxBuilder.width(200).build(),
                boxBuilder.length(200).build(),
                boxBuilder.length(100).build(),
                boxBuilder.width(100).build()
        );
        Optional<Box> result = Utils.selectLeastSuitableBox(packageBuilder.build(), boxes);
        assertTrue(result.isPresent());
        Box box = result.get();
        assertEquals(200, box.getHeight());
        assertEquals(200, box.getLength());
        assertEquals(200, box.getWidth());
    }
}