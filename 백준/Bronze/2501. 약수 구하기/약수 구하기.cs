using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] str = Console.ReadLine().Split(" ");
            int n = int.Parse(str[0]);
            int k = int.Parse(str[1]);
            int count = 0;
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
                if (count == k) {
                    answer = i;
                    break;
                }
            }

            if (count < k) {
                Console.WriteLine(0);
            } else {
                Console.WriteLine(answer);
            }

        }
    }
}

