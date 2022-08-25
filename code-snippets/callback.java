ConnectionEventListener listener = new ConnectionEventListener() {
    public void connectionClosed(ConnectionEvent event) {}
    public void connectionErrorOccurred(ConnectionEvent event) {}
};
ConnectionPoolDataSource datasource = new MysqlConnectionPoolDataSource();
PooledConnection conn = datasource.getPooledConnection();
conn.addConnectionEventListener(listener);