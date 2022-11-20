#include <iostream>
#include <string>
using namespace std;

int main() {
	string str;
	
	while(1) {
		cin >> str;
		int flag = 0;
		if (str == "0") break;
		for (int i = 0; i < str.size()/2; i++) {
			if (str[i] != str[str.size() - 1 - i]) {
				cout << "no" << '\n';
				flag = 1;
				break;
			}
		}
		if(!flag) {
			cout << "yes" << '\n';
		}
	}
	return 0;
}