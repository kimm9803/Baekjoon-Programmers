#include <iostream>
#include <stack>
using namespace std;

int main()
{
	stack<int> stk;
	int k, n;
	int sum = 0;
	cin >> k; //정수의 개수
	for (int i = 0; i < k; i++) {
		cin >> n;
		stk.push(n);
		if (n == 0) {
			stk.pop();
			stk.pop();
		}
	}
	
	while (!stk.empty()) {
		sum += stk.top();
		stk.pop();
	}
	
	cout << sum << endl;
	return 0;
}