package com.willr27.blocklings.util;

import net.minecraft.network.chat.Component;

public class BlocklingsComponent extends Component
{
    public BlocklingsComponent(String key)
    {
        super("blocklings." + key);
    }

    public BlocklingsComponent(String key, Object... objects)
    {
        super("blocklings." + key, objects);
    }
}
