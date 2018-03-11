package nl.herotech.ICTMOD;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = "ict", name = "ICTMOD", version = "1.0")
public class ICTMOD {
	//items
	public static Item pk;
	public static Item plastic;
	public static Item chip;
	public static Item flas;
	public static Item PCB;
	public static Item moederbord;
	public static Item con;
	public static Item vc;
	public static Item fanb;
	public static Item fan;
	public static Item nex;
	public static Item wf;
	public static Item ssd;
	public static Item sd;
	public static Item scherm;
	public static Item beelddcherm;
	
		//items desktop
		public static Item DCPU;
		public static Item Dbehuizing;
		public static Item Dram;
		
		//items laptop
		public static Item lCPU;
		public static Item lram;
		public static Item lbehuizing;
		
		//items telephone
		public static Item mCPU;
		public static Item mram;
		public static Item mbehuizing;
		
		//items servers
		
		
		//items router
		
		
		//items switch
		
		
		//items usb
	
	
	//blocks
	public static Block blockLaptop;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//item/block init an reg
		//config handling
		
		//items tex
		pk = new pk().setUnlocalizedName("pk").setTextureName("ict:pk");
		plastic = new plastic().setUnlocalizedName("plastic").setTextureName("ict:plastic");
		chip = new chip().setUnlocalizedName("chip").setTextureName("ict:chip");
		flas = new flash().setUnlocalizedName("flash").setTextureName("ict:flash");
		PCB = new PCB().setUnlocalizedName("PCB").setTextureName("ict:pcb");
		moederbord = new moederbord().setUnlocalizedName("moederbord").setTextureName("ict:dmoed");
		con = new connect().setUnlocalizedName("connect");
		vc = new vc().setUnlocalizedName("vc");
		fanb = new fanb().setUnlocalizedName("fanb");
		fan = new fan().setUnlocalizedName("fan");
		nex = new nex().setUnlocalizedName("nex");
		wf = new wf().setUnlocalizedName("wf");
		ssd = new ssd().setUnlocalizedName("ssd");
		sd = new sd().setUnlocalizedName("sd");
		
			//items desktop tex
			DCPU = new DCPU().setUnlocalizedName("DCPU").setTextureName("ict:dcpu");
			Dram = new Dram().setUnlocalizedName("Dram").setTextureName("ict:dram");
		
		
		//blocks
		blockLaptop = new BlockLaptop(Material.iron).setBlockName("BlockLaptop");
		
		//GRitems
		GameRegistry.registerItem(pk, pk.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(plastic, plastic.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chip, chip.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PCB, PCB.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(moederbord, moederbord.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(con, con.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(vc, vc.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fanb, fanb.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fan, fan.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(nex, nex.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wf, wf.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ssd, ssd.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sd, sd.getUnlocalizedName().substring(5));
		
			//GRitems desktop
			GameRegistry.registerItem(DCPU, DCPU.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(Dram, Dram.getUnlocalizedName().substring(5));
		
		
		//GRblocks
		GameRegistry.registerBlock(blockLaptop, blockLaptop.getUnlocalizedName().substring(5));
		System.out.println(blockLaptop.getUnlocalizedName().substring(5));
	}
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		//proxy, tileentity, entity gui and pacet reg
		
		//REitems
		GameRegistry.addRecipe(new ItemStack(pk, 6), new Object[] {"zzz","cbc","zzz",'z',Blocks.sand, 'c',Items.clay_ball, 'b',Items.bone});
		GameRegistry.addRecipe(new ItemStack(PCB), new Object[] {"ppp","grg","ppp", 'p',plastic, 'g',Items.gold_ingot, 'r',Items.redstone});
		GameRegistry.addRecipe(new ItemStack(chip),new Object[] {" d ","iri","ppp", 'd',Items.diamond, 'i',Items.iron_ingot, 'r',Items.redstone, 'p',plastic});
		GameRegistry.addRecipe(new ItemStack(flas), new Object[] {" c ","cdc"," c ", 'c',chip, 'd',Items.diamond});
		GameRegistry.addRecipe(new ItemStack(moederbord), new Object[] {"ccc","rcr","ppp", 'c',chip, 'r',Items.redstone, 'p',PCB});
		
			//REitems destop
			GameRegistry.addRecipe(new ItemStack(DCPU), new Object[] {"iii","idi","PcP", 'i',Items.iron_ingot, 'd',Items.diamond, 'P',PCB, 'c',chip});
			GameRegistry.addRecipe(new ItemStack(Dram), new Object[] {"ccc","rdr","ppp", 'c',chip, 'r',Items.redstone, 'd',Items.diamond, 'p',PCB});
		
		//CAitems
		GameRegistry.addSmelting(pk,new ItemStack(plastic), 5);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
