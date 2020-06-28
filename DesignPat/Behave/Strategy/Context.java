package DesignPat.Behave.Strategy;

public  class Context {
	Strategy stategy;

	Context(Strategy stategy){
		this.stategy = stategy;
	}

	String executeStrategy(String loc) {
		return stategy.build(loc);
	}

}
