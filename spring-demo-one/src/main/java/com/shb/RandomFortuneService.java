package com.shb;

public class RandomFortuneService implements FortuneService {

	private String fortunes[] = { "You will win $1.", "You will lose $1.", "You will be $1." };

	@Override
	public String getFortune() {
		int index = ((int) (Math.random() * 10)) % 3;
		return fortunes[index];
	}

}
