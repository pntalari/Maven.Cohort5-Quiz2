package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal{

    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    String migrationMonth = "";

    public String color(){
        return "red";
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    public Integer speed(){
        return 10;
    }


}
