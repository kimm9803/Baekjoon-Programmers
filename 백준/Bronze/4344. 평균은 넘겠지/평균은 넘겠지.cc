#include <iostream>
using namespace std;

int main()
{
	int c; // 테스트 케이스 개수
	int n; // 학생 수
	int scores[1001] = {};
	double average, aws;
	int sum, count;

	cin >> c;

	for (int i = 0; i < c; i++) {
		cin >> n;
		count = 0;
		sum = 0;
		for (int j = 0; j < n; j++) {
			cin >> scores[j];
			sum += scores[j];
		}
		average = (double)sum / (double)n;
		
		for (int k = 0; k < n; k++) {
			if (scores[k] > average) {
				count++;
			}
		}
		aws = (double)count / (double)n * 100;
		cout << fixed;
		cout.precision(3);
		cout << aws << "%" << endl;
	}
	return 0;
}