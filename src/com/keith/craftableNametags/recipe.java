package com.keith.craftableNametags;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class recipe extends JavaPlugin {
	

	public void onEnable() {
		ItemStack nameTag = new ItemStack(Material.NAME_TAG);
		NamespacedKey key = new NamespacedKey(this, this.getDescription().getName());
		ShapedRecipe nameTagRecipe = new ShapedRecipe(key, nameTag);
		nameTagRecipe.shape(" SP", "SBS", "IS ");
		nameTagRecipe.setIngredient('S', Material.STRING);
		nameTagRecipe.setIngredient('B', Material.SLIME_BALL);
		nameTagRecipe.setIngredient('P', Material.PAPER);
		nameTagRecipe.setIngredient('I', Material.IRON_INGOT);
		
		Bukkit.addRecipe(nameTagRecipe);
	}
	 
	public void onDisable() {
	 
	}
}
