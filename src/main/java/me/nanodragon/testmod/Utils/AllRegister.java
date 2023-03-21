package me.nanodragon.testmod.Utils;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import me.nanodragon.testmod.Enchant.Abundance_of_experience;
import me.nanodragon.testmod.Enchant.Telekinesis;
import me.nanodragon.testmod.Items.HP_rod;
import me.nanodragon.testmod.Items.Vampire_sword;
import me.nanodragon.testmod.Items.Blood_rage;
import me.nanodragon.testmod.Items.Necro_armor;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;

public class AllRegister {
	
	public static Enchantment Abundance_of_experience;
	public static Enchantment Telekinesis;
	public static Item HP_rod;
	public static ItemSword Vampire_sword;
	public static ItemSword Blood_rage;
	public static ItemArmor Necro_helmet;
	public static ItemArmor Necro_plate;
	public static ItemArmor Necro_legs;
	public static ItemArmor Necro_boots;
	

	public static void register() {
	//====================  ���� �����������  ======================
		
		Abundance_of_experience = new Abundance_of_experience();
		Telekinesis = new Telekinesis();
		
	//
	//====================  ���� ���������  ========================
		
		HP_rod = new HP_rod();
		Vampire_sword = new Vampire_sword();
		Blood_rage = new Blood_rage();
		Necro_helmet = new Necro_armor("helmet", 0);
	    Necro_plate = new Necro_armor("plate", 1);
	    Necro_legs = new Necro_armor("legs", 2);
	    Necro_boots = new Necro_armor("boots", 3);
		
	//
	}
	
}
