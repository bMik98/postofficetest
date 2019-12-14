package org.example.util;

import org.example.builder.BoxBuilder;
import org.example.builder.PackageBuilder;
import org.example.model.Box;
import org.junit.Test;
import org.example.model.Package;

import static org.junit.Assert.*;

public class UtilsTest {

    private PackageBuilder packageBuilder = new PackageBuilder().height(100).length(100).width(100);
    private BoxBuilder boxBuilder = new BoxBuilder().height(100).length(100).width(100);

    @Test
    public void isPackageFitInBox() {
        Package parcel = packageBuilder.build();
        Box small box
    }

    @Test
    public void selectLeastSuitableBox() {
    }
}