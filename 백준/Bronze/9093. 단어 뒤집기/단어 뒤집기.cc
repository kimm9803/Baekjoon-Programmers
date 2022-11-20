#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main()
{

	stack<char> stk;
	int T;
	cin >> T;
	cin.ignore();
	string str;
	
	for (int i = 0; i < T; i++) {
		getline(cin,str);
		str += ' ';
		for (int j = 0; j < str.size(); j++) {
			stk.push(str[j]);
			if (str[j] == ' ') {
				stk.pop();
				while (!stk.empty()) {
					cout << stk.top();
					stk.pop();
				}
				cout << ' ';
			}
		}
		cout << endl;
	}
	return 0;
}