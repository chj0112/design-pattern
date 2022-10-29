import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasswordDaoImpl implements PasswordDao {
    final static String DB_FILE_NAME = "website.db";
    final static String DB_TABLE_NAME = "sites";

    Connection connection = null;
    ResultSet rs = null;
    Statement statement = null;

    public PasswordDaoImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            final String table = " (url TEXT PRIMARY KEY, id TEXT, password TEXT)";

            // create table
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(PasswordInfo p) {
        try {
            String fmt = "INSERT INTO %s VALUES('%s', '%s', '%s')";
            String q = String.format(fmt, DB_TABLE_NAME, p.getUrl(), p.getId(), p.getPassword());

            statement.execute(q);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<PasswordInfo> findAll() {
        ArrayList<PasswordInfo> sites = new ArrayList<PasswordInfo>();
        try {
            rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME);
            while (rs.next()) {
                sites.add(new PasswordInfo(rs.getString("url"), rs.getString("id"),
                        rs.getString("password")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return sites;
    }

    public PasswordInfo findByKey(String url) {
        PasswordInfo site = null;
        try {
            String fmt = "SELECT * FROM %s WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);
            rs = statement.executeQuery(q);
            if (rs.next()) {
                 site = new PasswordInfo(rs.getString("url"), rs.getString("id"),
                        rs.getString("password"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return site;
    }

    public void update(PasswordInfo p) {
        if (p != null) {
            try {
                String fmt = "UPDATE %s SET id = '%s', password = '%s' WHERE url = '%s'";
                String q = String.format(fmt, DB_TABLE_NAME, p.getId(), p.getPassword(), p.getUrl());

                statement.execute(q);
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(String url) {
        try {
            String fmt = "DELETE FROM %s WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);

            statement.execute(q);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(PasswordInfo p) {
        delete(p.getUrl());
    }
}