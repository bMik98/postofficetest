package org.example.util;

import org.example.model.Box;
import org.example.model.Package;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;

public class Utils {

    public static final ToIntFunction<Box> calculateBoxInternalHeight = box ->
            box.getHeight() - (box.getWallThickness() << 1);

    public static final ToIntFunction<Box> calculateBoxInternalWidth = box ->
            box.getWidth() - (box.getWallThickness() << 1);

    public static final ToIntFunction<Box> calculateBoxInternalLength = box ->
            box.getLength() - (box.getWallThickness() << 1);

    public static final ToIntFunction<Box> calculateBoxInternalVolume = box ->
            calculateBoxInternalLength.applyAsInt(box)
                    * calculateBoxInternalWidth.applyAsInt(box)
                    * calculateBoxInternalHeight.applyAsInt(box);

    private Utils() {
    }

    public static boolean isPackageFitInBox(Package parcel, Box box) {
        return parcel.getHeight() <= calculateBoxInternalHeight.applyAsInt(box)
                && parcel.getWidth() <= calculateBoxInternalWidth.applyAsInt(box)
                && parcel.getLength() <= calculateBoxInternalLength.applyAsInt(box);
    }

    public static Optional<Box> selectLeastSuitableBox(Package parcel, List<Box> boxes) {
        return boxes.stream()
                .filter(box -> isPackageFitInBox(parcel, box))
                .min(Comparator.comparingInt(calculateBoxInternalVolume::applyAsInt));
    }
}
