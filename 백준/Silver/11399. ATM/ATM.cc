#include <iostream>
using namespace std;

int main()
{
	int n, i, temp;
	int time[1001] = {};
	int addTime[1001] = {};
	cin >> n; //사람의 수 
	
	for (i = 0; i < n; i++) {
		cin >> time[i]; //돈을 인출하는 시간을 각 원소에  저장 
	}
	
	for (i = 0; i < n; i++) {
		for (int j = 0; j < n-1-i; j++) {
			if (time[j] > time[j+1]) {
				temp = time[j];
				time[j] = time[j+1];
				time[j+1] = temp;
			}
		}
	}
	int sum = 0;
	for (i = 0; i < n; i++) {
		sum = sum + (time[i]*(n-i));
	}
	cout << sum << endl;
	return 0;
}