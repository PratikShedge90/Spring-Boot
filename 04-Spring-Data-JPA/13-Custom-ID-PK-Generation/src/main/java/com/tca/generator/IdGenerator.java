package com.tca.generator;

import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class IdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		
		String id="";
		
		Random r = new Random();
		int a = r.nextInt(0,9);
		int b = r.nextInt(9);
		int c = r.nextInt(9);
		int d = r.nextInt(9);
		
		id = "TCA-" +a+b+c+d;
		
		return id;
	}

}
