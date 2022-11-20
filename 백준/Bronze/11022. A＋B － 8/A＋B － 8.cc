#include <iostream>
using namespace std;

int main()
{
	int T;
	cin >> T;

	for (int i = 1; i <= T; i++)
	{
		int a, b, c;
		cin >> a >> b;
		c = a + b;
		cout << "Case #" << i << ": " << a << " + " << b << " = " << c << endl;
	}
	return 0;
}