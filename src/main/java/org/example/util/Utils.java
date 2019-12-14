package org.example.util;

import org.example.model.Box;
import org.example.model.Package;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Utils {

    public static final Function<Box, Integer> calculateBoxInternalHeight = box ->
            box.getHeight() - (box.getWallThickness() << 1);

    public static final Function<Box, Integer> calculateBoxInternalWidth = box ->
            box.getWidth() - (box.getWallThickness() << 1);

    public static final Function<Box, Integer> calculateBoxInternalLength = box ->
            box.getLength() - (box.getWallThickness() << 1);

    public static final Function<Box, Integer> calculateBoxInternalVolume = box ->
            calculateBoxInternalLength.apply(box)
                    * calculateBoxInternalWidth.apply(box)
                    * calculateBoxInternalHeight.apply(box);

    private Utils() {
    }

    public static boolean isPackageFitInBox(Package parcel, Box box) {
        return parcel.getHeight() <= calculateBoxInternalHeight.apply(box)
                && parcel.getWidth() <= calculateBoxInternalWidth.apply(box)
                && parcel.getLength() <= calculateBoxInternalLength.apply(box);
    }

    public static Optional<Box> selectLeastSuitableBox(Package parcel, List<Box> boxes) {
        return boxes.stream()
                .filter(box -> isPackageFitInBox(parcel, box))
                .min((o1, o2) -> calculateBoxInternalVolume.apply(o2) - calculateBoxInternalVolume.apply(o1));
    }
}
