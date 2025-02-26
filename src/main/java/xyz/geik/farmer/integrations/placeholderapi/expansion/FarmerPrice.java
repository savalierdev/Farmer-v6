package xyz.geik.farmer.integrations.placeholderapi.expansion;

import org.bukkit.entity.Player;
import xyz.geik.farmer.helpers.Settings;
import xyz.geik.farmer.integrations.placeholderapi.PlaceholderExecutor;

/**
 * FarmerPrice expansion class
 *
 * @author Amowny
 * @since v6-b003
 */
public class FarmerPrice extends PlaceholderExecutor {

    /**
     * Constructor for the FarmerPrice placeholder
     */
    public FarmerPrice() {
        super("getFarmerPrice");
    }

    /**
     * Executes the FarmerPrice placeholder.
     * @param player
     * @param string
     * @return farmer price
     */
    public String execute(Player player, String string) {
        return Settings.farmerPrice + "";
    }
}
