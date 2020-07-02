package oraclejava;

import database.Koneksi;
import java.sql.SQLException;
import view.*;
import controller.Controller;
import Model.*;

/**
 *
 * @author adit
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        new Login().show();
    }
}