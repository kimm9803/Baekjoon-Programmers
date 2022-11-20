#include <iostream>
using namespace std;

int distance_width(int x, int w) {
	if (w - x > x) {
		return x;
	}
	else {
		return (w - x);
	}
}

int distance_height(int y, int h) {
	if (h - y > y) {
		return y;
	}
	else {
		return (h - y);
	}
}

int main()
{
	int x, y, w, h;
	cin >> x >> y >> w >> h;
	
	int a = distance_width(x, w);
	int b = distance_height(y, h);
	
	if (a > b) {
		cout << b;
	}
	else {
		cout << a;
	}
	return 0;

}