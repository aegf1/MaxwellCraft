package com.JosephB.Test1.client.gui;

import com.JosephB.Test1.handler.ConfigurationHandler;
import com.JosephB.Test1.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig{
	
	public ModGuiConfig(GuiScreen guiScreen)
	{
		super(
			guiScreen,
			new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
			Reference.MOD_ID,
			false,
			false,
			GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString())
			);
	}
}
