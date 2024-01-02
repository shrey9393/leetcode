#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        for (int i = 0; i < n; i++) {
            int x, y, r;
            cin >> x >> y >> r;

            if (i == 0) {
                cout << "1 clockwise" << endl;
            } else {
                double distance = sqrt(x * x + y * y);
                double ratio = static_cast<double>(r) / distance;

                if (abs(ratio - 1) < 1e-9) {
                    cout << "not moving" << endl;
                } else if (ratio > 1) {
                    int gcd = __gcd(r, static_cast<int>(distance));
                    cout << r / gcd << "/" << static_cast<int>(distance) / gcd << " clockwise" << endl;
                } else {
                    int gcd = __gcd(r, static_cast<int>(distance));
                    cout << r / gcd << "/" << static_cast<int>(distance) / gcd << " counterclockwise" << endl;
                }
            }
        }
    }

    return 0;
}
