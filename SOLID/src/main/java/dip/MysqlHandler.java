package dip;

public class MysqlHandler {

    private MysqlDB mysqlDB;
    private OracleDB oracleDB;

    public MysqlHandler(MysqlDB mysqlDB) {
        this.mysqlDB = mysqlDB;
    }

    public void connect() {
        mysqlDB.connect();
    }

    public void disconnet() {
        mysqlDB.disconnect();
    }
}
