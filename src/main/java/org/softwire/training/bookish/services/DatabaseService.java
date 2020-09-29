package org.softwire.training.bookish.services;

import io.github.cdimascio.dotenv.Dotenv;
import org.jdbi.v3.core.Jdbi;

public abstract class DatabaseService {

    private final String hostname = "127.0.0.1";
    Dotenv dotenv = Dotenv.load();
    private final String database = dotenv.get("DB_NAME");
    private final String user = dotenv.get("DB_USER");
    private final String password = dotenv.get("DB_PASS");
    private final String connectionString = "jdbc:mysql://" + hostname + "/" + database + "?user=" + user + "&password=" + password + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";
    protected final Jdbi jdbi = Jdbi.create(connectionString);
}
