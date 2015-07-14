package com.JosephB.Test1;

import com.JosephB.Test1.handler.ConfigurationHandler;
import com.JosephB.Test1.proxy.IProxy;
import com.JosephB.Test1.reference.Reference;
import com.JosephB.Test1.utility.LogHelper;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME , version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Test1 
{
	
	@Mod.Instance(Reference.MOD_ID)
	public static Test1 Instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Code for config, blocks, items etc
		LogHelper.info("PreInit Stage");
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		//Code for GUIs, tile entities, recipes etc
		LogHelper.info("Init Stage");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		//??
		LogHelper.info("PostInit Stage");
	}
}
