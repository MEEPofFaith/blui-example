package bluiexample;

import blui.*;
import blui.ui.*;
import mindustry.*;
import mindustry.gen.*;
import mindustry.mod.*;

public class BLUIExample extends Mod{
    public BLUIExample(){
    }

    @Override
    public void init(){
        //A bunch of buttons. Always available.
        BLSetup.addTable(table -> {
            table.table(Tex.buttonEdge3, t -> {
                t.button(Icon.file, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
                t.button(Icon.planet, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
                t.row();
                t.button(Icon.units, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
                t.button(Icon.discord, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
                t.button(Icon.distribution, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
            });
        });

        //Another bunch of buttons. Only visible in sandbox.
        BLSetup.addTable(table -> {
            table.table(Tex.pane, t -> {
                t.button(Icon.distribution, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
                t.button(Icon.liquid, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
                t.button(Icon.power, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
                t.button(Icon.effect, BLStyles.bluiImageStyle, BLVars.iconSize, () -> {});
            });
        }, () -> Vars.state.rules.infiniteResources);
    }
}
