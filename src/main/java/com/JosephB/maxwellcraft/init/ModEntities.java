package com.josephb.maxwellcraft.init;

import com.josephb.maxwellcraft.entity.EntityThrownAntiProton;
import com.josephb.maxwellcraft.entity.EntityThrownProton;
import com.josephb.maxwellcraft.reference.Reference;
import com.josephb.maxwellcraft.renderers.RenderEntityAntiProton;
import com.josephb.maxwellcraft.renderers.RenderEntityProton;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Class with methods to register all entities in mod
 * @author Joseph
 *
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModEntities 
{
	
	public static void init(Object mod)
	{
		EntityRegistry.registerModEntity(EntityThrownProton.class, "Proton", 1, mod, 200, 1, true );
		EntityRegistry.registerModEntity(EntityThrownAntiProton.class, "AntiProton", 2, mod, 200, 1, true );

		//Do this for every entity
	}
	
	@SideOnly(Side.CLIENT)
	public static void initRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityThrownProton.class,new RenderEntityProton());
		RenderingRegistry.registerEntityRenderingHandler(EntityThrownAntiProton.class,new RenderEntityAntiProton());
		//Do this for every entity
	}
	
}