package com.shb;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = { "The sheep will take flight!", "The moon will reiginite!",
			"Your dead cells will reanimate!" };

	@Override
	public String getFortune() {
		Random randomGen = new Random();
		int index = randomGen.nextInt(fortunes.length);

		return fortunes[index];
	}

}
