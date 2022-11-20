#include <iostream>
#include <string>
using namespace std;

int main()
{
	int n, sum, count;
	cin >> n;
	string str;
	
	for (int i = 0; i < n; i++) {
		cin >> str;
		sum = 0;
		count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str[j] == 'O') {
				count++;
			}
			else if (str[j] == 'X') {
				count = 0;
			}
			sum += count;
		}
		cout << sum << endl;
	}
	return 0;
}