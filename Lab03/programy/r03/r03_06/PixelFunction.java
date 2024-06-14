package r03.r03_06;

import java.awt.Color;

@FunctionalInterface
public interface PixelFunction
{
    Color apply(int x, int y);
}

