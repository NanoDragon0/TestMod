package me.nanodragon.testmod.Enchant;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class Telekinesis extends Enchantment{

	public Telekinesis() {
		super(102, 3, EnumEnchantmentType.weapon);
		setName("telekinesis");
		addToBookList(this);
	}
	
	@Override
    public int getMaxLevel() {
        return 1;
    }
	
	/*@SubscribeEvent
	public void onLivingEntityDrop(LivingDropsEvent event, EntityLivingBase entity, DamageSource source, java.util.List<EntityItem> drops, int lootingLevel, boolean recentlyHit) {
			
		System.out.println("����");
		
		/*ItemStack equip = ((EntityPlayer) event.source.getEntity()).getCurrentEquippedItem();
		if (EnchantmentHelper.getEnchantmentLevel(102, equip) > 0) { //���������
			
		}
			
	}*/
}
