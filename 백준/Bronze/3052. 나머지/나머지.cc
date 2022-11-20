#include <iostream>
using namespace std;

int main()
{
	int count[42] = {};
	int n;
	int sum = 0;
	
	for (int i = 0; i < 10; i++) {
		cin >> n;
		
		count[n % 42]++;
	}
	
	for (int k = 0; k < 42; k++) {
		if (count[k] > 0){
			sum++;
		}
	}
	cout << sum << endl;
	
	return 0;
}