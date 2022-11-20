#include <iostream>
#include <algorithm>

using namespace std;

bool compare(int a, int b) {
	return a > b;
}
int main() {
	string num;
	cin >> num;
	
	sort(num.begin(), num.end(), compare);
	
	cout << num << endl;
	
	return 0;
}