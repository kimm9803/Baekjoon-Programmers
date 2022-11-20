#include <iostream>
using namespace std;

int main()
{
	int hour, minute;
	int time;
	int h, m;

	cin >> hour >> minute;
	cin >> time;

	if (minute + time > 59) {
		m = (minute + time) % 60;
		h = hour + ((minute + time) / 60);
		if (h > 23) {
			h = h % 24;
		}
	}
	else {
		m = minute + time;
		h = hour;
	}

	cout << h << " " << m << endl;

	return 0;
}