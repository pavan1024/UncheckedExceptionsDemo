package com.epam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UncheckedExceptionsDemo {

	private void exceptions() {

		int a = 1;
		int b = 0;

		try {
			log.info("" + a / b);
		} catch (ArithmeticException ex) {
			log.info(ex.getMessage());
		}

		UncheckedExceptionsDemo uc = null;
		try {
			uc.exceptions();
		} catch (NullPointerException ex) {
			log.info(ex.getMessage());
		}

		int[] array = new int[5];
		try {
			array[9] = 1;
		} catch (ArrayIndexOutOfBoundsException ex) {
			log.info(ex.getMessage());
		}

	}

	public static void main(String[] args) {

		new UncheckedExceptionsDemo().exceptions();
	}

}
