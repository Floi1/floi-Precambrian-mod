
package net.floisprecambrian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ZirconitemItem extends Item {
	public ZirconitemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
