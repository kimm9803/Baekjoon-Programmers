#include <iostream>
#include <algorithm>
using namespace std;

bool compare(int a, int b) {
	return a > b;
}

int main()
{
	int n;
	int sum = 0;
	cin >> n;
	int a[51] = { 0 };
	int b[51] = { 0 };

	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}
	for (int i = 0; i < n; i++) {
		cin >> b[i];
	}

	sort(a, a + n);
	sort(b, b + n, compare);

	for (int i = 0; i < n; i++) {
		sum += a[i] * b[i];
	}
	cout << sum;
	return 0;
}