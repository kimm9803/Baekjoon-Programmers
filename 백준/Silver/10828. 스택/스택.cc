#include <iostream>
#include <stack>
using namespace std;

int main()
{
	int n, x;
	cin >> n;
	stack<int> stk;
	string str;
	
	for (int i = 0; i < n; i++) {
		cin >> str;
		if (str == "push") {
			cin >> x;
			stk.push(x);
		}
		else if (str == "top") {
			if (!stk.empty())
				cout << stk.top() << '\n';
			else
				cout << "-1" << '\n';
		}
		else if (str == "size") {
			cout << stk.size() << '\n';
		}
		else if (str == "empty") {
			if (stk.empty())
				cout << "1" << '\n';
			else
				cout << "0" << '\n';
		}
		else if (str == "pop") {
			if (!stk.empty()) {
				cout << stk.top() << '\n';
				stk.pop();
			}
			else {
				cout << "-1" << '\n';
			}
		}
	}
	return 0;
}