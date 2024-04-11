package bluiexample;

import blui.ui.*;
import mindustry.mod.*;

public class BLUIExample extends Mod{

    public BLUIExample(){
    }

    @Override
    public void init(){
        BLSetup.addTable(t -> t.add("help"));
    }
}
