package util;

import java.util.StringTokenizer;

//This is an example class to be used for A4 Task1 and Task2
public class Counter {
    public int _ctr;
    public int _multiplier;

    // Task 1: Increment Fix
    public void increment() {
        _ctr++; // Corrected increment
    }

    // Task 2: Decrement Fix
    public void decrement() {
        _ctr--; // Corrected decrement
    }

    // Task 3: Reset Fix
    public void reset() {
        _ctr = 0; // Corrected reset, _ctr should be 0
    }

    // method multiplies _ctr by n
    public void multiplyBy(int multiplier) {
        _multiplier = multiplier; // no fault here
        _ctr = _ctr * _multiplier; // no fault here
    }
// TODO: dev1- method for increment to closest even number
public void incrementToEven() {
	if (_ctr % 2 != 0) {
        _ctr++; // Increment if current value is odd to make it even
    }
}

    // TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		if (_ctr % 2 != 0) {
			_ctr--; // Decrement if current value is odd to make it even
		}
	}
// TODO: dev2- method for increment to closest prime number
public void incrementToPrime() {
	_ctr = getNextPrime(_ctr);
}

// Helper method to find the next prime number
private int getNextPrime(int number) {
	while (!isPrime(++number)) {
		// Increment until a prime number is found
	}
	return number;
}

// Helper method to check if a number is prime
private boolean isPrime(int num) {
	if (num < 2) {
		return false;
	}
	for (int i = 2; i <= Math.sqrt(num); i++) {
		if (num % i == 0) {
			return false;
		}
	}
	return true;
}

// TODO: dev2- method for decrement to closest prime number
public void decrementToPrime() {
	_ctr = getPreviousPrime(_ctr);
}

// Helper method to find the previous prime number
private int getPreviousPrime(int number) {
	while (!isPrime(--number)) {
		// Decrement until a prime number is found
	}
	return number;
}

// Helper method to check if a number is prime
private boolean isPrime1(int num) {
	if (num < 2) {
		return false;
	}
	for (int i = 2; i <= Math.sqrt(num); i++) {
		if (num % i == 0) {
			return false;
		}
	}
	return true;
}
	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {
		_ctr = -99;
	}
}
