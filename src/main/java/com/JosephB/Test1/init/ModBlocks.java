package com.josephb.test1.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.josephb.test1.block.BlockMagnet;
import com.josephb.test1.block.BlockTest1;
import com.josephb.test1.item.*;
import com.josephb.test1.reference.Reference;

/**
 * Class with methods to initialise all blocks in mod
 * @author Joseph
 *
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockTest1 magnet = new BlockMagnet();
		//Do this for every block
	
	public static void init()
	{
		GameRegistry.registerBlock(magnet, magnet.getName());
		//Do this for every block
	}
	
	public static void initRenders()
	{
		registerBlockItemRender(magnet);
		//Do this for every block
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerBlockItemRender(BlockTest1 block)
	{
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((BlockTest1) block).getName(), "inventory"));
	}
}