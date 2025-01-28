package com.log4j2.filters.Log4j2FilterApplication;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2FilterTest {
	static {
		System.setProperty("log4j.configurationFile", "src/test/resources/log4j2-test.xml");
	}

	private static final Logger logger = LogManager.getLogger(Log4j2FilterTest.class);

	public static void main(String[] args) {
		logger.info("SELECT * FROM users WHERE id = 1");
		logger.info("User login successful");

		System.out.println("Se o filtro estiver funcionando, a mensagem SELECT não aparecerá no log.");
	}
}
