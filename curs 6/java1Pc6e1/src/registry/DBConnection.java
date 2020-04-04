package registry;

import java.util.HashMap;
import java.util.Map;

public class DBConnection {
    // prin registry, vom avea o singura instanta de DBConnection
    // pentru DB_1 o singura instanta de DBConnection
    // pentru DB_2

    enum Database {
        DB_1, DB_2
    }

    private static Map<Database, DBConnection> registry = new HashMap<>();

    private DBConnection(Database db) {
        System.out.println("Ne-am conectat la " + db);
    }

    public static DBConnection getInstance(Database db) {
        registry.computeIfAbsent(
                db,
                database -> new DBConnection(database)
        );
        //registry.putIfAbsent(db, new DBConnection());

        return registry.get(db);
    }


}
