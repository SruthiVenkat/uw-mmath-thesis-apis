ServiceLoader<java.sql.Driver> services = ServiceLoader.load(java.sql.Driver.class);
java.sql.Driver driver = services.iterator().next();
java.sql.Connection conn = driver.connect("jdbc:mysql:foo",null);
