#include <iostream>
#include <cstring>
using namespace std;

int main()
{
	int t;
	cin >> t;
	char a[21] = {};
	int r;
	for (int i = 0; i < t; i++)
	{
		cin >> r;
		cin >> a;
		for (int j = 0; j < strlen(a); j++)
		{
			for (int k = 0; k < r; k++)
			{
				cout << a[j];
			}
		}
		cout << "\n";
	}
}