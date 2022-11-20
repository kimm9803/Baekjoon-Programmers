#include <iostream>
#include <string>
using namespace std;

int main()
{
	string a, b;
	string na, nb;
	cin >> a >> b;
	
	for (int i = 2; i >= 0; i--) {
		na += a[i];
		nb += b[i];
	}
	if (na > nb)	cout << na;
	else	cout << nb;
	return 0;
}