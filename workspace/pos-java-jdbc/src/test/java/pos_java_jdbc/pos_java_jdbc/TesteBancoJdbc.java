package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import junit.framework.TestCase;

public class TesteBancoJdbc extends TestCase {
	
	@Test
	public void initBanco() {
		SingleConnection.getConnection();
	}

}
