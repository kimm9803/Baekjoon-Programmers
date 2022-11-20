#include <iostream>
using namespace std;

int main()
{
	int i, temp, index, min;
	int n;
	int array[1001];
	
	cin >> n; // 수의 개수 
	for (i = 0; i < n; i++) {
		cin >> array[i];
	}
	
	for (i = 0; i < n; i++) {
		min = 1001;
		for(int j = i; j < n; j++) {
			if (min > array[j]) {
				min = array[j];
				index = j; //최소값 위치 
			}
		}
		temp = array[i];
		array[i] = array[index];
		array[index] = temp;
	}
	
	for (i = 0; i < n; i++) {
		cout << array[i] << endl;
	}
	return 0;
}