package jm.task.core.jdbc.dao;

public enum sqlExecute {

    CREATE("CREATE TABLE IF NOT EXISTS users\n" +
            "(\n" +
            "    id       BIGINT      NOT NULL AUTO_INCREMENT,\n" +
            "    name     VARCHAR(15) NOT NULL,\n" +
            "    lastname VARCHAR(15) NOT NULL,\n" +
            "    age      TINYINT     NOT NULL,\n" +
            "    PRIMARY KEY (id)\n" +
            ")"),
    DROP("DROP TABLE IF EXISTS users"),
    SAVE("INSERT INTO users (name, lastname, age) VALUE (?, ?, ?)"),
    REMOVE("DELETE FROM users WHERE id = ?"),
    REMOVE_ALL("DELETE FROM users"),
    SELECT("SELECT * FROM users");

    String QUERY;
    sqlExecute(String QUERY) {
        this.QUERY = QUERY;
    }
}
