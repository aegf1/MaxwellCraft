package com.josephb.test1.creativetab;

import com.josephb.test1.init.ModItems;
import com.josephb.test1.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTest1 
{
	public static final CreativeTabs Test1_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.proton;
		}
		
		
	};

	
}