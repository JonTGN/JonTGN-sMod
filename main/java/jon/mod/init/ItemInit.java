package jon.mod.init;

import java.util.ArrayList;
import java.util.List;

import jon.mod.objects.armor.ArmorBase;
import jon.mod.objects.items.ItemBase;
import jon.mod.objects.tools.ToolAxe;
import jon.mod.objects.tools.ToolHoe;
import jon.mod.objects.tools.ToolPickaxe;
import jon.mod.objects.tools.ToolShovel;
import jon.mod.objects.tools.ToolSword;
import jon.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_DARKSTEEL = EnumHelper.addToolMaterial("tool_darksteel", 2, 600, 6.0F, 2.5F, 10);
	public static final ArmorMaterial ARMOR_DARKSTEEL = EnumHelper.addArmorMaterial("armor_darksteel", Reference.MODID + ":darksteel", 18, new int[]{3, 6, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item INGOT_DARKSTEEL = new ItemBase("ingot_darksteel");
	public static final Item POWDER_DARKSTONE = new ItemBase("powder_darkstone");
	
	//Tools
	public static final Item AXE_DARKSTEEL = new ToolAxe("axe_darksteel", TOOL_DARKSTEEL);
	public static final Item HOE_DARKSTEEL = new ToolHoe("hoe_darksteel", TOOL_DARKSTEEL);
	public static final Item PICKAXE_DARKSTEEL = new ToolPickaxe("pickaxe_darksteel", TOOL_DARKSTEEL);
	public static final Item SHOVEL_DARKSTEEL = new ToolShovel("shovel_darksteel", TOOL_DARKSTEEL);
	public static final Item SWORD_DARKSTEEL = new ToolSword("sword_darksteel", TOOL_DARKSTEEL);
	
	//Armor
	public static final Item HELMET_DARKSTEEL = new ArmorBase("helmet_darksteel", ARMOR_DARKSTEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_DARKSTEEL = new ArmorBase("chestplate_darksteel", ARMOR_DARKSTEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_DARKSTEEL = new ArmorBase("leggings_darksteel", ARMOR_DARKSTEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_DARKSTEEL = new ArmorBase("boots_darksteel", ARMOR_DARKSTEEL, 1, EntityEquipmentSlot.FEET);
}
