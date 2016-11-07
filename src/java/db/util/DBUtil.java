/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thomasol
 */
public class DBUtil {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Books_PU");

    public static EntityManagerFactory getEmf() {
        return emf;
    }
    
}
