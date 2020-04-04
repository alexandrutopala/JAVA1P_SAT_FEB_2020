package registry;

import builder.Casa;

import static registry.DBConnection.Database.*;

public class Exemplu2 {

    public static void main(String[] args) {
        DBConnection con1 = DBConnection.getInstance(DB_1);
        DBConnection con2 = DBConnection.getInstance(DB_2);
        DBConnection con3 = DBConnection.getInstance(DB_1);
    }
}
