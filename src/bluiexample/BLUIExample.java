package bluiexample;

import blui.*;
import blui.ui.*;
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
    }
}
