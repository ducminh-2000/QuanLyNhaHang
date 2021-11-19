/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.MonAn;
import java.util.ArrayList;

/**
 *
 * @author Theu
 */
public class MonAnDAO extends DAO{
    public MonAnDAO() {
        super();
    }
    public ArrayList<MonAn> timkiemMonAn(String key){
        ArrayList<MonAn> result = new ArrayList<MonAn>();
        return result;
    }
    public boolean capnhatmonan(MonAn ma){
        return true;
    }
}
