package com.ngconsulting.api.domain;

public enum TutorielType {

    GUIDE("GUIDE"),
    BOOK("BOOK");

    TutorielType(String type){
        this.type = type;
    }

    private String type;

    public String getValue(){
        return this.type;
    }

    public static TutorielType fromType(String type){
        switch (type) {
            case "GUIDE":
                return GUIDE;
            case "BOOK":
                return BOOK;
            default:
                return null;
        }
    }

}
