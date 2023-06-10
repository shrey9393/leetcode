#include <iostream>
using namespace std;
int main()
{
    cout << "Butterfly pattern" << endl;
    int l;
    cin >> l;
    for (int i = 1; i <= l; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }
        int space = 2 * l - 2 * i;

        for (int j = 1; j <= space; j++)
        {
            cout << " ";
        }

        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }
        cout << endl;
        // Sleep(1000);
    }

    for (int i = l; i >= 1; i--)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }
        int space = 2 * l - 2 * i;
        for (int j = 1; j <= space; j++)
        {
            cout << " ";
        }
        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }
        cout << endl;
        // Sleep(1000);
    }
}