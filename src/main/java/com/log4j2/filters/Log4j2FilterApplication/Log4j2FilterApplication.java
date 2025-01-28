package com.log4j2.filters.Log4j2FilterApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2FilterApplication {
	private static final Logger logger = LogManager.getLogger(Log4j2FilterApplication.class);

	public static void main(String[] args) {
		System.setProperty("log4j.configurationFile", "src/main/resources/log4j2.xml");

		logger.info("SELECT * FROM users WHERE id = 1");
		logger.info("User login successful");

		System.out.println("Se o filtro estiver funcionando, a mensagem SELECT não aparecerá no log.");
		System.out.println("Configuração carregada: " + System.getProperty("log4j.configurationFile"));
	}
}

