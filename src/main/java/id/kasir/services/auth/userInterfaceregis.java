/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.app.core;

import kasir.app.models.registrationPost;

/**
 *
 * @author SYAFRINA DYAH
 */
public interface userInterfaceregis { 
// untuk menampung function yang akan di override atau yang akan diturunkan pada registrasi service
    public boolean functionInsert(registrationPost registrationPost); 
}
// fungsi user interface untuk nampung method function