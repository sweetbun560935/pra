package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "parks")

public class Park {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "parkId")
    private int pId;

    @Nullable
    @ColumnInfo(name = "parkName")
    private String pName;
   
    @Nullable
    @ColumnInfo(name = "parkLocation")
    private String pLocation;
    
    public Park(@Nullable String name, String location, int score, String creationDate) {
        pName = name;
        pLocation = location;
        pScore = score;
        pCreationDate = creationDate;
    }

    public int getId() {
        return pId;
    }

    public void setId(int id) {
        pId = id;
    }

    public String getName() {
        return pName;
    }

    public void setName(String name) {
        pName = name;
    }

    public String getLocation() {
        return pLocation;
    }

    public void setLocation(String location) {
        pLocation = location;
    }

    public int getScore() {
        return pScore;
    }

    public void setScore(int score) {
        pScore = score;
    }

    public String getCreationDate() {
        return pCreationDate;
    }

    public void setCreationDate(String creationDate) {
        pCreationDate = creationDate;
    }

    private int pScore;
    private String pCreationDate;

}
