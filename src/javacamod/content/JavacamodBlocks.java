package javacamod.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.effect.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;


import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class JavacamodBlocks{
    //walls
    public static block redWall, largeRedWall, colossalRedWall 


    ;
    
    public static void load() {
        redWall = new Wall("red-wall"){{
            requirements(Category.defense, with(Items.copper, 6));
            health = 80 * wallHealthMultiplier;
            researchCostMultiplier = 0.1f;
            envDisabled |= Env.scorching;
        }};
    
     
        largeRedWall = new Wall("large-red-wall"){{
            requirements(Category.defense, with(Items.copper, 6));
            health = 80 * wallHealthMultiplier;
            size = 2;
            researchCostMultiplier = 0.1f;
            envDisabled |= Env.scorching;
        }};

        colossalRedWall = new Wall("colossal-red-wall"){{
            requirements(Category.defense, with(Items.copper, 6));
            health = 80 * wallHealthMultiplier;
            size = 3;
            researchCostMultiplier = 0.1f;
            envDisabled |= Env.scorching;
        }};

    }
}
