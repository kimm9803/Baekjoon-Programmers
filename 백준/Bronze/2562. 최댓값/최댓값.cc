#include <iostream>
using namespace std;

int main()
{
	int test[9];
	int count;
	int max = test[0];
	for (int i = 0; i < 9; i++) {
		cin >> test[i];
		if (max < test[i]) {
			max = test[i];
			count = i+1;
		}
	}
	cout << max << endl;
	cout << count << endl;

	return 0;
}
