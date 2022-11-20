#include <iostream>
#include <algorithm>

using namespace std;
bool compare(int a, int b) {
	return a > b;
}
int main()
{
	int i;
	int w_sum = 0;
	int k_sum = 0;
	int w_uni[10] = { 0 };
	int k_uni[10] = { 0 };
	for (i = 0; i < 10; i++) {
		cin >> w_uni[i];
	}
	for (i = 0; i < 10; i++) {
		cin >> k_uni[i];
	}
	sort(w_uni, w_uni + 10, compare);
	sort(k_uni, k_uni + 10, compare);
	
	for (i = 0; i < 3; i++) {
		w_sum += w_uni[i];
		k_sum += k_uni[i];
	}

	cout << w_sum << " " << k_sum << endl;

	return 0;
}