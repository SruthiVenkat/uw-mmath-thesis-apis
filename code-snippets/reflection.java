Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Driver driver=(java.sql.Driver)clazz.newInstance();
