package com.JosephB.maxwellcraft.commands;

import java.util.ArrayList;
import java.util.List;

import com.JosephB.maxwellcraft.utility.physics.EMField;
import com.JosephB.maxwellcraft.utility.physics.Vector3;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class GetBField implements ICommand
{
	private List aliases;
	public GetBField()
	{
		this.aliases = new ArrayList();
		aliases.add("bfield");
	}
	
	@Override
	public int compareTo(ICommand arg0) 
	{
		return 0;
	}

	@Override
	public String getCommandName() 
	{
		return "getbfield";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) 
	{
		
		return "getbfield <x> <y> <z>";
	}

	@Override
	public List getCommandAliases() 
	{
		return aliases;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		if(args.length == 3)
		{
			double x = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);
			double z = Double.parseDouble(args[2]);
			sender.addChatMessage(new TextComponentString(EMField.getBField(new Vector3(x,y,z)).toString()));
		}
		else
		{
			sender.addChatMessage(new TextComponentString("Invalid agruments"));
		}
		
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) 
	{
		return false;
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) 
	{
		return true;
	}

	@Override
	public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args,
			net.minecraft.util.math.BlockPos pos) 
	{
		return null;
	}

}