package com.JosephB.Test1;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="Test1", name="Test1", version="1.0")
public class Test1 
{
	
	@Mod.Instance("Test1")
	public static Test1 Instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Code for config, blocks, items etc
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		//Code for GUIs, tile entities, recipes etc
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		//??
	}
}
