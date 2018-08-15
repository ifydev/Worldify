package me.ifydev.worldify.structures;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Innectic
 * @since 08/14/2018
 */
@Getter
@AllArgsConstructor
public class Spot {

    private int x;
    private int y;
    private int z;

    private String world;
}
