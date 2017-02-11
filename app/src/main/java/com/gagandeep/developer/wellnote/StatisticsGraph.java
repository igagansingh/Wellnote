package com.gagandeep.developer.wellnote;

import java.io.Serializable;

/**
 * Created by gagandeep on 2/11/2017.
 */

public class StatisticsGraph implements Serializable{
    private String name;
    private int flatIcon;

    public StatisticsGraph(String name, int flatIcon){
        this.name = name;
        this.flatIcon = flatIcon;
    }

    public int getFlatIcon() {
        return flatIcon;
    }

    public String getName() {
        return name;
    }
}
