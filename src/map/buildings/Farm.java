package map.buildings;

import main.ResourceTypes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Farm extends Building {
    public Farm() {
        this.buildingImage = new ImageIcon("textures\\buildings\\Farm.png");
        this.type = "Farm";
        this.resourceCost.put(ResourceTypes.WOOD, 5);
        this.resourceHarvestAmount = new HashMap<>();
        this.claimedResourceTiles = new ArrayList<>();
        this.resourceHarvestAmount.put(ResourceTypes.FOOD, 0);

        this.maxHealth = 150;
        this.currentHealth = maxHealth;
    }
}
