package com.gagandeep.developer.wellnote;

/**
 * Created by gagandeep on 2/11/2017.
 */

public class ReportStructure {

    private String head;
    private long date;
    private String details;

    public ReportStructure(String head, long date, String details){
        this.head = head;
        this.date = date;
        this.details = details;
    }

    public long getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    public String getHead() {
        return head;
    }
}
