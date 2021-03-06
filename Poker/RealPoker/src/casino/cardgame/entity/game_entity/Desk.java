//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : Desk.java
//  @ Date : 5/27/2012
//  @ Author : sangdn
//
//
package casino.cardgame.entity.game_entity;

import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.SFSObject;

public class Desk {

    protected int m_iDeskId;
    protected User m_user;
    protected DeskState m_deskState;
    private Double m_chip;
    
    //khoatd: 0 - first; 1 - second; 2 - third; 3 - last; 4 - Loose(móm); -1 - no result.
//    private int m_result;
    
    public DeskState getDeskState() {
        return m_deskState;
    }

    public int getDeskId() {
        return m_iDeskId;
    }

    public User getUser() {
        return m_user;
    }

    public Desk setDeskState(DeskState m_deskState) {
        this.m_deskState = m_deskState;
        return this;
    }

    public Desk setDeskId(int m_iDeskId) {
        this.m_iDeskId = m_iDeskId;
        return this;
    }

    public Desk setUser(User m_user) {
        this.m_user = m_user;
        return this;
    }

//    public int getResult() {
//        return m_result;
//    }
//    public void setResult(int m_result) {
//        this.m_result = m_result;
//    }

    public Double getChip() {
        return m_chip;
    }
    public void setChip(Double m_chip) {
        this.m_chip = m_chip;
    }
}
