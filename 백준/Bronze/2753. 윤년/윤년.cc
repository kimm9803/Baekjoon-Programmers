#include <iostream>
using namespace std;

int main()
{
	int year;

	cin >> year;

	if (year % 4 == 0 and (not(year % 100 == 0) or (year % 400 == 0))) {
		cout << "1" << endl;
	}
	else {
		cout << "0" << endl;
	}
	return 0;
}