#include <iostream>
using namespace std;

int main()
{
	int a, b, c;
	int mul;
	int test[10] = {};
	
	cin >> a;
	cin >> b;
	cin >> c;
	mul = a * b * c;
	
	while(mul != 0){
		test[mul % 10]++;
		mul = mul / 10;
	}
	
	for (int i = 0; i < 10; i++){
		cout << test[i] << endl;
	}
	return 0;
}