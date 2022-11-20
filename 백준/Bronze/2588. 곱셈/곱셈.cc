#include <iostream>
using namespace std;

int main()
{
	int num1, num2;

	cin >> num1;
	cin >> num2;

	int ans3 = num1 * (num2 % 10);
	int ans4 = num1 * ((num2 / 10) % 10);
	int ans5 = num1 * (num2 / 100);

	cout << ans3 << endl;
	cout << ans4 << endl;
	cout << ans5 << endl;
	cout << ans3 + ans4 * 10 + ans5 * 100 << endl;

	return 0;
}