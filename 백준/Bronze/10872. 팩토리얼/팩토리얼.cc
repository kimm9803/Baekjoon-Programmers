#include <iostream>
using namespace std;

int main()
{
    int n;
    int fac;
    fac = 1;
    cin >> n;
    for (int i = n; i > 0; i--) {
        fac *= i;
    }
    cout << fac;
    return 0;
}