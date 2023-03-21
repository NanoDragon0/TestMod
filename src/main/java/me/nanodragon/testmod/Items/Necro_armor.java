package me.nanodragon.testmod.Items;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.nanodragon.testmod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class Necro_armor extends ItemArmor {
	
	public static final ItemArmor.ArmorMaterial NECRO_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("dragoncore:necro", 66, new int[]{5, 5, 5, 5}, 30);
	public static final int addDamage = 8;
	public static final double vampirism = 0.15;
	
	public Necro_armor(String elementName, int armorType) {
        super(NECRO_ARMOR_MATERIAL, 0, armorType);
        setUnlocalizedName("necro_" + elementName);
        setTextureName(Main.MODID + ":necro_" + elementName);
        setCreativeTab(Main.tabDraconCore);
        
        GameRegistry.registerItem(this, "necro_" + elementName);
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean part4) {
        List.add("�l�6����� ������� ������:");
        List.add("");
        List.add("�l�2���� �������� ���: �r+ " + addDamage);
        List.add("�l�2���������: �r15%");
        List.add("");
        List.add("�4���������� �������");
    }
	
}
