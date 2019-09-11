package cs301.birthdaycake;

import android.content.Context;

import java.util.jar.Attributes;

public class CakeController {

    private CakeView viewOfCake;

    public CakeController(CakeView cakeV){

        viewOfCake = cakeV;
        CakeModel cakeM = cakeV.getCakeModel();

    }



}
