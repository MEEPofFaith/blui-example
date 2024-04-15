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
        BLSetup.addTable(table -> {
            table.table(Tex.buttonEdge3, t -> {
                t.button(Icon.file, BLVars.buttonSize, () -> {});
                t.button(Icon.planet, BLVars.buttonSize, () -> {});
                t.row();
                t.button(Icon.units, BLVars.buttonSize, () -> {});
                t.button(Icon.discord, BLVars.buttonSize, () -> {});
                t.button(Icon.distribution, BLVars.buttonSize, () -> {});
            });
        });

        BLSetup.addTable(table -> {
            table.table(Tex.pane, t -> {
                t.button(Icon.distribution, BLVars.buttonSize, () -> {});
                t.button(Icon.liquid, BLVars.buttonSize, () -> {});
                t.button(Icon.power, BLVars.buttonSize, () -> {});
                t.button(Icon.effect, BLVars.buttonSize, () -> {});
            });
        }, () -> Vars.state.rules.infiniteResources);
    }
}
