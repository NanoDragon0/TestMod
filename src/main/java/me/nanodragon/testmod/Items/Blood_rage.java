package me.nanodragon.testmod.Items;

import java.util.List;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.nanodragon.testmod.Main;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class Blood_rage extends ItemSword{
	
	static final ToolMaterial bloodrage = EnumHelper.addToolMaterial("BLOODRAGE", 3, 700, 10F, 5.5F, 18);

	public Blood_rage() {
		super(bloodrage);
		this.setUnlocalizedName("blood_rage");
        this.setTextureName(Main.MODID + ":blood_rage");
        this.setMaxStackSize(1);
        this.setCreativeTab(Main.tabDraconCore);
        
        GameRegistry.registerItem(this, "blood_rage");
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean part4) {
        List.add("§l§6Восстанавливает 10% §4♥§r§7§l от нанесённого урона");
        List.add("");
        List.add("§4Креативный предмет");
    }
}
