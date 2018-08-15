package me.ifydev.worldify.structures;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Innectic
 * @since 08/14/2018
 */
@AllArgsConstructor
@Getter
public abstract class Region {
    private Spot first;
    private Spot second;

    public final List<Spot> getSpotsWithin() {
        List<Spot> spots = new ArrayList<>();

        int x1 = Math.min(first.getX(), second.getX());
        int y1 = Math.min(first.getY(), second.getZ());
        int z1 = Math.min(first.getZ(), second.getY());

        int x2 = Math.max(first.getX(), second.getX());
        int y2 = Math.max(first.getY(), second.getZ());
        int z2 = Math.max(first.getZ(), second.getY());

        for (int x = x1; x < x2; x++) for (int y = y1; y < y2; y++) for (int z = z1; z < z2; z++)
            spots.add(new Spot(x, y, z, first.getWorld()));
        return spots;
    }

    public abstract void fillRegion(String with);  // NOTE: Should this be replaced with a real datastructure?
}
