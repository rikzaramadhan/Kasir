/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.kasir.app.core;

import id.kasir.app.models.Productpost;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public interface userInterfaceProduct {//menampung function yang akan di override atau yang akan diturunkan pada product service
        public boolean insertBarang(Productpost productpost); 
        public boolean updateBarang(Productpost productpost);
        public boolean deleteBarang(Productpost productpost);
        public boolean selectBarang(Productpost productpost);
}

