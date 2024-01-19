package util;

import java.util.StringTokenizer;

public class Counter {
    public int _ctr;
    public int _multiplier;

    // method increments _ctr
    public void increment() {
        _ctr++; // corrected increment
    }

    // method decrements _ctr
    public void decrement() {
        _ctr--; // corrected decrement
    }

    // method resets _ctr
    public void reset() {
        _ctr = 0; // corrected reset, _ctr should be 0
    }

    // method multiplies _ctr by n
    public void multiplyBy(int multiplier) {
        _multiplier = multiplier; // no fault here
        _ctr = _ctr * _multiplier; // no fault here
    }

    // TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		_ctr = -99;
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		_ctr = -99;
	}

	// TODO: dev2- method for increment to closest prime number
	public void incrementToPrime() {
		_ctr = -99;
	}

	// TODO: dev2- method for decrement to closest prime number
	public void decrementToPrime() {
		_ctr = -99;
	}

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {
		_ctr = -99;
	}

}