package com.josephb.test1.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityThrownProton extends EntityThrowable
{
	private float explosionRadius = 2F;
	private float speed = 2F;

	public EntityThrownProton(World world)
	{
		super(world);
		this.motionX*=speed;
		this.motionY*=speed;
		this.motionZ*=speed;
	}

	public EntityThrownProton(World world, EntityLivingBase par2EntityLivingBase)
	{
		super(world, par2EntityLivingBase);
		this.motionX*=speed;
		this.motionY*=speed;
		this.motionZ*=speed;
	}
	
	public EntityThrownProton(World world, double x, double y, double z)
	{
		super(world, x, y, z);
		this.motionX*=speed;
		this.motionY*=speed;
		this.motionZ*=speed;
	}

	@Override
	protected void onImpact(MovingObjectPosition pos) {
		// TODO Auto-generated method stub
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ,
				(float)this.explosionRadius, false);
		this.setDead();
	}
	
	@Override
	protected float getGravityVelocity()
    {
        return 0F;
    }
}