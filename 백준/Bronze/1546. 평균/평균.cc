#include <iostream>
using namespace std;

int main()
{
	int n, i;
	int test[1001] = {};
	double newTest[1001] = {};
	cin >> n;
	int max = 0; 
	double average, sum;
	
	for (i = 0; i < n; i++) { // 과목 점수 입력 
		cin >> test[i];
	}
	
	for (i = 0; i < n; i++) {
		if (max < test[i]) {
			max = test[i];
		}
	}
	
	for (i = 0; i < n; i++) {
		newTest[i] = (double)test[i] / (double)max * 100;
		sum += newTest[i];
	}
	
	average = sum / (double)n;
	cout << fixed;
	cout.precision(14);
	cout << average << endl;
	
	return 0;
}