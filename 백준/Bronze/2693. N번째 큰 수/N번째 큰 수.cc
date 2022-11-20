#include <iostream>
#include <algorithm>
using namespace std;

bool compare(int a, int b) {
	return a > b;
}

int main()
{
	int T;
	cin >> T;

	for (int i = 0; i < T; i++) {
		int a[10] = { 0 };
		for (int j = 0; j < 10; j++)
		{
			cin >> a[j];
		}
		sort(a, a + 10, compare);
		cout << a[2] << endl;
	}
	return 0;
}