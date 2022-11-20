#include <iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	for (int i = 1; i <= n; i++) {
		cout << i << "\n";
	}
	return 0;
}