package dao.test;

import dao.MemberDao;
import dao.OrdersDao;

public class OrdersDaoTest {
	public static void main(String[] args) {
		//testInsert();
		testInsert2();
	}
	public static void testInsert() {
		
		OrdersDao dao = new OrdersDao();
		dao.insert("20220519-0001",1L, "부산북구", 1L);
		//testInsert2();
	}
	
	public static void testInsert2() {
		
		OrdersDao dao = new OrdersDao();
		dao.insertOrderBook(1L, 1L, 1L);
	}
	
}
