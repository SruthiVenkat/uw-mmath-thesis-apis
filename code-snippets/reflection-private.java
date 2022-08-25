Class clz=Class.forName("com.mysql.cj.jdbc.ConnectionImpl");
Constructor constructor = clz.getDeclaredConstructor();
constructor.setAccessible(true);
Connection conn = (Connection)constructor.newInstance();
