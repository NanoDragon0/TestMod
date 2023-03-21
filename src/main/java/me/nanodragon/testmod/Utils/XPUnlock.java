package me.nanodragon.testmod.Utils;

import java.lang.reflect.Field;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.entity.EntityLiving;
import org.apache.logging.log4j.Level;

public class XPUnlock {
    public static Field XpUnlock;

    static {
        XpUnlock = ReflectionHelper.findField(EntityLiving.class, "experienceValue", "field_70728_aV");
        XpUnlock.setAccessible(true);
    }

    public static int getXP(EntityLiving entityLiving) {
        try {
            return XpUnlock.getInt(entityLiving);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
}