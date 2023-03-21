package me.nanodragon.testmod.Enchant;

import java.lang.reflect.Array;
import java.util.ListIterator;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import me.nanodragon.testmod.Utils.XPUnlock;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class Abundance_of_experience extends Enchantment{

	public Abundance_of_experience() {
		super(101, 3, EnumEnchantmentType.weapon);
		setName("abundance_of_experience");
		addToBookList(this);
	}
	
	@Override
    public int getMaxLevel() {
        return 3;
    }
}
