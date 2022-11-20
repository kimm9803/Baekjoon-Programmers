#include <iostream>
using namespace std;

int main() {
	int A, B, C, reward = 0, max = 0;
	cin >> A >> B >> C;
	if (A == B && B == C) { //A==B==C 했다가 틀림
		reward = 10000 + A * 1000;
	}
	else if (A == B || A == C || B == C) {
		if (A == B || A == C) {
			reward = 1000 + A * 100;
		}
		else reward = 1000 + B * 100;
	}
	else {
		max = A;
		if (B > A && B > C) max = B;
		else if (C > A && C > B) max = C;
		reward = max * 100;
	}

	cout << reward << endl;
	return 0;
}

