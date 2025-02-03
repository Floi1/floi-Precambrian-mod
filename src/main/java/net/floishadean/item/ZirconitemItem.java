
package net.floishadean.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ZirconitemItem extends Item {
	public ZirconitemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
