package com.sparta.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingClass {

    public static Logger logger = LogManager.getLogger("Logger");

    public static void main(String[] args) {

        logger.info("This document will log information");

    }
}
