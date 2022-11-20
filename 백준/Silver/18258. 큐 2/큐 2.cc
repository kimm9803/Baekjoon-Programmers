#include <iostream>
#include <queue>
#include <string>
using namespace std;

int main()
{
	queue<int> q; //큐 선언 
	int n;
	cin >> n; //명령의 수 
	string s; //입력받을 문자열
	
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
	for (int i = 0; i < n; i++) {
		cin >> s;
		
		if (s == "push") {
			int k;
			cin >> k;
			q.push(k);
		}
		else if (s == "pop") {
			if (!q.empty()) {
				cout << q.front() << "\n";
				q.pop();
			}
			else {
				cout << "-1" << "\n";
			}
		}
		else if (s == "size") {
			cout << q.size() << "\n";
		}
		else if (s == "empty") {
			if (q.empty()) {
				cout << "1" << "\n";
			}
			else {
				cout << "0" << "\n";
			}
		}
		else if (s == "front") {
			if (!q.empty()) {
				cout << q.front() << "\n";
			}
			else {
				cout << "-1" << "\n";
			}
		}
		else if (s == "back") {
			if (!q.empty()) {
				cout << q.back() << "\n";
			}
			else {
				cout << "-1" << "\n";
			}
		}
	} 
	return 0;
}