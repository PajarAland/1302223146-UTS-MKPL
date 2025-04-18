/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alienware
 */
public class FamilyInfo {
    public String spouseName;
    public String spouseIdNumber;
    public List<String> childNames = new LinkedList<>();
    public List<String> childIdNumbers = new LinkedList<>();

    public boolean isMarried() {
        return spouseIdNumber != null && !spouseIdNumber.equals("");
    }

    public int getNumberOfChildren() {
        return childIdNumbers.size();
    }

    public void setSpouse(String name, String idNumber) {
        this.spouseName = name;
        this.spouseIdNumber = idNumber;
    }

    public void addChild(String name, String idNumber) {
        childNames.add(name);
        childIdNumbers.add(idNumber);
    }
}
