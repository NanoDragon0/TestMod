package me.nanodragon.testmod.Items;

import java.util.List;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.nanodragon.testmod.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class HP_rod extends Item {
	private boolean checkDoubleClick = true;

	public HP_rod() {
		
        this.canRepair = false;
        this.setUnlocalizedName("hp_rod");
        this.setTextureName("minecraft:blaze_rod");
        this.setCreativeTab(Main.tabDraconCore);
        this.maxStackSize = 10;
        
        GameRegistry.registerItem(this, "hp_rod");
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par4) {
        List.add("§lДобавляет 1 §4♥");
        List.add("§4Креативный предмет");
    }
	
	@Subscribe
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		
		if (itemStack.getItem().getUnlocalizedName().equals(this.getUnlocalizedName()) && itemStack.stackSize > 0) {
			if (checkDoubleClick) {
				checkDoubleClick = !checkDoubleClick;
			} else {
				
				if (player.getMaxHealth() < 40) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).applyModifier(new AttributeModifier("HP_ADD", 2.0D, 0).setSaved(true));
					player.getHeldItem().stackSize -= 1;
				} else {
					player.addChatMessage(new ChatComponentText("§6Вы уже имеете §lмаксимальное§f§6 количество дополнительного здоровья"));
				}
				
				
				checkDoubleClick = !checkDoubleClick;
			}
			
			
		}
        
		
        return itemStack;
    }
}
