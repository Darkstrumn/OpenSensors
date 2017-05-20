package pcl.opensensors.common;

import com.sun.prism.Material;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import pcl.opensensors.client.CreativeTab;
import pcl.opensensors.common.blocks.BlockSensor;
import pcl.opensensors.common.items.ItemWorldSensor;
import pcl.opensensors.common.tileentity.TileEntitySensor;

public class ContentRegistry {
	public static Block sensorBlock;
	public static Item  worldSensor;
	
	public static CreativeTabs CreativeTab;
	
	public static void preInit() {
        registerTabs();
        registerBlocks();
        registerItems();
        registerRecipes();
	}

	public static void init() {
		// TODO Auto-generated method stub
		
	}

	private static void registerTabs() {
		 CreativeTab = new CreativeTab("OpenSensors");
	}
	
	private static void registerBlocks() {
		sensorBlock = new BlockSensor();
		GameRegistry.registerBlock(sensorBlock, "sensor");
		sensorBlock.setCreativeTab(CreativeTab);
		GameRegistry.registerTileEntity(TileEntitySensor.class, "SensorTE");
	}
	
	private static void registerItems() {
		worldSensor = new ItemWorldSensor();
		GameRegistry.registerItem(worldSensor, "opensensors.worldSensor");
		worldSensor.setCreativeTab(CreativeTab);
	}
	
	private static void registerRecipes() {
		
	}
	
}
